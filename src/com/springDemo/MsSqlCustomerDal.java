package com.springDemo;

//import org.springframework.stereotype.Component;
// Bu baðýmlýk oluþturuyor. database deðiþtiðinde heryerden deðiþtirmek lazým
//@Component("database") IocConfig classýna @Bean annotation ekleyerek çözelim.
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
