package com.homeplace.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contacts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contacts_id")
	private int contactsId;
	
	@ManyToOne
	@JoinColumn(name="user_email")
	private Users user;
	
	@ManyToOne
	@JoinColumn(name="contractor_id")
	private Contractors contractor;
	
	@Column(name="notes")
	private String notes;
	
	public Contacts() {
		
	}
	
	public Contacts(int contactsId, Users user, Contractors contractor, String notes) {
		this.contactsId = contactsId;
		this.user = user;
		this.contractor = contractor;
		this.notes = notes;
	}	
	
	public int getContactsId() {
		return contactsId;
	}
	public void setContactsId(int contactsId) {
		this.contactsId = contactsId;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public Contractors getContractor() {
		return contractor;
	}
	public void setContractor(Contractors contractor) {
		this.contractor= contractor;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	

}
