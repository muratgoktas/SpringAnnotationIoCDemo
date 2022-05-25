package com.springDemo;

//import org.springframework.stereotype.Component;
//Bu baðýmlýk oluþturuyor. database deðiþtiðinde heryerden deðiþtirmek lazým
//@Component("oracle") IocConfig classýna @Bean annotation ekleyerek çözelim.

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
