package com.homeplace.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeplace.entity.Contacts;
import com.homeplace.entity.Contractors;
import com.homeplace.entity.Users;
import com.homeplace.repository.ContactsRepository;

@Service
public class ContactsService {
	@Autowired
	ContactsRepository contactsRepository;
	
	public List<Contacts> listAllContacts(){
		return contactsRepository.findAll();		
	}
	
	public void addContacts(Contacts contact) {
		contact.setUser(contact.getUser());		
		contact.setContractor(contact.getContractor());
		contactsRepository.save(contact);
	}
	
	public Contacts listContactsByEmail(Users user) {
		return contactsRepository.findContactsByEmail(user.getEmail());		
		
	}
	
//	public void deleteContactsById(Contacts contacts) {
//		contactsRepository.deleteContactsByContactsId(contacts.getContactsId());
//	}
	
//	public Contractors listContractorsByEmail(String email) {
//		return contactsRepository.findContractorsbyUserEmail(email);
//	}
	
	
	
//	  public void addContact(Users user, Contractors contractor) {
//	  contactsRepository.saveUserEmail(user.getEmail());
//	  contactsRepository.saveContractorId(contractor.getContractorId()); 
//	  }
//
//	public void addContact(String email, int contractorId) {
//		// TODO Auto-generated method stub
//		
//	}
	 
	
	

}
