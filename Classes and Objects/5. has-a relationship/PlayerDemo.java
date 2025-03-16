package com.vignesh.zohotask;

public class PlayerDemo {
	
	public static void main(String[] args) {
	Player vignesh = new Player("Vignesh","Second",8);
	Player ronaldo = new Player("Cristino Ronaldo", "One", 7);
	System.out.println(vignesh.toString());
	System.out.println(ronaldo.toString());
	vignesh.train();
	}
}
