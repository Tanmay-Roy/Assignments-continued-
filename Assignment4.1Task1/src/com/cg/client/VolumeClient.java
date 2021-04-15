package com.cg.client;

import java.util.Set;

import com.cg.beans.IVolume;
import com.cg.beans.VolumeContainer;

public class VolumeClient {
	public static void main(String[] args) {
		
		String menu=null;
		String opt=null;
		
		do
		{
			System.out.println("Select the menu");
			Set<String> set=VolumeContainer.getMenus();
			
			System.out.println(set);
			
			menu=IVolume.scan.next();
			IVolume obj=VolumeContainer.getShape(menu);
			IVolume.processVolume(obj);
			System.out.println("press y to continue");
			opt=IVolume.scan.next();
			
		}while(opt.equals("y"));
		
	}

}
