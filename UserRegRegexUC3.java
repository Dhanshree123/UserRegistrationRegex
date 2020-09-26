package com.blz.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegRegexUC3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name");
		String fname = sc.next();
		String pattern_fn = "^[A-Z][a-z]{2,}";
		Pattern p1 = Pattern.compile(pattern_fn);
		Matcher m1 = p1.matcher(fname);
		if(m1.matches())
			 System.out.println("Valid First Name");
		
		else
			System.out.println("Invalid First Name");
		
		System.out.println("Enter the Last Name");
		String lname = sc.next();
		String pattern_ln = "^[A-Z][a-z]{2,}";
		Pattern p2 = Pattern.compile(pattern_ln);
		Matcher m2 = p2.matcher(lname);
		if(m2.matches())
			 System.out.println("Valid Last Name");
		
		else
			System.out.println("Invalid Last Name");
	
	System.out.println("Enter the Email");
	String email = sc.next();
	String pattern_email = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	Pattern p3 = Pattern.compile(pattern_email);
	Matcher m3 = p3.matcher(email);
	if(m3.matches())
		 System.out.println("Valid Email");
	
	else
		System.out.println("Invalid Email");
	}
}
