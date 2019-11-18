package com;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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
