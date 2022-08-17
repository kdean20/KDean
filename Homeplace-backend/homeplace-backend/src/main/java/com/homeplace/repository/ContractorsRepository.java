package com.homeplace.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.homeplace.entity.Contractors;


@Repository
public interface ContractorsRepository extends JpaRepository<Contractors, Integer> {
	
//	@Query("SELECT C from Contractors C Join Services S on C.services.get(serviceId) = S.serviceId WHERE C.services.get(serviceId) =?1")
//		List<Contractors> findContractors(int serviceId);
	
//	@Query("SELECT C from Contractors Join Services S on C.serviceId = S.serviceId where C.city LIKE ?1% and C.state =?2 and S.serviceName = ?3")
//	List<Contractors> findContractorsByCityState(String city, String state, String serviceName);
	
//	@Query("Select C from Contractors C JOIN Contacts S on C.contractor_id = S.contractor.contractor_id where S.user.user_email = ?1")
//	Contractors findContractorsbyUserEmail(String email);
	
	
	@Query("SELECT C FROM Contractors C where C.city= ?1 and state =?2 and service_id = ?3")
	List<Contractors> findContractorsByCityState(String city ,String state, int service_id);


}
