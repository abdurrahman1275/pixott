package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.pixott.model.Customer;

public class CustomerDao {
public void Signup(Customer customer) {
	String sql="insert into customer (name,mobile,password) values (?,?,?)";
	try(
			Connection conn=Util.getConnection();
			PreparedStatement stmt=conn.prepareStatement(sql);
			){ 
		stmt.setString(1,customer.getName());
		stmt.setString(2,customer.getMobile() );
		stmt.setString(3, customer.getPassword());
		stmt.executeUpdate();
	}

	catch(SQLException e) {
		System.out.println(e.getMessage());
	}
}

/*public static void main(String arsgs[]) {
	CustomerDao dao=new CustomerDao();
	Customer customer=new Customer();
	customer.setName("John");
	customer.setMobile("9566053633");
	customer.setPassword("12345");
	dao.Signup(customer);
}*/
}
	