package com.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {

	@Value("Camglue Technology")
	private String companyName;
	@Value("Vishakapatnam")
	private String companyCity;
	
	Employee empl;

	public Company() {
		super();
	}

	public Company(String companyName, String companyCity, Employee empl) {
		super();
		this.companyName = companyName;
		this.companyCity = companyCity;
		this.empl = empl;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public Employee getEmpl() {
		return empl;
	}

	public void setEmpl(Employee empl) {
		this.empl = empl;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyCity=" + companyCity + ", empl=" + empl + "]";
	}

}
