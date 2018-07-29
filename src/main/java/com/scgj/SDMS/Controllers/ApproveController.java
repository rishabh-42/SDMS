package com.scgj.SDMS.Controllers;

import com.scgj.SDMS.Models.Application;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApproveController {

    @RequestMapping(value = "/approve" , method = RequestMethod.POST)
    public void approve(@RequestBody Application id)
    {

    }

}
