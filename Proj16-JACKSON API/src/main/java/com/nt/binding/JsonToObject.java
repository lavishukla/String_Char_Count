package com.nt.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject {

	public static void main(String[] args) throws Exception
	{
		
		ObjectMapper mapper = new ObjectMapper();
		Student student = mapper.readValue(new File("student.json"), Student.class);
		System.out.println(student);
	}

}
