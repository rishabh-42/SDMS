package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Services.PanelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PanelController {

    @Autowired
    private PanelService panelService;

    @RequestMapping(value = "/get-panel")
    public ModelAndView noOfTeachers() {
        ModelAndView modelAndView = new ModelAndView("ScgjDashboard");
        long teachers = panelService.getTeachers();
        modelAndView.addObject("data1",teachers);
        long students = panelService.getStudents();
        modelAndView.addObject("data2",students);
        long course = panelService.getCourses();
        modelAndView.addObject("data3",course);
        return modelAndView;
    }

}
