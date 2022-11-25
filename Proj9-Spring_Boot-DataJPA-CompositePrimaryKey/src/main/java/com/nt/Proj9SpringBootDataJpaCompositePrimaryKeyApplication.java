package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.AccountService;

@SpringBootApplication
public class Proj9SpringBootDataJpaCompositePrimaryKeyApplication {

	// Contains More than one primary key then it is know as Composite Primary key
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj9SpringBootDataJpaCompositePrimaryKeyApplication.class, args);
		
		AccountService accountService = context.getBean(AccountService.class);
		//accountService.saveAccData();
		accountService.getDataUsingPK();
		
		((ConfigurableApplicationContext) context).close();
	}

}
