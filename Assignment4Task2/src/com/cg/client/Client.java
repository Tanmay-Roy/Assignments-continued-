package com.cg.client;

import java.util.*;

import com.cg.bean.IVolume;
import com.cg.bean.VolumeContainer;

public class Client {
	public static void main(String[] args) {
		
		String menu=null;
		String opt=null;
		
		do
		{
			System.out.println("Select the menu");
			Set<String> set=VolumeContainer.getMenus();
			for(String str:set)
			{
				System.out.println(str);
			}
			menu=IVolume.scan.next();
			IVolume obj=VolumeContainer.getShape(menu);
			obj.readData();
			System.out.println(obj.calcVolume());
			System.out.println("press y to continue");
			opt=IVolume.scan.next();
			
		}while(opt.equals("y"));
	}
	
	//IVolume.scan.close();

}
