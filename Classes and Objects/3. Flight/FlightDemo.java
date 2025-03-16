package com.vignesh.zohotask;

public class FlightDemo {
	
	
	public static void main(String[] args) {
	Flight airIndia = new Flight(1, "Air India", "A001", "Chennai", "Banglore",
			"07:00", "08:00", "1 HRS", 50, 1000.25,
			"Available");
	
	System.out.println(airIndia.toString());
	}
}
