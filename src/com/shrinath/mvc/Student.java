package com.shrinath.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLanguage;
	
	private String[] operatingSystem;
	
	public String[] getOperatingSystem() {
	//	System.out.println("Length "+operatingSystem.length);
		System.out.println(operatingSystem==null);
		if(operatingSystem!=null)
		for(String i : operatingSystem)
			System.out.println(i);
		return operatingSystem;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}


	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	private LinkedHashMap<String,String> countryOptions;
	
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}


	public Student() {
		countryOptions=new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("UAE", "United Arab Emerates");
		
	}
	
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
