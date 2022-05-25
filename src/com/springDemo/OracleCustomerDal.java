package com.springDemo;

import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Oracle connection");
		
	}

}
