package com.careerinfotech.usermanagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class City {

	@Id
	private Long cityId;
	private String cityName;
	private Long statesId;

	public City() {
		// TODO Auto-generated constructor stub
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public Long getStatesId() {
		return statesId;
	}

	public void setStatesId(Long statesId) {
		this.statesId = statesId;
	}

	public City(Long cityId, String cityName, Long statesId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.statesId = statesId;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", statesId=" + statesId + "]";
	}
	
	
}
