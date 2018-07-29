package com.scgj.SDMS.Services;

import com.scgj.SDMS.Models.ManageRegistration;
import com.scgj.SDMS.Repository.ManageRegisterationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManageRegisterationService {

    @Autowired
    private ManageRegisterationRepository manageRegisterationRepository;

    public List<ManageRegistration> getRegisteration() {
        List<ManageRegistration> list = new ArrayList<>();
        manageRegisterationRepository.findAllByPendingStatus().forEach((e)->list.add(e));
        return list;
    }

    public List<ManageRegistration> getApprove() {
        List<ManageRegistration> approvelist = new ArrayList<>();
        manageRegisterationRepository.findAllByApproveStatus().forEach((e)->approvelist.add(e));
        return approvelist;
    }

    public List<ManageRegistration> getReject() {
        List<ManageRegistration> rejectlist = new ArrayList<>();
        manageRegisterationRepository.findAllByRejectStatus().forEach((e)->rejectlist.add(e));
        return rejectlist;
    }

    public ModelAndView approve(int item) {
       return  manageRegisterationRepository.alterStatus(item);

    }

    public ModelAndView reject(int item) {
        return manageRegisterationRepository.rejectStatus(item);
    }
}
