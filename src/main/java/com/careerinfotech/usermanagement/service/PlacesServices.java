package com.careerinfotech.usermanagement.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerinfotech.usermanagement.entity.City;
import com.careerinfotech.usermanagement.entity.Country;
import com.careerinfotech.usermanagement.entity.States;
import com.careerinfotech.usermanagement.repository.CitiesDao;
import com.careerinfotech.usermanagement.repository.CountriesDao;
import com.careerinfotech.usermanagement.repository.StatesDao;

@Service
public class PlacesServices {
	
	List<Long> listOfCountries = new ArrayList<>();
	Map<Long, String> listOfStates = new HashMap<>();
	Map<Long, String> listOfCities  = new HashMap<>();
	
	
	@Autowired
	private CountriesDao country;
	
	@Autowired
	private StatesDao state;
	
	@Autowired
	private CitiesDao city;
	
	public List<Country> countryName() {
		List<Country> findCountry = country.findAll();
		return findCountry;
	}
	
	
	public Map<Long, String> stateName(Long countryId) {
		List<States> findAll = state.findByCountryId(countryId);
		Map<Long, String> stateMap = new HashMap<>();
		for(States state: findAll) {
			stateMap.put(state.getStatesId(), state.getStatesName());
		}
		return stateMap;
	}
	
	
	public Map<Long, String> cityName(Long statesId) {
		List<City> findAllCity=city.findByStatesId(statesId);
		Map< Long, String> cityMap = new HashMap<>();
		for(City citi :findAllCity) {
			cityMap.put(citi.getCityId(),citi.getCityName());
		}
		return cityMap;
	}

}
