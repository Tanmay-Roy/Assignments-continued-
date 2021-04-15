package com.cg.client;

import com.cg.bean.AgeException;
import com.cg.bean.IncomeException;

public class DemoException {
	public static void main(String[] args) {
		
		String res= checkEligible(17,300000.0);
		System.out.println(res);
	}
	
	public static String checkEligible(int age,double income)
	{
		try
		{
			return processLoan(age,income);			
		}
		
		catch(AgeException | IncomeException e)
		{
			return e.getMessage();
		}
		
		finally
		{
			System.out.println("I am in finally block");
		}
	}
	
	public static String processLoan(int age,double income)throws AgeException,IncomeException
	{
		if (age<20 || age>50)
			throw new AgeException("age must be between 20 and 50");
		if (income<400000)
			throw new IncomeException("income must be min Rs 4 lakhs");
		return "eligible";
	}

}
