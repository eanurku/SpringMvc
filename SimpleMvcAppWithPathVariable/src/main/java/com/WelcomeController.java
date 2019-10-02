package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/university")
public class WelcomeController  {


    @RequestMapping("/welcome/{sname}/{rollno}")
    public ModelAndView welcomeMethod(@PathVariable("sname") String name,@PathVariable("rollno") int rollno){

        ModelAndView modelandview = new ModelAndView("hellopage");

        modelandview.addObject("msg","welcome ");
        modelandview.addObject("name",name);
        modelandview.addObject("roll",rollno);

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
