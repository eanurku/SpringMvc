package com;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public List<Student> getStudents(){

        List<Student> list=new ArrayList<>();
        list.add(new Student("monu",23));
        list.add(new Student("gonu",32));

        return list;

    }
}
