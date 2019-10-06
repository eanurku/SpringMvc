package com;


import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class SimpleRestController {


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Student> getStudents() {

        List<Student> list = new ArrayList<>();
        list.add(new Student("monu", 23));
        list.add(new Student("gonu", 32));

        return list;

    }

    @RequestMapping(value = "/updatestudent/{name}", method = RequestMethod.PUT)
    public ResponseEntity<Boolean> updateMethod(@PathVariable("name") String studentName, @RequestBody Student student) {


        System.out.println("student name :" + studentName);
        System.out.println("student details :" + student);

        HttpHeaders headers=new HttpHeaders();
        headers.add("key1","value1");
        headers.add("key2","value2");

        return new ResponseEntity<Boolean>(true,headers, HttpStatus.OK);
    }

}
