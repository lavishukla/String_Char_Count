package com.nt.converter;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.nt.bindings.Student;

public class UnMarshelling {

	public static void main(String[] args) throws Exception{
		
		JAXBContext instance = JAXBContext.newInstance(Student.class);
		Unmarshaller unMarshaller = instance.createUnmarshaller();
		Object obj = unMarshaller.unmarshal(new File("student.xml"));
		Student student = (Student)obj;
		System.out.println(student);
	}

}