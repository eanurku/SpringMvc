package com;

import com.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testgetname(){

        Student student = new Student();
        student.setSname("monu");
        Assert.assertEquals("monu",student.getSname());
    }
}
