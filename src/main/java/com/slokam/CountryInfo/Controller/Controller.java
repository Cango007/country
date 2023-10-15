package com.slokam.CountryInfo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slokam.CountryInfo.Dao.CountryDao;
import com.slokam.CountryInfo.Entity.Country;
import com.slokam.CountryInfo.Service.CountryService;

@RestController
@RequestMapping("/country")
public class Controller {

	
	@Autowired
	private CountryDao countryDao;
	@Autowired
	private CountryService countryService;
@GetMapping("/findAllCountries")
	public List<Country> findAllCountries() {
		// TODO Auto-generated method stub
		return countryService.findAllCountries();
	}

	@PostMapping("/save")
	public Country saveCountry(@RequestBody Country country) {
		// TODO Auto-generated method stub
		return countryDao.save(country);
	}

@PutMapping("/update")
	public void updateCountry(@RequestBody Country country) {
		// TODO Auto-generated method stub
		countryDao.save(country);
	}

	@GetMapping("/findById/{countryId}")
	public Country findBycountryId(@PathVariable ("countryId") Integer countryId) {
		// TODO Auto-generated method stub
		return countryDao.findById(countryId).get();
	}

	@DeleteMapping("/deleteById/{countryId}")
	public void deleteBycountryId(@PathVariable("countryId") Integer countryId) {
		// TODO Auto-generated method stub
		countryDao.deleteById(countryId);
	}
	@GetMapping("/getByCountryName/{countryName}")
	public List<Country> findByCountryName(@PathVariable String countryName) {
		// TODO Auto-generated method stub
		return countryDao.findByCountryName(countryName);
	}

}
