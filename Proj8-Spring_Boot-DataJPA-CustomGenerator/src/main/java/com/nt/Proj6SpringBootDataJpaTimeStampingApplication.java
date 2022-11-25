package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Student;
import com.nt.repository.StudentRepository;

@SpringBootApplication
public class Proj6SpringBootDataJpaTimeStampingApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(Proj6SpringBootDataJpaTimeStampingApplication.class, args);
	StudentRepository StudentRepo = context.getBean(StudentRepository.class);
	
	Student st = new Student();
	st.setName("Ranjeet");
	st.setCity("Bihar");
	
	StudentRepo.save(st);
	System.out.println("Record Successfully Inserted..!!");
	}

}
