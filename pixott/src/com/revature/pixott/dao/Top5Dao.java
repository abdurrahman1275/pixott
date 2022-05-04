package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.Top5Movies;

public class Top5Dao {
	public List<Top5Movies>   top5( ) {
		String sql="select * from top5movies join movie on top5movie=movie.id;";
		List<Top5Movies> movies=new ArrayList<>();
		 try(
				 Connection conn=Util.getConnection();
				 PreparedStatement stmt=conn.prepareStatement(sql);
				 ){
			 ResultSet rs=stmt.executeQuery();
			 while(rs.next()) {
				 Top5Movies top5movies=new Top5Movies();
				 top5movies.setTop5Movie(rs.getInt("top5movie"));
				 top5movies.setMovieName(rs.getString("name"));
				 movies.add(top5movies);
				 }
		 }
		 catch(SQLException e) {
				Util.displayMessage(e);
			}
		 return movies;
	}

}
