package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.History;

public class AddHistoryDao {
	public List<History> addHistory(int id){
		String sql= "insert into history (history_id) values(?);";
		List<History>hislist=new ArrayList<>();
		//History history=new History();
		
		try(
				Connection conn=Util.getConnection();
				PreparedStatement stmt=conn.prepareStatement(sql);
				){
			//stmt.setInt(1,history.getHistory_id());
			stmt.setInt(1,id);
			stmt.executeUpdate();
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
			return hislist;
	}

}
