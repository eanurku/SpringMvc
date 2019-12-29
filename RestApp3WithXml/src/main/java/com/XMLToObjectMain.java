package com;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XMLToObjectMain {
    public static void main(String[] args) throws JAXBException {
        String xmlString =  "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                            "<student id=\"234\">\n" +
                            "<name>abc</name>\n" +
                            "<smobileno>34567</smobileno>\n" +
                            "</student>\n";

        JAXBContext context=JAXBContext.newInstance(Student.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        Student student = (Student)unmarshaller.unmarshal(new StringReader(xmlString));
        System.out.println(student);



    }
}
