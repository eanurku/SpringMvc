package com;


import com.sun.org.apache.xpath.internal.operations.Bool;
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
        Random rand = new Random();
        int value = rand.nextInt(4);

        switch (value) {
            case 0:
                return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);//404
            case 1:
                return new ResponseEntity<Boolean>(false, HttpStatus.NOT_ACCEPTABLE);//406
            case 2:
                return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);//400
            case 3:
                return new ResponseEntity<Boolean>(false, HttpStatus.REQUEST_TIMEOUT);//408

        }
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }


    @RequestMapping(value = "/updatestudent1/{name}", method = RequestMethod.PUT)
    public ResponseEntity<Void> updateMethod2(@PathVariable("name") String studentName, @RequestBody Student student) {


        System.out.println("student name :" + studentName);
        System.out.println("student details :" + student);
        Random rand = new Random();
        int value = rand.nextInt(4);

        switch (value) {
            case 0:
                return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);//404
            case 1:
                return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);//406
            case 2:
                return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);//400
            case 3:
                return new ResponseEntity<Void>(HttpStatus.REQUEST_TIMEOUT);//408
        }
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}
