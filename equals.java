package com.mypackage;

public class equal {
public static void main(String[] args) {
	String s1=new String("cse");
	String s2=new String("cse");
	if(s1.equals(s2))
	{
		System.out.println("String are equal");
		
	}
	else
	{
		System.out.println("strings are not equal");
	}
	String s3="ece";
	String s4="ece";
	if(s3.equals(s4))
	{
		System.out.println("String are equal");
		
	}
	else
	{
		System.out.println("strings are not equal");
	}
	String s5="ece";
	String s6="cse";
	if(s6.equalsIgnoreCase(s5))
	{
		System.out.println("String are equal");
		
	}
	else
	{
		System.out.println("Strings are not equal");
	}
	
}
}
