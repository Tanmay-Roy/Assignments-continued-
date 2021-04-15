package com.cg.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class ReadDemo {
	public static void main(String[] args) throws IOException {
		
		FileReader fr= new FileReader("capgemini\\cg.txt");
		BufferedReader br= new BufferedReader(fr,1024*10);
		String str=null;
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
		fr.close();
	}

}
