package com.mypackage;
import java.util.*;
public class Main {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	//add elements in arraylist
	al.add(0);
	al.add(1);
	al.add(2);
	al.add(3);
	System.out.println(al);
	//replace elements in arraylist
	al.set(2, 7);
	System.out.println(al);
	//to get first element in arraylist
	al.getFirst();
	System.out.println(al.getFirst());
	//to get last element in arraylist
	al.getLast();
	System.out.println(al.getLast());
	//whether arraylist is empty or not
	al.isEmpty();
	System.out.println(al.isEmpty());
	//Trims the list's current size.
	al.trimToSize();
	System.out.println(al);
	//size of arraylist
	al.size();
	System.out.println(al.size());
	//index value in arraylist
	al.indexOf(3);
	System.out.println(al.indexOf(3));
	//Increases the capacity of this ArrayList instance
	al.ensureCapacity(5);
	System.out.println(al);
	
}
}
