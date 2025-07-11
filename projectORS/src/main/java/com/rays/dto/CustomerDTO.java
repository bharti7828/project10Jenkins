package com.rays.dto;

import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table
public class CustomerDTO extends BaseDTO{
	
	@Column(name = "CLIENT_NAME", length = 50)
	private String clientName;
	
	@Column(name = "LOCATION", length = 50)
	private String location;
	
	@Column(name = "CONTACT_NUMBER")
	private Long contactNumber;
	
	@Column(name = "IMPORTANCE")
	private String importance;

	
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getImportance() {
		return importance;
	}
	public void setImportance(String importance) {
		this.importance = importance;
	}
	public String getKey() {
		return importance;
	}
	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return importance;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return "clientName";
	}

	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return clientName;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return clientName;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		// TODO Auto-generated method stub
		return null;
	}

}
