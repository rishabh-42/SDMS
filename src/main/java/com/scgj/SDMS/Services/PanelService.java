package com.scgj.SDMS.Services;

import com.scgj.SDMS.Repository.CoursePanelRepository;
import com.scgj.SDMS.Repository.PanelRepository;
import com.scgj.SDMS.Repository.StudentPanelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanelService {

    @Autowired
    private PanelRepository panelRepository;

    @Autowired
    private StudentPanelRepository studentPanelRepository;

    @Autowired
    private CoursePanelRepository coursePanelRepository;


    public long getTeachers() {
        return panelRepository.count();
    }

    public long getStudents() {
        return studentPanelRepository.count();
    }

    public long getCourses() {
        return coursePanelRepository.count();
    }
}
