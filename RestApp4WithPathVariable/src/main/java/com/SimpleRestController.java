package com;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/students/{name}" ,method = RequestMethod.GET)
    public Student getStudents(@PathVariable("name") String studentName){


       Student student =new Student();
       student.setSname(studentName);

        return student;

    }
}
