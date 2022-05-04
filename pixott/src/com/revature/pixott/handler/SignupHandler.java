package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.CustomerDao;
import com.revature.pixott.model.Customer;

public class SignupHandler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*");
		System.out.println("New to PIXOTT?????,Create an account!");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*");
		CustomerDao dao=new CustomerDao();
		Customer customer=new Customer();
		System.out.println("Enter the details below");
		System.out.println("Enter your Name");
		String name=App.scanner.next();
		customer.setName(name);
		System.out.println("Enter your Mobile Number");
		String mobile=App.scanner.next();
		customer.setMobile(mobile);
		System.out.println("Enter Password");
		String password=App.scanner.next();
		customer.setPassword(password);
		dao.Signup(customer);
		
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*");
		System.out.println("Congrats!!! , Your Account has been created");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*=*=*=*=*");
		MainMenuHandler.display();

		
		
		
	}

}
