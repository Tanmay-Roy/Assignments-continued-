package com.cg.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cg.beans.Emp;
import com.cg.beans.NameComparator;
import com.cg.beans.SalComparator;
enum Menu{
	ID, NAME, SAL
}


public class SortList {
	
	private static List<Emp> lst= new ArrayList<>();
	
	static
	{
		lst.add(new Emp(1008,"ram",34000));
		lst.add(new Emp(1001, "anand",24000));
		lst.add(new Emp(1003, "vikas",37000));
		lst.add(new Emp(1002, "peter",44000));
		lst.add(new Emp(1005, "arshad",33000));
	}
	
	public static void processMenu(String strmenu)
	{
		try
		{
			Menu menu=Menu.valueOf(strmenu.toUpperCase());
			switch(menu)
			{
				case ID:
							lst.sort(null);
							System.out.println("--------sort by ID--------");
							display(lst);
							break;
				case NAME:
							lst.sort(new NameComparator());
							System.out.println("--------sort by Name-------");
							display(lst);
							break;
				case SAL:
							lst.sort(new SalComparator());
							System.out.println("---------sort by Salary--------");
							display(lst);
							break;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void display(List<Emp> lst2) {
		
		for (Emp emp : lst2) {
			System.out.println(emp);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String opt= null;
		String menustr= null;
		do
		{
			System.out.println("ID\nNAME\nSAL");
			menustr=sc.next();
			processMenu(menustr);
			System.out.println("press y to continue");
			opt=sc.next();
			
		}while(opt.equals("y"));
	}
}