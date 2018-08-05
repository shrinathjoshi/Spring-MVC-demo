package com.shrinath.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.shrinath.mvc.validation.CourseCode;


public class Customer {

	private String firstName;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 digits allowed")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	@NotNull(message=" is Required")
	@Min(value=0,message="must be greater than or equal to zero")
	@Max(value=10,message="must be less than or equal to ten")
	private Integer freePasses;
	
	
	@CourseCode(value="COM" , message="must start with com")
	private String courseCode;
	
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	@NotNull(message=" is Required")
	@Size(min=1,message=" is Required")
	private String lastName;
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
