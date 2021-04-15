package com.cg.demos;

import java.awt.List;

public class Demo1 {
	public static void main(String[] args) {
		
		List lst= new ArrayList();
		lst.add(56);
		lst.add(5.2);
		lst.add("ram");
		lst.add(null);
		
		for (Object obj: lst)
			if (obj instanceof Integer)
			{
				int res1= (Integer)obj +10;
				System.out.println(res1);
			}
		
			else if (obj instanceof )
	}

}
