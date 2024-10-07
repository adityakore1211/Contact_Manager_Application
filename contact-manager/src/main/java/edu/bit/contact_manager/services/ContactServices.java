package edu.bit.contact_manager.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.contact_manager.entity.Contacts;
import edu.bit.contact_manager.repository.ContactRepository;



@Service

public class ContactServices {

	@Autowired
	ContactRepository repository;
	
	public Contacts addContact(Contacts contact) {
		return repository.save(contact);
		
	}


	public List<Contacts> findAllContacts() {
		return repository.findAll();
	}


	public Contacts updateUser(Contacts contact) {	
		return repository.save(contact);
	}


	public Contacts findUserById(int id) {
	      Optional<Contacts> contact= repository.findById(id);
	      if(contact.isPresent()) {
	    	  return contact.get();
	      }else {
	    	  return null;
	      }
	}


	public Contacts deleteContact(int id) {
		Contacts contact=repository.findById(id).get();
		repository.deleteById(id);	
		return contact;
	}
	

}
	