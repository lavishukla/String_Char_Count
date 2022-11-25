package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.binding.Student;

@org.springframework.web.bind.annotation.RestController
public class RestController 
{
	@GetMapping(
			value="/student/{sid}",
			produces="application/json"
		)
	public ResponseEntity<Student> getStudentInfo(@PathVariable Integer sid)
	{
		Student stud = new Student();
		stud.setId(sid);
		stud.setName("Shashank");
		stud.setCity("Hyderabad");
		stud.setCollege("ITS");
		return new ResponseEntity<>(stud, HttpStatus.OK);
	}
}
