package com.revature.app.menu;

import java.sql.SQLException;
import java.util.List;

import com.revature.kbms.Dao.AdminDaoImpl;

public class Main {

	public static void main(String[] args) throws SQLException {
		MenuDrivenApplication.showMenu();
		AdminDaoImpl adi = new AdminDaoImpl();
		List<com.revature.kbms.model.Product> al= adi.getProducts();
		for(com.revature.kbms.model.Product p:al) {
			System.out.println(p);
		}
		

	}

}
