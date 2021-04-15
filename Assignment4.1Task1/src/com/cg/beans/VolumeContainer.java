package com.cg.beans;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cg.beans.Cone;
import com.cg.beans.Cylinder;
import com.cg.beans.IVolume;

public class VolumeContainer {
	
public static Map<String,IVolume> vmap= new HashMap<>();
	
	
	static
	{
		vmap.put("cone", new Cone());
		vmap.put("cyl", new Cylinder());
		//vmap.put("sphere", new Sphere());
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
