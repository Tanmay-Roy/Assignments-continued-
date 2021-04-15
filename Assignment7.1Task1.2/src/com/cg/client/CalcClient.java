package com.cg.client;

public class CalcClient {
	
	public static void main(String[] args) {
		
		display((a,b)-> {return a+b;}, 10,5);
		display((a,b)-> {return a-b;}, 10,5);
		display((a,b)-> a*b, 10, 5);
		display((a,b)-> a/b,10 ,5);
	}
	
	public static void display(ICalc obj,int v1,int v2)
	{
		
		System.out.println(obj.doCalc(v1, v2));
	}

}
