package com;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.List;


@Controller
public class HelloController {

    @RequestMapping("/welcome")
    public ModelAndView welcomePage()  {

        ModelAndView modelview = new ModelAndView("hellopage");
        modelview.addObject("welcomemessage","Hi Guys, Welcome to my first page");

        return modelview;
    }

    @ResponseBody
    @RequestMapping(value = "/students" ,method = RequestMethod.GET )
    public List<Student> getStudents(){

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"monu"));
        studentList.add(new Student(2,"gonu"));

        return studentList;
    }

    @ResponseBody
    @RequestMapping(value = "/test" ,method = RequestMethod.GET )
    public String test(){
        return "hello world";

    }
}
