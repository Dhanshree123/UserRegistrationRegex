package com.blz.UserRegRegex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegRegexUC1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Name");
	String fname = sc.next();
	String pattern = "^[A-Z][a-z]{2,}";
	Pattern p1 = Pattern.compile(pattern);
	Matcher m1 = p1.matcher(fname);
	if(m1.matches())
		 System.out.println("Valid First Name");
	
	else
		System.out.println("Invalid First Name");
	}
	
}
