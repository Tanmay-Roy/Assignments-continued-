package com.cg.client;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw= new FileWriter("capgemini\\cg.txt",true);
		BufferedWriter bw= new BufferedWriter(fw,1024*10);
		bw.write("Capgemini centres are in mumbai,pune,hyderabad,noida,chennai\n");
		bw.write("L and D is a separate department in capgemini");
		bw.close();
		System.out.println("file appended");
	}

}
