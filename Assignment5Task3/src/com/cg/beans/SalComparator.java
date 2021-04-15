package com.cg.beans;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp>{

	@Override
	public int compare(Emp emp1, Emp emp2) {
		Double sal1= emp1.getEmpSal();
		Double sal2= emp2.getEmpSal();
		if (sal1.compareTo(sal2)==0)
		{
			Integer id1= emp1.getEmpId();
			Integer id2= emp2.getEmpId();
			return id1.compareTo(id2);
		}
		return sal1.compareTo(sal2);
	}
	
}
