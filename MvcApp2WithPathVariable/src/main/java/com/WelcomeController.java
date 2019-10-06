package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
@RequestMapping("/university")
public class WelcomeController  {


    @RequestMapping("/welcome/{sname}/{rollno}")
    public ModelAndView welcomeMethod(@PathVariable Map<String,String> pathVars){

        ModelAndView modelandview = new ModelAndView("hellopage");

        modelandview.addObject("msg","welcome ");
        modelandview.addObject("name",pathVars.get("sname"));
        modelandview.addObject("roll",pathVars.get("rollno"));

        return modelandview;
    }

    @RequestMapping("/thanks/{sname}")
    public ModelAndView thanksMethod(@PathVariable("sname") String name){

        ModelAndView modelandview = new ModelAndView("thanks");

        modelandview.addObject("msg","Thanks for visiting my website");
        modelandview.addObject("name",name);


        return modelandview;
    }

}
