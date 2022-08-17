package com.homeplace.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="services")
public class Services {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="service_id")
	private int serviceId;
	
	@Column(name="service_name")
	private String serviceName;
	
	@OneToMany
	@JoinColumn(name="service_id")
	private List<Contractors> contractors;
	
	public Services() {
		
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public List<Contractors> getContractors() {
		return contractors;
	}

	public void setContractors(List<Contractors> contractors) {
		this.contractors = contractors;
	}

	public Services(int serviceId, String serviceName) {
		this.serviceId = serviceId;
		this.serviceName = serviceName;
	}

}
