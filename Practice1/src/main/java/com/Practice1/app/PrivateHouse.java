package com.Practice1.app;

public class PrivateHouse implements House{
	private int people = 5;
	public PrivateHouse(){}
	public PrivateHouse(int people){
		this.people = people;
	}
	public void live() {
		// TODO Auto-generated method stub
		System.out.println("In new house can live "+people+" people");
	}
	
}
