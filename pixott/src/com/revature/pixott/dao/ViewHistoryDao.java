package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.model.History;

public class ViewHistoryDao {
	public List<History> viewHistory(){
		String sql="select * from history join movie where history_id=movie.id;";
		List<History>hislist=new ArrayList<>();
		try(
				Connection conn=Util.getConnection();
				PreparedStatement stmt =conn.prepareStatement(sql);
				){
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				History history=new History();
				history.setId(rs.getInt("id"));
				history.setHistory_id(rs.getInt("history_id"));
				history.setName(rs.getString("name"));
				hislist.add(history);
			}
		}
			catch(SQLException e) {
				Util.displayMessage(e);
			}
		return hislist;
		}
	}


