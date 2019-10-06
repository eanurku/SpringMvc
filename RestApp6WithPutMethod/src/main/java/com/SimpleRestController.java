package com;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/students/{name}" ,method = RequestMethod.GET)
    public Student getStudents(@PathVariable("name") String sname){

        //fetch student related data from DB and then populate the object .
        Student student=new Student();
        student.setSname(sname);

        return student;

    }

    @RequestMapping(value = "/updateStudent/{name}",method = RequestMethod.PUT)
    public boolean updateData(@PathVariable("name") String sname, @RequestBody Student student){

        //search DB for this  row with the given name
        System.out.println("student name:"+sname);

        //now update the DB row data  with latest values
        System.out.println("student details to update:"+student);

        return true;
    }
}
