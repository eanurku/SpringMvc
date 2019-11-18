package com;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;


public class RestClientApp3 {
    public static void main(String[] args) {

        String url="http://localhost:8080//RestApp10WithPostMethod/employeelist";

        RestTemplate template= new RestTemplate();
        ResponseEntity<List<Employee>> response = template.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Employee>>() {
                });

        List<Employee> employees=response.getBody();
        System.out.println(employees);
    }
}
