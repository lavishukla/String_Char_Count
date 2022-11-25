package com.nt.service;

import java.util.List;

import com.nt.binding.ContactBinding;

public interface IContactService {

	public String saveContact(ContactBinding cb);
	
	public List<ContactBinding> viewContacts();
	
	public ContactBinding editContact(Integer id);
	
	public List<ContactBinding> delContact(Integer id);
}
