package com.cg.service;

public class FlyableClient {

	public static void main(String[] args) {
		
		display(()-> System.out.println("eagle"));
		display(()-> System.out.println("sparrow"));
		display(()-> System.out.println("flight"));
		
	}
	
	public static void display(Flyable obj)
	{
		System.out.println(obj.getClass().getName());
		obj.fly();
	}
	
}
