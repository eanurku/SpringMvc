package com;

import org.springframework.web.client.RestTemplate;

public class RestClientApp {
    public static void main(String[] args) {


        RestTemplate resttmplate=new RestTemplate();
        String str=resttmplate.getForObject("http://localhost:8080//RestApp10WithPostMethod/addStudent",String.class);
        System.out.println(str);
    }
}
