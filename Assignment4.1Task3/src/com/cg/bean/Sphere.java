package com.cg.bean;

public class Sphere extends AbsVolume implements IVolume{
	

	@Override
	public double calcVolume() {
		
		return (Math.PI*getRadius()*getRadius()*getRadius()*4.0)/3.0;
	}
	
	public void readData()
	{
		super.readData();		
		
	}
	
	

}
