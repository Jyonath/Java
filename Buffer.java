package com.mypackage;

public class Buffer {
public static void main(String[] args) {
	String s="java";
	StringBuffer s1=new StringBuffer(s);
	StringBuffer s2=new StringBuffer(s);
	if(s1==s2)
	{
		System.out.println("Strings are equal");
	}
	else
	{
		System.out.println("Strings are not equal");
	}
	System.out.println(s1);
	System.out.println(s1.capacity());
	System.out.println(s1.append("hello"));
	System.out.println(s1.length());
	System.out.println(s1.capacity());
	System.err.println(s1.append("cse"));
	System.out.println(s1.capacity());
//	write a program to find duplicates char in a given string
	
}
}

