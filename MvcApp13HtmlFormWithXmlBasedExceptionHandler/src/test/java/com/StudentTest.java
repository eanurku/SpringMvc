package com;

import com.Student;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class StudentTest {
    @Test
    public void testgetname(){

        Student student = new Student();
        student.setSname("monu");
        LocalDateTime localdatetime=LocalDateTime.now();
        System.out.println(localdatetime);
        if(localdatetime.toLocalTime().compareTo(LocalTime.parse("11:40:00"))>0 && localdatetime.toLocalTime().compareTo(LocalTime.parse("12:50:00"))<0){
            System.out.println("off hours");
        }

        Assert.assertEquals("monu",student.getSname());


    }
}
