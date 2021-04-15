package com.cg.client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		
		File folder=new File("capgemini");
		if (!folder.exists())
		{
			folder.mkdir();
		}
		FileWriter fw= new FileWriter("capgemini\\cg.txt");
		BufferedWriter bw= new BufferedWriter(fw,1024*10);
		bw.write("ram is a good boy");
		bw.write("ram is in capgemini");
		bw.close();
		System.out.println("file created");
	}

}
