package com.uis.collectionslabQ2;

public class TestEmployeeAndAdress {

	public static void main(String[] args) {
		Employee e1 = new Employee("varsha", "varsha123@gmai.com", "20/1/1",
				new Address("Bengalur", "rayar matta", 560082, 123),
				new Address("Bengalur", "rayar matta", 560082, 123));
		Employee e2 = new Employee("raksha", "raksha123@gmai.com", "20/1/1",
				new Address("Bengalur", "rayar matta", 560082, 123),
				new Address("Bengalur", "rayar matta", 560082, 123));
		System.out.println(e1.equals(e2));
	}

}
