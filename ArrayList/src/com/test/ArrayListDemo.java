package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		 
		List list =new ArrayList ();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(5);
		
		System.out.println(list);
		//Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
