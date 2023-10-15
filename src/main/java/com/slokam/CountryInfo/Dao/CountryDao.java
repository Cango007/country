package com.slokam.CountryInfo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slokam.CountryInfo.Entity.Country;
@Repository
public interface CountryDao extends JpaRepository<Country, Integer> {
	
	

	public List<Country> findByCountryName(String countryName);

}
