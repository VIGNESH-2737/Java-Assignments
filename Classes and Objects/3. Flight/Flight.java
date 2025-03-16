package com.vignesh.zohotask;

public class Flight {
	private int flightId;
	private String airlineName;
	private String flightNumber;
	private String source;
	private String destination;
	private String DepartureTime;
	private String arrivalTime;
	private String duration;
	private int availableSeats;
	private double price;
	private String status;
	
	public Flight() {}
	
	public Flight(int flightId, String airlineName, String flightNumber, String source, String destination,
			String departureTime, String arrivalTime, String duration, int availableSeats, double price,
			String status) {
		super();
		this.flightId = flightId;
		this.airlineName = airlineName;
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		DepartureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.availableSeats = availableSeats;
		this.price = price;
		this.status = status;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(String departureTime) {
		DepartureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", airlineName=" + airlineName + ", flightNumber=" + flightNumber
				+ ", source=" + source + ", destination=" + destination + ", DepartureTime=" + DepartureTime
				+ ", arrivalTime=" + arrivalTime + ", duration=" + duration + ", availableSeats=" + availableSeats
				+ ", price=" + price + ", status=" + status + "]";
	}
	
}
