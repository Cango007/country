package com.slokam.CountryInfo.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Country {
	
	@Id
	@GeneratedValue
	private Integer countryId;
	@Column
	private String  countryName;
	@Column
	private Integer countryRank;
	@Column
	private String  countryCode;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = States.class)
	@JoinColumn(name="fr_key",referencedColumnName = "countryId")
	private List<States> statesList;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Integer getCountryRank() {
		return countryRank;
	}

	public void setCountryRank(Integer countryRank) {
		this.countryRank = countryRank;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public List<States> getStates() {
		return statesList;
	}

	public void setStates(List<States> states) {
		this.statesList = states;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryRank=" + countryRank
				+ ", countryCode=" + countryCode + ", states=" + statesList + "]";
	}

	public Country(Integer countryId, String countryName, Integer countryRank, String countryCode, List<States> states) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryRank = countryRank;
		this.countryCode = countryCode;
		this.statesList = states;
	}

	public Country() {
		super();
	}
	
	

}
