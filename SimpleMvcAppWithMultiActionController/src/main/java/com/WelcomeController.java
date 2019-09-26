package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/university")
public class WelcomeController  {


    @RequestMapping("/welcome")
    public ModelAndView welcomeMethod(){

        ModelAndView modelandview = new ModelAndView("hellopage");

        modelandview.addObject("welcomemessage","Hi welcome to annotation based controller class");

        return modelandview;
    }

    @RequestMapping("/thanks")
    public ModelAndView thanksMethod(){

        ModelAndView modelandview = new ModelAndView("hellopage");

        modelandview.addObject("welcomemessage","Thanks for visiting my website");

        return modelandview;
    }

}
