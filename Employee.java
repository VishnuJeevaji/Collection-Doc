package com.uis.collectionslabQ2;

import com.uis.collectionslab.Person;

public class Employee {
	private String name;
	private String email;
	private String dob;
	private Address homeAddress;
	private Address officeAddress;

	public boolean equals(Object o) {
		if (o instanceof Employee) {
			Employee e = (Employee) o;
			System.out.println("employee equals method");
			return ((this.name.equals(e.name)) && (this.homeAddress.equals(e.homeAddress)));
		} else {
			throw new IllegalArgumentException();
		}
	}

	public String getName() {
		return name;
	}

	public Employee() {
		super();
		
	}

	public Employee(String name, String email, String dob, Address homeAddress, Address officeAddress) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
}
