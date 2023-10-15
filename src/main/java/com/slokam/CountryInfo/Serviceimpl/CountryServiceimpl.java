package com.slokam.CountryInfo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.CountryInfo.Dao.CountryDao;
import com.slokam.CountryInfo.Entity.Country;
import com.slokam.CountryInfo.Service.CountryService;
@Service
public class CountryServiceimpl implements CountryService {
	
	@Autowired
	private CountryDao countryDao;

	@Override
	public List<Country> findAllCountries() {
		// TODO Auto-generated method stub
		return countryDao.findAll();
	}

	@Override
	public Country saveCountry(Country country) {
		// TODO Auto-generated method stub
		return countryDao.save(country);
	}

	@Override
	public void updateCountry(Country country) {
		// TODO Auto-generated method stub
		countryDao.save(country);
	}

	@Override
	public Country findBycountryId(Integer countryId) {
		// TODO Auto-generated method stub
		return countryDao.findById(countryId).get();
	}

	@Override
	public void deleteBycountryId(Integer countryId) {
		// TODO Auto-generated method stub
		countryDao.deleteById(countryId);
	}

	@Override
	public List<Country> findByCountryName(String countryName) {
		// TODO Auto-generated method stub
		return countryDao.findByCountryName(countryName);
	}

}
