package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;
// Bu baðýmlýk oluþturuyor. database deðiþtiðinde heryerden deðiþtirmek lazým
//@Component("database") IocConfig classýna @Bean annotation ekleyerek çözelim.

public class MsSqlCustomerDal implements ICustomerDal{
	
	@Value("${database.connectionString}")
	String connectionString;
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void add() {
		System.out.println("Connection String :"+this.connectionString);
		System.out.println("Ms Sql Connection : data added.");
	}

	@Override
	public void update() {
		System.out.println("Connection String :"+this.connectionString);
		System.out.println("Ms Sql connection : data updated.");
		
	}

}
