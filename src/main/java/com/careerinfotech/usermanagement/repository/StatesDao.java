package com.careerinfotech.usermanagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.careerinfotech.usermanagement.entity.States;

@Repository
public interface StatesDao extends JpaRepository<States, Long>{

	List<States> findByCountryId(Long countryId);




}
