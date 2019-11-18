package com;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClientApp6 {
    public static void main(String[] args) {


        String url="http://localhost:8080//RestApp10WithPostMethod/addStudent";
        Student student=new Student();

        RestTemplate template=new RestTemplate();
        ResponseEntity<Boolean> out = template.postForEntity(url, student, Boolean.class);
        System.out.println(out);
        
    }
}
