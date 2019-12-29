package com;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public Student getStudents(){

        Student student = new Student("gonu", 32);

        return student;

    }
}
