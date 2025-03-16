package com.vignesh.zohotask;

public class Player extends Team{
	private String name;
	private String position;
	private int jerseyNumber;
	
	public Player() {
		super();
		//super.playGame();
	}
	
	public Player(String name, String position, int jerseyNumber) {
		//this();
		this.name  = name;
		this.position = position;
		this.jerseyNumber = jerseyNumber;
		playGame();
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPosition() {
		return this.position;
	}
	
	public int getJerseyNumber() {
		return this.jerseyNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	@Override
	public void playGame() {
		System.out.println("Player "+jerseyNumber+" is ready to Play.");
	}
	
	public void train() {
		System.out.println("Player "+jerseyNumber+" needs training to get above "+position+" position.");
		hireCoach();
	}
	
	@Override
	public String toString() {
		return "Player [name = "+name+", position = "+position+", jerseyNumber = "+jerseyNumber+"]";
	}
	
	
	
}
