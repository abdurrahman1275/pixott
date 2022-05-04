package com.revature.pixott.handler;


import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.AddHistoryDao;
import com.revature.pixott.dao.AddWishList;
import com.revature.pixott.dao.MovieDao;
import com.revature.pixott.model.History;
import com.revature.pixott.model.Movie;
import com.revature.pixott.model.WishList;

public class MovieHandler {
	public static void display() {
		MovieDao dao=new MovieDao();
		History history=new History();
		List<Movie>movies=dao.findall();
		System.out.println("Movies");
		System.out.println();
		System.out.printf("%4s %-40s\n", "Id", "Name");
		System.out.printf("%4s %-40s\n", "==", "====");
		movies.forEach(System.out::println);
		System.out.println("Select a movie (Enter Id):");
		int id=App.scanner.nextInt();
		System.out.println("Select an option");
		System.out.println("[1]Watch Movie");
		System.out.println("[2]Add to WishList");
		System.out.println("[3]Return to UserMenu");
		int option=App.scanner.nextInt();
		if (option==1) {
			AddHistoryDao addhistory=new AddHistoryDao();
			
			//history.setHistory_id(id);
			addhistory.addHistory(id);
			
			System.out.println("Enjoy your Movie !!!!!");
			UserMenuHandler.display();
			
		}
		else if(option==2) {
			AddWishList addwishlist=new AddWishList();
			WishList wishlist=new WishList();
			//wishlist.setWishlist_id(id);
			addwishlist.insertWishList(id);
			System.out.println(wishlist.getName()+" is added to your wishlist");
			UserMenuHandler.display();

			
			
		}
		else if(option==3) {
			UserMenuHandler.display();

		}
	
		
	}

}
