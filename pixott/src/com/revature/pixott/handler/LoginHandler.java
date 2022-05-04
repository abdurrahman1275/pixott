package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.LoginDao;
import com.revature.pixott.model.Customer;

public class LoginHandler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("Login Menu");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		LoginDao dao=new LoginDao();
		Customer customer=new Customer();
		
		System.out.println(" Login");
		System.out.println("Enter your Registered Mobile number");
		String mobile=App.scanner.next();
		customer.setMobile(mobile);
		System.out.println("Enter password");
		String password=App.scanner.next();
		customer.setPassword(password);
		boolean user=dao.login(customer);
		
		if(user) {
			System.out.println("Login Successful");
			UserMenuHandler.display();
			
		}
		else {
			System.out.println("Invalid number or password, Please Try again");
			MainMenuHandler.display();
		}
	}

}
