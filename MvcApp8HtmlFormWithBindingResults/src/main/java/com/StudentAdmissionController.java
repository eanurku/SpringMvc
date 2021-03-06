package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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


    @ModelAttribute
    public void addCommonObject(Model model){

        model.addAttribute("headermsg","this is header msg");
    }

    @RequestMapping(value = "/submitAdmissionForm.html",method = RequestMethod.POST)
    public ModelAndView submitMethod(@ModelAttribute("student") Student student, BindingResult results){

        if(results.hasErrors()){
            return new ModelAndView("admissionForm");
        }
        ModelAndView modelview =new ModelAndView("admissionSuccess");

        return modelview;
    }
}
