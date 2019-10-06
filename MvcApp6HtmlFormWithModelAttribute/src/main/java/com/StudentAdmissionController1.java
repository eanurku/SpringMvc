package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/university")
public class StudentAdmissionController1 {

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
    public ModelAndView submitMethod(@RequestParam("sname") String name,@RequestParam("sid") String id ){


        ModelAndView modelview =new ModelAndView("admissionSuccess");

        Student student=new Student();
        student.setSid(Integer.parseInt(id));
        student.setSname(name);

        modelview.addObject("student",student);

        return modelview;
    }

}
