package test.java.com;

import com.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testgetname(){

        Student student = new Student(1, "monu");
        Assert.assertEquals("monu",student.getSname());
    }
}
