package com.careerinfotech.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerinfotech.usermanagement.entity.Country;

@Repository
public interface CountriesDao extends JpaRepository<Country, Long>{

}
