package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.dao.ViewHistoryDao;
import com.revature.pixott.model.History;

public class HistoryHandler {
	public static void display() {
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		System.out.println("Pix History");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=**=*=*=*");
		ViewHistoryDao dao=new ViewHistoryDao();
		List<History>hislist=dao.viewHistory();
		hislist.forEach(System.out::println);
		UserMenuHandler.display();
	}

}
