package com;

import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class RestClientApp5 {

    public static void main(String[] args) {

        String url="http://localhost:8080///RestAppWithPathVariable/students/{name}";
        RestTemplate template =new RestTemplate();

        Map<String,String> params=new HashMap<>();
        params.put("name","anuragkumar");
        Student student = template.getForObject(url, Student.class,params);

        System.out.println(student);


    }
}
