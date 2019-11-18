package com;

import org.springframework.web.client.RestTemplate;

public class RestClientApp4 {
    public static void main(String[] args) {

        String url="http://localhost:8080//RestApp10WithPostMethod/employee";
        RestTemplate template=new RestTemplate();

        Employee employee = template.getForObject(url, Employee.class);
        System.out.println(employee);
    }
}
