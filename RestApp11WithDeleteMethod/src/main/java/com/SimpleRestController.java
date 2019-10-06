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


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Student> getStudents() {

        List<Student> list = new ArrayList<>();
        list.add(new Student("monu", 23));
        list.add(new Student("gonu", 32));

        return list;
    }

    @RequestMapping(value = "/deleteStudent/{name}", method = RequestMethod.DELETE)
    public ResponseEntity<Boolean> updateMethod(@PathVariable("name") String sname) {


        System.out.println("deleting student " + sname);


        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }


}
