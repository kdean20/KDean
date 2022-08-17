package com.homeplace.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homeplace.entity.Contractors;
import com.homeplace.repository.ContractorsRepository;

@Service
public class ContractorsService {

	@Autowired
	ContractorsRepository contractorsRepository;

	public List<Contractors> listPlumbersByCityAndState(String city, String state, int service_id) {

		List<Contractors> plumbers = contractorsRepository.findContractorsByCityState(city, state, service_id);
		return plumbers;
	}

	public List<Contractors> listAll() {
		return contractorsRepository.findAll();
	}
	
//	public List<Contractors> listLandscapersById(int serviceId) {
//		List<Contractors> landscapers = contractorsRepository.findContractors(serviceId);
//		return landscapers;
//	}
//	
//	public List<Contractors> listCarpentersById(int serviceId){
//		List<Contractors> carpenters = contractorsRepository.findContractors(serviceId);
//		return carpenters;
//	}
//	
//	public List<Contractors> listPaintersById(int serviceId) {
//		List<Contractors> painters = contractorsRepository.findContractors(serviceId);
//		return painters;
//	}
//
}
