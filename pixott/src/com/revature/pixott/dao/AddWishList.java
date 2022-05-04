package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.WishList;

public class AddWishList {
	public List<WishList> insertWishList(int id){
		String sql="insert into wishlist (wishlist_id) values (?);";
		List<WishList>list=new ArrayList<>();
		WishList wishlist=new WishList();
		try(
				Connection conn=Util.getConnection();
				PreparedStatement stmt=conn.prepareStatement(sql);
				){
			
			//stmt.setInt(1,wishlist.getWishlist_id());
			stmt.setInt(1, id);
			stmt.executeUpdate();}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
			
			
		}

	}


