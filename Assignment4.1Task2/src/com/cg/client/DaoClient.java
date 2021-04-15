package com.cg.client;

import com.cg.dao.DaoFactory;
import com.cg.dao.IDAO;

public class DaoClient {
	public static void main(String[] args) {
		
		IDAO dao= DaoFactory.getDaoInstance();
		dao.getEmployees();
		System.out.println(dao.getClass().getSimpleName());
	}

}
