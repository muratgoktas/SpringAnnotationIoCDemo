package com.springDemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;
//Bu baðýmlýk oluþturuyor. database deðiþtiðinde heryerden deðiþtirmek lazým
//@Component("oracle") IocConfig classýna @Bean annotation ekleyerek çözelim.

public class OracleCustomerDal implements ICustomerDal{

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
		System.out.println("Oracle connection : data added.");
		
	}

	@Override
	public void update() {
		System.out.println("Connection String :"+this.connectionString);
		System.out.println("Oracle connection : data updated.");
		
	}

}
