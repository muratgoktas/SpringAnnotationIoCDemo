package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
//		ICustomerDal customerDal = context.getBean("database",ICustomerDal.class);
//		customerDal.add();
//		
//		ICustomerDal oracleCustomerDal = context.getBean("oracle", ICustomerDal.class);
//		
//		oracleCustomerDal.add();
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		customerService.update();
				
	}

}
