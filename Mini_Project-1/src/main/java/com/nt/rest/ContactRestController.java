package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.binding.ContactBinding;
import com.nt.service.ContactServiceImpl;

@RestController
public class ContactRestController {

	@Autowired
	private ContactServiceImpl service;
	
	@PostMapping("/save")
	public String saveContact(@RequestBody ContactBinding cb) {
		service.saveContact(cb);
		return "Success";
	}
	
	@GetMapping("/view")
	public List<ContactBinding> viewContact(){
		return service.viewContacts();
	}
	
	@GetMapping("/edit/{id}")
	public ContactBinding editContact(@PathVariable Integer id) {
		return service.editContact(id);
	}
	
	@GetMapping("/del/{id}")
	public List<ContactBinding> delContact(@PathVariable Integer id){
		return service.delContact(id);
	}
}
