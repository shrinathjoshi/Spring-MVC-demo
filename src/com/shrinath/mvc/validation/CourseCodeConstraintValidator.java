package com.shrinath.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

	private String coursePrefix;
	
	@Override
	public void initialize(CourseCode arg0)
	{
		coursePrefix=arg0.value();
	}
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		// TODO Auto-generated method stub
		boolean result;
		
		if(theCode!=null)
			result=theCode.startsWith(coursePrefix);
		else
			result=true;
		
		
		return result;
	}

}
