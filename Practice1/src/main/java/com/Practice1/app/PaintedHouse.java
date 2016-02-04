package com.Practice1.app;

public class PaintedHouse extends PrivateHouse{
	private Colour colour;
	public PaintedHouse (Colour colour){
		super();
		this.colour = colour;
	}
	public PaintedHouse (int people, Colour colour){
		super(people);
		this.colour = colour;
	}
	public void live(){
		super.live();
		System.out.println();
		colour.paint();
	}
}
