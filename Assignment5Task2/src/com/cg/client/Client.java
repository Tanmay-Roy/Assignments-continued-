package com.cg.client;

import java.util.HashSet;
import java.util.Set;

import com.cg.beans.Emp;

public class Client {
	
	public static void main(String[] args) {
		
		Emp e1= new Emp(1003,"ram",9000);
		Emp e2= new Emp(1001,"tom",8000);
		Emp e3= new Emp(1005,"sam",7000);
		Emp e4= new Emp(1002,"john",9500);
		Emp e5= new Emp(1004,"peter",8500);
		Emp e6= new Emp(1001,"tom",8000);
		
		Set<Emp> set= new HashSet<>();
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e1);
		set.add(e6);
		
		set.forEach(System.out::println);
		
		
	}

}
