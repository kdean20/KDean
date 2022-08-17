package com.homeplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homeplace.entity.Contacts;
import com.homeplace.entity.Contractors;
import com.homeplace.entity.Users;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts,Integer> {
	
	
	@Query("Select C FROM Contacts C WHERE C.user.email = ?1")
	Contacts findContactsByEmail(String email);
	
//	@Query("Delete C FROM Contacts C WHERE C.contactsId = ?1")
//	Contacts deleteContactsByContactsId(int contactsId);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Query("SELECT S from Users S WHERE S.email =?1")
//	Users findUsersByEmail(String email);
//	
//	@Query("SELECT S from Contractors S WHERE S.contractorId =?1")
//	Contractors findContractorsByContractorId(int contractorId);
	
	
	
	
	
//	  public void saveUserEmail(String userEmail);
//	  
//	  public void saveContractorId(int contractorId);
//	 
	 
	
	

}
