package com;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ModelAndView testMethod1() {

        ModelAndView modelview = new ModelAndView("hellopage");
        modelview.addObject("msg", "welcome");
        if (true) {
            throw new ArithmeticException("arithmetic exception occured");
        }
        return modelview;
    }
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public ModelAndView testMethod2() {

        ModelAndView modelview = new ModelAndView("hellopage");
        modelview.addObject("msg", "welcome");
        if (true) {
            throw new ArrayIndexOutOfBoundsException("array index out of bound  exception  occured");
        }
        return modelview;
    }


    @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
    public ModelAndView admissionMethod() {

//        if (true) {
//            throw new NullPointerException("null pointer exception occured while filling form");
//        }
        ModelAndView modelview = new ModelAndView("admissionForm");
        return modelview;
    }


    @InitBinder
    public void initmethod(WebDataBinder databinder) {
        databinder.setDisallowedFields(new String[]{"sid", "sskills", "saddress.pin"});

        databinder.registerCustomEditor(Date.class, "sdob", new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), false));
        //databinder.registerCustomEditor(String.class,"sname",new StudentNameEditor());
    }


    @ModelAttribute
    public void addCommonObject(Model model) {

        model.addAttribute("headermsg", "this is header msg");
    }

    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitMethod(@Valid @ModelAttribute("student") Student student, BindingResult results) {

        System.out.println(student);
        if (results.hasErrors()) {
            return new ModelAndView("admissionForm");
        }
        ModelAndView modelview = new ModelAndView("admissionSuccess");

        return modelview;
    }
}
