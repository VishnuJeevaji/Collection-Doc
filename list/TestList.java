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
		list1.add(4, "Pink");
		list1.set(3,"Yellow");
		list1.remove(3);
		
		//TestList.printArrayList(list1);
		//TestList.iterateArrayList(list1);
		//TestList.insertArrayList(list1);
		//TestList.specifiedIndexArrayList(list1);
		//TestList.replaceIndexArrayList(list1);
		TestList.removeThirdElementArrayList(list1);
		
	}
//	public static void printArrayList(List list) {
//		System.out.println(list);
//	}
//	public static void iterateArrayList(List list) {
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));	
//		}
//	public static void insertArrayList(List list) {
//		System.out.println(list);
//	}
//	public static void specifiedIndexArrayList(List list) {
//		System.out.println(list.get(3));
//	}
//	public static void replaceIndexArrayList(List list) {
//		System.out.println(list);
//	}
	public static void removeThirdElementArrayList(List list) {
		System.out.println(list);
	}
}
