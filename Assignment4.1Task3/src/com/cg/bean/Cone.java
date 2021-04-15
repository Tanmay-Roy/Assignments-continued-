package com.cg.bean;

public class Cone extends AbsVolume implements IVolume {
	
private double height;
	
	public double calcVolume()//override
	{
		return Math.PI*getRadius()*getRadius()*height/3.0;
	}
	
	public void readData()//override
	{
		super.readData();
		System.out.println("enter the height");
		height=scan.nextDouble();
	}

}
