package com.uis.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
	
		ArrayList list1 = new ArrayList();
		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		
		TestList.printArrayList(list1);
		
	}
	public static void printArrayList(List list) {
		System.out.println(list);
	}
}
