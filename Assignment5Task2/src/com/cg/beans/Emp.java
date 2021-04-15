package com.cg.beans;

public class Emp implements Comparable<Emp> {
	
	private int empId;
	private String empName;
	private double empSal;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		
		return empId+" "+empName+" "+empSal;
	}

	public Emp(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public int hashCode() {
		
		return empId;
	}

	@Override
	public int compareTo(Emp emp) {
		
		Integer id1= this.empId;
		Integer id2= this.empId;
		return id1.compareTo(id2);
	}

	/*@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);*/
}


