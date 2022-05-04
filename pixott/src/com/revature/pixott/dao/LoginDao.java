package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.model.Customer;

public class LoginDao {
public boolean login(Customer customer) {
String sql=String.format("select * from customer where mobile='%s' && password='%s';",customer.getMobile(),customer.getPassword());
boolean login=false;
	try(
			Connection conn=Util.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			){
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			customer.setMobile(rs.getString("mobile"));
			customer.setPassword(rs.getString("password"));
			login=true;
		}
		
	}
	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
	return login;
}
}
