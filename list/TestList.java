package com.uis.list;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		Object o = new Object();
		o = "Green";

		list1.add("Red");
		list1.add("Green");
		list1.add("Orange");
		list1.add("White");
		list1.add("Black");
		list1.add(4, "Pink");
		list1.set(3, "Yellow");
		list1.remove(3);
		list1.add("Violet");
		list1.add("Grey");

//		list2.add("java");
//		list2.add('a');
//		list2.add(3);
//		list2.add("White");
//		list2.add("Black");
//		list2.add(4, "Pink");
//		list2.set(3, "Yellow");
//		list2.remove(3);
//		list2.add("Violet");
//		list2.add("Grey");

		int fromIndex = 2;
		int toIndex = 6;

		// TestList.printArrayList(list1);
		// TestList.iterateArrayList(list1);
		// TestList.insertArrayList(list1);
		// TestList.specifiedIndexArrayList(list1);
		// TestList.replaceIndexArrayList(list1);
		// TestList.removeThirdElementArrayList(list1);
		// TestList.searchElement(list1, o);
		// TestList.copyArrayListToAnother(list1);
		// TestList.extractArrayList(list1, fromIndex, toIndex);
		// TestList.compareTwoArrayList(list1, list2);
		// TestList.joinTwoArrayList(list1, list2);
		// TestList.emptyAnArrayList(list1);
		TestList.chechIsEmpty(list1);

	}

//1.	public static void printArrayList(List list) {
//		System.out.println(list);
//	}
//2.	public static void iterateArrayList(List list) {
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));	
//		}
//3.	public static void insertArrayList(List list) {
//		System.out.println(list);
//	}
//4.	public static void specifiedIndexArrayList(List list) {
//		System.out.println(list.get(3));
//	}
//5.	public static void replaceIndexArrayList(List list) {
//		System.out.println(list);
//	}
//6.	public static void removeThirdElementArrayList(List list) {
//		System.out.println(list);
//	}
//7.	public static void searchElement(List list, Object o) {
//		System.out.println(list);
//		if(list.contains(o)) {
//			System.out.println(o + " is present in list");
//		}else {
//			System.out.println(o + " is NOT present in list");
//		}
//	}
//8.	public static void copyArrayListToAnother(List list) {
//		System.out.println("Original List--> " + list);
//		ArrayList list2 = new ArrayList(list.size());
//		list2.addAll(list);
//		System.out.println("Copied List--> " + list2);
//	}
//9.	public static void extractArrayList(List list,int fromIndex,int toIndex) {
//		System.out.println("Original List--> " + list);
//		System.out.println("Extracted List--> " + list.subList(fromIndex, toIndex));
//	}
//10.	public static void compareTwoArrayList(List list,List list2) {
//		System.out.println("Original List--> " + list);
//		for(int i=0; i<list.size(); i++) {
//			if(list.get(i).equals(list2.get(i))){
//				System.out.println("Index "+ i + " Yes");
//			}else {
//				System.out.println("No");
//			}
//		}
//		System.out.println("Second List--> " + list2);
//	}
//11.	public static void joinTwoArrayList(List list, List list2) {
//		System.out.println("Original List--> " + list);
//		int n = list.size();
//		list.addAll(list2);
//		System.out.println("Attached List--> " + list);
//	}
//13.	public static void emptyAnArrayList(List list) {
//		list.removeAll(list);
//		System.out.println(list);
//	}
	public static void chechIsEmpty(List list) {
		System.out.println(list.isEmpty());
		System.out.println(list);
	}
}