package com.revature.kbms.Dao;

import java.sql.SQLException;
import com.revature.kbms.constants.*;
import com.revature.kbms.model.*;
import com.revature.config.DatabaseConnection;
import java.util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDaoImpl implements AdminDao {

	public List<Product> getProducts() throws SQLException {
		Connection con = DatabaseConnection.getConnection();
		List<Product> list = new ArrayList<Product>();

		String selectSpecificQuery = Constants.SELECT_SPECIFIC_QUERY;
		PreparedStatement ps = con.prepareStatement(selectSpecificQuery);

		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Product product = new Product();
			product.setProductId(rs.getString(1));
			product.setProductName(rs.getString(2));
			product.setTotalStock(rs.getString(3));
			product.setBestBefore(rs.getString(4));
			product.setPricePerUnit1(rs.getString(5));
			product.settypeOfProduct(rs.getString(6));
			product.setProductName(rs.getString(7));

			list.add(product);
		}
		return list;
	}

}
