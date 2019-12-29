package com;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObjectMain {
    public static void main(String[] args) throws Exception {

        String jsonString="{\n" +
                "  \"student_name\" : \"abc\",\n" +
                "  \"smobileno\" : 34234\n" +
                "}\n";

        ObjectMapper mapper=new ObjectMapper();
        Student student = mapper.readValue(jsonString, Student.class);

        System.out.println(student);
    }
}
