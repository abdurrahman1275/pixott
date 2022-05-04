package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.AddHistoryDao;
import com.revature.pixott.dao.AddWishList;
import com.revature.pixott.dao.SearchDao;
import com.revature.pixott.model.Movie;
import com.revature.pixott.model.WishList;

public class SearchHandler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("Search Menu");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("Search a movie");
		String name=App.scanner.next();
		SearchDao dao=new SearchDao();
		//movie.setName(name);
		List<Movie>movies=dao.search(name);
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
