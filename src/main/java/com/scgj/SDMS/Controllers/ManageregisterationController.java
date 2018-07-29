package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.ManageRegistration;
import com.scgj.SDMS.Services.ManageRegisterationService;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ManageregisterationController {

    @Autowired
    private ManageRegisterationService manageRegisterationService;

    @RequestMapping(value = "/get-manage-registeration")
    public ModelAndView getRegisteration()
    {
        ModelAndView modelAndView = new ModelAndView("ManageRegisteration");
        List<ManageRegistration> list = manageRegisterationService.getRegisteration();
        modelAndView.addObject("data",list);

        List<ManageRegistration> approvelist = manageRegisterationService.getApprove();
        modelAndView.addObject("data1",approvelist);

        List<ManageRegistration> rejectlist = manageRegisterationService.getReject();
        modelAndView.addObject("data2",rejectlist);

        return modelAndView;
    }

    @RequestMapping(value = "/approve")
    public ModelAndView approve(@RequestParam int item)
    {

        System.out.println("hi");
        ModelAndView modelAndView = new ModelAndView("ManageRegisteration");
        manageRegisterationService.approve(item);
        List<ManageRegistration> list = manageRegisterationService.getRegisteration();
        modelAndView.addObject("data",list);

        List<ManageRegistration> approvelist = manageRegisterationService.getApprove();
        modelAndView.addObject("data1",approvelist);

        List<ManageRegistration> rejectlist = manageRegisterationService.getReject();
        modelAndView.addObject("data2",rejectlist);
        return modelAndView;

    }

    @RequestMapping(value = "/reject/{item}")
    public ModelAndView reject(@RequestParam int item)
    {

        ModelAndView modelAndView = new ModelAndView("ManageRegisteration");
        manageRegisterationService.reject(item);
        List<ManageRegistration> list = manageRegisterationService.getRegisteration();
        modelAndView.addObject("data",list);

        List<ManageRegistration> approvelist = manageRegisterationService.getApprove();
        modelAndView.addObject("data1",approvelist);

        List<ManageRegistration> rejectlist = manageRegisterationService.getReject();
        modelAndView.addObject("data2",rejectlist);
        return modelAndView;
    }


}
