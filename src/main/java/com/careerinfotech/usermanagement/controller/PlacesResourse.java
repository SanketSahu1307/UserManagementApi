package com.careerinfotech.usermanagement.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerinfotech.usermanagement.entity.City;
import com.careerinfotech.usermanagement.entity.Country;
import com.careerinfotech.usermanagement.entity.States;
import com.careerinfotech.usermanagement.service.PlacesServices;

@RestController
@RequestMapping("/places")
public class PlacesResourse {
	
	
	@Autowired
	private PlacesServices pServ;
	
	@GetMapping("/country/{id}")
	public List<Country> getCountries(Long id) {
		List<Country> countryName = pServ.countryName();
		return countryName;
	}
	
	@GetMapping("/states/{countryId}")
	public Map<Long, String> getStates(@PathVariable("countryId")Long countryId) {
		Map<Long, String> stateName = pServ.stateName(countryId);
		return stateName;
	}
	
	@GetMapping("/cities/{statesId}")
	public Map<Long, String> getCities(@PathVariable("statesId")Long statesId) {
		Map<Long, String> cityName = pServ.cityName(statesId);
		return cityName;
	}

}
