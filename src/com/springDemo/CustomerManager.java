package com.springDemo;

public class CustomerManager implements ICustomerService{

	@SuppressWarnings("unused")
	private ICustomerDal _customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
			super();
			this._customerDal = customerDal;
		}

	@Override
	public void add() {
		_customerDal.add();
		System.out.println("Customer Added.");
		
		
	}

	@Override
	public void update() {
		_customerDal.update();
		System.out.println("Customer Updated.");
		
	}

}
