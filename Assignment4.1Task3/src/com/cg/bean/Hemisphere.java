package com.cg.bean;

public class Hemisphere extends AbsVolume implements IVolume{
	
public double calcVolume() {
		
		return (Math.PI*getRadius()*getRadius()*getRadius()*2.0)/3.0;
	}
	
	public void readData()
	{
		super.readData();		
		
	}

}
