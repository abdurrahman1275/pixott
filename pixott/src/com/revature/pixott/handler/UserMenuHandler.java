package com.revature.pixott.handler;

import com.revature.pixott.app.App;
import com.revature.pixott.model.Movie;

public class UserMenuHandler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("PIX MENU");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("[1]View Movie List");
		System.out.println("[2] View Top5 Movie");
		System.out.println("[3] Search movies");
		System.out.println("[4] Your Wish List");
		System.out.println("[5] View History");
		System.out.println("[6] Logout");
		
		System.out.println("Select an option");
		int option=App.scanner.nextInt();
		
		if(option==1) {
			MovieHandler.display();
		}
		else if(option==2) {
			Top5Handler.display();
			
		}
		else if(option==3) {
			SearchHandler.display();
		}
		else if(option==4) {
			WishListHandler.display();
		}
		else if(option==5) {
		HistoryHandler.display();	
		}
		else if(option==6) {
			System.out.println("Your Account has been Logged out");
		}
}
}
