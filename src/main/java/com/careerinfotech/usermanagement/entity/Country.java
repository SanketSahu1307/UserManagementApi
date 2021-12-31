package com.careerinfotech.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {

	@Id
	private Long countryId;
	private String countryName;
//	private UserProfile user_id;

	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Long getcountryId() {
		return countryId;
	}

	public void setcountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

//	public UserProfile getUser_id() {
//		return user_id;
//	}
//
//	public void setUser_id(UserProfile user_id) {
//		this.user_id = user_id;
//	}

	public Country(Long countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", user_id=" + "]";
	}

	
	
}
