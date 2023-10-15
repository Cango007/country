package com.slokam.CountryInfo.Service;

import java.util.List;

import com.slokam.CountryInfo.Entity.Country;

public interface CountryService {
	
	
	public List<Country> findAllCountries();
	
	public Country saveCountry(Country country);
	
	public void updateCountry(Country country);
	
	public Country findBycountryId(Integer countryId);
	

	public void deleteBycountryId(Integer countryId);
	

	public List<Country> findByCountryName(String countryName);
	
	
	
	

}
