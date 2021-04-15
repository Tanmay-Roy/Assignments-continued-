package com.cg.beans;

import java.util.Scanner;

public interface IVolume {
	
	Scanner scan= new Scanner(System.in);
	double calcVolume();
	void readData();
	static void processVolume(IVolume obj)
	{
		obj.readData();
		System.out.println(obj.calcVolume());
	}

}
