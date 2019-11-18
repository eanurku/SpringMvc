package com;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/tests", produces = MediaType.APPLICATION_XML_VALUE,method = RequestMethod.GET)
    public List<Student> getStudents() {

        List<Student> list = new ArrayList<>();
        list.add(new Student("monu", 23));
        list.add(new Student("gonu", 32));

        return list;
    }

    @RequestMapping(value = "/employeelist", method = RequestMethod.GET)
    public List<Employee> getStudent() {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(23,"anurag"));
        list.add(new Employee(25,"monu"));
        return list;
    }
    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee getEmployee() {

        return new Employee(23,"anurag");
    }


    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public ResponseEntity<Boolean> updateMethod( @RequestBody Student student) {


        System.out.println("student details for creating record:" + student);


        return new ResponseEntity<Boolean>(true, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/addStudent1", method = RequestMethod.POST)
    public ResponseEntity<Boolean> updateMethod1( @RequestBody Student student) {

        System.out.println("student details for creating record:" + student);


        HttpHeaders headers=new HttpHeaders();
        headers.add("location", ServletUriComponentsBuilder.fromCurrentRequest().path("/{name1}").buildAndExpand(student.getSname()).toUri().toString());
        return new ResponseEntity<Boolean>(true,headers, HttpStatus.CREATED);
    }

}
