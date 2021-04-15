package com.cg.client;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\TANMAY\\Pictures\\Saved Pictures\\underwater.jpg");
		BufferedInputStream bis= new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("underwater.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		byte arr[]= new byte[fis.available()];
		
		bis.read(arr);
		bos.write(arr);
		fis.close();
		bis.close();
		fos.close();
		bos.close();
		System.out.println("Image copied");
	}

}
