package com.cg.beans;

public abstract class AbsVolume implements IVolume{
	
private double radius;
	
	
	public double getRadius() {
		return radius;
	}

	public void readData()
	{
		System.out.println("enter the radius: ");
		radius=scan.nextDouble();
	}

}
