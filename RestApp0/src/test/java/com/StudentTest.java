package com;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {


    @Test
    public void testsname(){

        Student st=new Student("monu",123);

        Assert.assertEquals("monu",st.getSname());

    }
}
