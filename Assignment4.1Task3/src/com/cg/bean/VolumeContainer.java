package com.cg.bean;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
public class VolumeContainer {
	
public static Map<String,IVolume> vmap= new HashMap<>();
	
	
	static
	{
		vmap.put("cone", new Cone());
		vmap.put("cyl", new Cylinder());
		//vmap.put("sphere", new Sphere());
		
		ResourceBundle rb= ResourceBundle.getBundle("cg");
		Set<String> keys= rb.keySet();
		for (String str: keys)
		{
			try
			{
			Class cls= Class.forName(rb.getString(str));
			IVolume obj= (IVolume) cls.newInstance();
			vmap.put(str, obj);

			}
		
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	
	public static IVolume getShape(String stype)
	{
		IVolume volume=vmap.get(stype);
		return volume;
	}
	
	public static Set<String> getMenus()
	{
		return vmap.keySet();
	}

}
