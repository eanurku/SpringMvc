package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public ModelAndView testMethod(){

        ModelAndView modelview =new ModelAndView("hellopage");
        modelview.addObject("msg","welcome");
        return modelview;
    }


    @RequestMapping(value = "/admissionForm.html",method = RequestMethod.GET)
    public ModelAndView admissionMethod(){

        ModelAndView modelview =new ModelAndView("admissionForm");
        return modelview;
    }

    @RequestMapping(value = "/submitAdmissionForm.html",method = RequestMethod.POST)
    public ModelAndView submitMethod(@RequestParam Map<String,String> requestParams){


        ModelAndView modelview =new ModelAndView("admissionSuccess");
        modelview.addObject("studentname",requestParams.get("sname"));
        modelview.addObject("studentrollno",requestParams.get("srollno"));

        return modelview;
    }
}
