package com.careerinfotech.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class States {

	@Id
	private Long statesId;
	private String statesName;
	private Long countryId;
	
	public States() {
		// TODO Auto-generated constructor stub
	}

	public Long getStatesId() {
		return statesId;
	}

	public void setStatesId(Long statesId) {
		this.statesId = statesId;
	}

	public String getStatesName() {
		return statesName;
	}

	public void setStatesName(String statesName) {
		this.statesName = statesName;
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public States(Long statesId, String statesName, Long countryId) {
		super();
		this.statesId = statesId;
		this.statesName = statesName;
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "States [statesId=" + statesId + ", statesName=" + statesName + ", countryId=" + countryId + "]";
	}

	
	

	
}
