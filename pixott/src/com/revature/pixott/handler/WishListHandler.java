package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.dao.ViewWishListDao;
import com.revature.pixott.model.WishList;

public class WishListHandler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("Pix WishList");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		ViewWishListDao dao=new ViewWishListDao();
		List<WishList>list=dao.viewWishList();
		list.forEach(System.out::println);
		UserMenuHandler.display();

	}

}
