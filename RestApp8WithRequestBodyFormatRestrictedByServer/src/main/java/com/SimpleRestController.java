package com;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/updatestudent/{name}" ,method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public Boolean updateMethod(@PathVariable("name") String studentName, @RequestBody Student student){

        //search Db for name
        System.out.println("student name"+studentName);

        //update Db with name data
        System.out.println("request data"+student);
        return true;
    }
}
