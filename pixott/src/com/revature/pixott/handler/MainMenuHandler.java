package com.revature.pixott.handler;

import com.revature.pixott.app.App;

public class MainMenuHandler {
	public static void display() {
		System.out.println(" *=*=*=*=*=*=*");
		System.out.println("||PIXOTT Home||");
		System.out.println(" *=*=*=*=*=*=*");
		System.out.println("[1] Signup");
		System.out.println("[2] Login");
		System.out.println("[3] Exit");
		System.out.println("Enter option:");
		int option=App.scanner.nextInt();
		if(option==1) {
			SignupHandler.display();
			}
		if(option==2) {
			LoginHandler.display();
		}
	}

}
