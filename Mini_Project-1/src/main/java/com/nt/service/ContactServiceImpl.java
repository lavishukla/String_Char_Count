package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.binding.ContactBinding;
import com.nt.entities.Contact;
import com.nt.repository.ContactRepository;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public String saveContact(ContactBinding cb) {
		Contact entity = new Contact();
		BeanUtils.copyProperties(cb, entity);
		entity = contactRepo.save(entity);
		if(entity.getContactId()!=null) {
			return "Contact Successfully Saved.!";
		}else
		return "Failed to save Contact.!";
	}

	@Override
	public List<ContactBinding> viewContacts() {
		List<ContactBinding> dataList = new ArrayList<ContactBinding>();
		
		List<Contact> findAll = contactRepo.findAll();
		findAll.forEach(entity->{
			ContactBinding form = new ContactBinding();
			BeanUtils.copyProperties(entity, form);
			dataList.add(form);
		});
		return dataList;
	}

	@Override
	public ContactBinding editContact(Integer id) {
		Optional<Contact> FindById = contactRepo.findById(id);
		if(FindById.isPresent()) {
			Contact entity = FindById.get();
			ContactBinding form = new ContactBinding();
			BeanUtils.copyProperties(entity, form);
		}
		return null;
	}

	@Override
	public List<ContactBinding> delContact(Integer id) {
		contactRepo.deleteById(id);
		return viewContacts();
	}

}
