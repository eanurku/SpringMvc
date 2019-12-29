package com;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJsonMain {

    public static void main(String[] args) throws JsonProcessingException {


        ObjectMapper objectMapper = new ObjectMapper();

        Student student =new Student();
        student.setSid(12);
        student.setSname("abc");
        student.setSmobileno(34234L);

        String jsonString1=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
        String jsonString2=objectMapper.writeValueAsString(student);
        System.out.println(jsonString1);


    }
}
