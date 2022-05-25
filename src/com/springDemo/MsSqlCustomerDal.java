package com.springDemo;

//import org.springframework.stereotype.Component;
// Bu ba��ml�k olu�turuyor. database de�i�ti�inde heryerden de�i�tirmek laz�m
//@Component("database") IocConfig class�na @Bean annotation ekleyerek ��zelim.
public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Ms Sql Connection : data added.");
	}

	@Override
	public void update() {
		System.out.println("Ms Sql connection : data updated.");
		
	}

}
