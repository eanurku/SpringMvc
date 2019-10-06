package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

@Controller
public class SimpleRestController1 {

    @ResponseBody
    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public List<Student> getStudents(){

        List<Student> studentList=new ArrayList<Student>();
        studentList.add(new Student("monu",123));
        studentList.add(new Student("gonu",132));

        return studentList;
    }
}
