package com.homeplace.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.homeplace.entity.Contacts;
import com.homeplace.entity.Contractors;
import com.homeplace.entity.Users;
import com.homeplace.service.ContactsService;

@Controller
public class ContactsController {

	@Autowired
	ContactsService contactsService;
	
//	@GetMapping("/list-contacts")
//	public ModelAndView contactListing(Model model) {
//		return new ModelAndView("list-contacts", "contacts", new Contacts());
//	}
//	
	@GetMapping("/list-contacts")
	public String contactListing(Model model) {
	List<Contacts> contactList = contactsService.listAllContacts();
	model.addAttribute("contactsList", contactList);
		return "list-contacts";
	}
	
	

//	@PostMapping("/list-contacts")
//	public String listAllContacts(Model model) {
//		List<Contacts> contactList = contactsService.listAllContacts();
//		model.addAttribute("contactsList", contactList);
//		return "contactsResults";
//
//	}
	
//	@PostMapping("/list-contacts")
//	public void deleteContact(Contacts contactsId) {
//		contactsService.deleteContactsById(contactsId);		
//	}
	
//	@GetMapping("/list-contacts")
//	public String listContractorsbyEmail(Users users) {
//		@SuppressWarnings({ "unchecked", "unused" })
//		List<Contractors> contractorList = (List<Contractors>) contactsService.listContractorsByEmail(users.getEmail());
//		return "list-contacts";
//	}

	@PostMapping("/add-contacts")
	public String addNewContact(Model model, @ModelAttribute("contractors") Contractors contractors, @ModelAttribute("users") Users users, HttpSession session) {
//		Contacts contactTemp = new Contacts();	
		
		return "add-contacts";
	}

}
