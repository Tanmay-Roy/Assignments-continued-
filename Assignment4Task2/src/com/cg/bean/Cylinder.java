package com.cg.bean;

public class Cylinder extends AbsVolume implements IVolume {
	
	private double height;

	@Override
	public double calcVolume() {
		
		return Math.PI*getRadius()*getRadius()*height;
	}
	
	public void readData()
	{
		super.readData();
		System.out.println("enter the height: ");
		height=scan.nextDouble();		
		
	}
	
}
