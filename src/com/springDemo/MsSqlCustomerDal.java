package com.springDemo;

import org.springframework.stereotype.Component;

@Component("database")
public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Ms Sql Connection");
	}

}
