package com.careerinfotech.usermanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerinfotech.usermanagement.entity.City;

@Repository
public interface CitiesDao extends JpaRepository<City, Long>{

	List<City> findByStatesId(Long statesId);

}
