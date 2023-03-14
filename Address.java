package com.uis.collectionslabQ2;

public class Address {
String city;
String street;
int pin;
int zip;

public Address(String city, String street, int pin, int zip) {
	super();
	this.city = city;
	this.street = street;
	this.pin = pin;
	this.zip = zip;
}

public boolean equals(Object o) {
	if(o instanceof Address) {
		Address e= (Address)o;
		System.out.println("address equals method");
		return ((this.city.equals(e.city))&& (this.street.equals(e.street))&&(this.pin==(e.pin)));
	}
	else {
		throw new IllegalArgumentException();
	}
} 
}
