package com.springDemo;

//import org.springframework.stereotype.Component;
//Bu ba��ml�k olu�turuyor. database de�i�ti�inde heryerden de�i�tirmek laz�m
//@Component("oracle") IocConfig class�na @Bean annotation ekleyerek ��zelim.

public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Oracle connection : data added.");
		
	}

	@Override
	public void update() {
		System.out.println("Oracle connection : data updated.");
		
	}

}
