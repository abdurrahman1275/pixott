package com.revature.pixott.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.WishList;


public class ViewWishListDao {
	public List<WishList> viewWishList(){
		String sql="select * from wishlist join movie where wishlist_id=movie.id;";
		List<WishList> list=new ArrayList<>();
	
		try(
				Connection conn=Util.getConnection();
				PreparedStatement stmt =conn.prepareStatement(sql);
				){
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				WishList wishlist=new WishList();
				wishlist.setId(rs.getInt("id"));
				wishlist.setWishlist_id(rs.getInt("wishlist_id"));
				wishlist.setName(rs.getString("name"));
				list.add(wishlist);
			}
	}
		catch(SQLException e) {
			Util.displayMessage(e);
		}
	return list;

	}
}