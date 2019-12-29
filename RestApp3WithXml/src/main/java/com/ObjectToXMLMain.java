package com;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class ObjectToXMLMain {

    public static void main(String[] args) throws JAXBException {


        Student  student=new Student();
        student.setSname("abc");
        student.setSid(234);
        student.setSmobileno(34567L);

        JAXBContext context=JAXBContext.newInstance(Student.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);

        StringWriter xmlString=new StringWriter();
        marshaller.marshal(student,xmlString);

        System.out.println(xmlString);




    }
}
