package com.Practice1.app;

public class CottageCity implements House{
	public CottageCity(){}
	public void live() {
		System.out.print("Living in " + colour + " : ");
		liveInPaintedHouse.liveIn();
	}
	private String colour;
	public void setColour(String colour){
		this.colour = colour;
	}
	public String getColour(){
		return colour;
	}
	public String makeColour(){
		return colour;
	}
	private LiveInPaintedHouse liveInPaintedHouse;
	public void setLiveInPaintedHouse(LiveInPaintedHouse liveInPaintedHouse){
		this.liveInPaintedHouse = liveInPaintedHouse;
	}
}
