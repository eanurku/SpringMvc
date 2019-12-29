package com;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public ResponseEntity<Student> getStudents(){


        Student student = new Student("monu", 23);


        return new ResponseEntity<Student>(student,HttpStatus.OK);

    }
}
