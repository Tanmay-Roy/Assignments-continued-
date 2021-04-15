package com.cg.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class DaoFactory {
	
	private static Map<String,IDAO> map= new HashMap<>();
	
	static
	{
		try
		{
			ResourceBundle rb= ResourceBundle.getBundle("cg");//loading the cg.properties file
			String strcls= rb.getString("clsname");//gets the clsname property
			Class cls=Class.forName(strcls);//loading the class
			IDAO dao = (IDAO)cls.newInstance();
			map.put("dao", dao);
			
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static IDAO getDaoInstance()
	{
		return map.get("dao");
	}

}
