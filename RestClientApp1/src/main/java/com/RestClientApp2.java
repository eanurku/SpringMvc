package com;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class RestClientApp2 {
    public static void main(String[] args) {

        String url="http://localhost:8080//RestApp10WithPostMethod/test";

        HttpHeaders header=new HttpHeaders();
        header.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity=new HttpEntity<>("parameters",header);

        RestTemplate template =new RestTemplate();
        ResponseEntity<String> output = template.exchange(url, HttpMethod.GET, entity, String.class);


        System.out.println(output);
    }
}
