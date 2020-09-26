package com.blz.UserRegRegex;

import java.util.regex.Pattern;

public class UserRegRegexUC9 {
	public void validate_email(String email) {
		String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		if(Pattern.matches(pattern_email,email))
			 System.out.println("Valid Email");
		
		else
			System.out.println("Invalid Email");
		
	}
	public static void main(String[] args) {
		UserRegRegexUC9 user = new UserRegRegexUC9();
		user.validate_email("abc@yahoo.com");
		user.validate_email("abc-100@yahoo.com");
		user.validate_email("abc.100@yahoo.com");
		user.validate_email("abc111@abc.com");
		user.validate_email("abc-100@abc.net");
		user.validate_email("abc.100@abc.com.au");
		user.validate_email("abc@1.com");
		user.validate_email("abc@gmail.com.com");
		user.validate_email("abc+100@gmail.com");
		user.validate_email("abc");
		user.validate_email("abc@.com.my");
		user.validate_email("abc123@gmail.a");
		user.validate_email("abc123@.com");
		user.validate_email("abc123@.com.com");
		user.validate_email(".abc@abc.com");
		user.validate_email("abc()*@gmail.com");
		user.validate_email("abc@%*.com");
		user.validate_email("abc..2002@gmail.com");
		user.validate_email("abc.@gmail.com");
		user.validate_email("abc@abc@gmail.com");
		user.validate_email("abc@gmail.com.1a");
		user.validate_email("abc@gmail.com.aa.au");
		
		
	}

}
