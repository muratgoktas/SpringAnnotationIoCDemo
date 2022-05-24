package com.springDemo;

public class MsSqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Ms Sql Connection");
	}

}
