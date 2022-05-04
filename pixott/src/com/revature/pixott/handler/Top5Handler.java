package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.app.App;
import com.revature.pixott.dao.AddHistoryDao;
import com.revature.pixott.dao.AddWishList;
import com.revature.pixott.dao.Top5Dao;
//import com.revature.pixott.model.History;
import com.revature.pixott.model.Top5Movies;
import com.revature.pixott.model.WishList;


public class Top5Handler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("Top $ Trending Movies");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		Top5Dao dao=new Top5Dao();
		//History history=new History();
		
		List<Top5Movies>movies=dao.top5();		
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
			UserMenuHandler.display();
			
		}
		else if(option==2) {
			AddWishList addwishlist=new AddWishList();
			WishList wishlist=new WishList();
//			wishlist.setWishlist_id(id);
			addwishlist.insertWishList(id);
			UserMenuHandler.display();
			
			
		}
		else if(option==3) {
			UserMenuHandler.display();

		}
	
		
	}

}
