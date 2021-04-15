package com.cg.client;

import java.util.Arrays;
import java.util.List;

public class ArrayDemo {
	public static void main(String[] args) {
		
	String arr[]= {"rama","akbar","joy","tom","ajay","ravi"};
	System.out.println(arr.length);
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	int idx= Arrays.binarySearch(arr, "joy");
	if (idx>=0)
		System.out.println("found at: "+idx);
	else
		System.out.println("not found");
	
	List<String> list= Arrays.asList(arr);
	//list.add("hari");//unsupported operation exception
	System.out.println(list);
	
	String newarray[]= Arrays.copyOf(arr, 20);
	System.out.println(newarray.length);
	System.out.println(Arrays.toString(newarray));
	
	String rangearray[]= Arrays.copyOfRange(newarray,1,3);
	System.out.println(rangearray.length);
	System.out.println(Arrays.toString(rangearray));
	
	Arrays.fill(newarray, "capgemini");
	System.out.println(Arrays.toString(newarray));
	}
}