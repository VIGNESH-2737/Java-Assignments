package com.vignesh.zohotask;

public class Team {
	private String name;
	private String city;
	private String division;
	private ArrayList<Player> players;
	
	public Team() {
		//playGame();
	}
	
	public Team(String name, String city, String division){
		this.name = name;
		this.city = city;
		this.division = division;
		//playGame();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getDivision() {
		return this.division;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setDivision(String division) {
		this.division = division;
	}
	
	public void playGame() {
		System.out.println("Game get started !");
	}
	public void hireCoach() {
		System.out.println("Team needs to hire Coach for training.");
	}
	
	@Override
	public String toString() {
		return "Team [Name= "+name+", City= "+city+", Division= "+division+"]";
		
	}
}
