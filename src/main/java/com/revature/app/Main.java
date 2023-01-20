package com.revature.app;

import java.util.Iterator;
import java.util.List;

import com.revature.kbms.Dao.AdminDaoImpl;
import com.revature.kbms.model.Product;

public class Main {
	public static void main(String[] args) throws Exception {
		List<Product> list = new AdminDaoImpl().getProducts();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			System.out.println(product.getProductName());
			System.out.println(product.getBestBefore());
			System.out.println(product.getPricePerUnit());
			System.out.println(product.getProductCount());
			System.out.println(product.getTotalStock());
			System.out.println(product.getBestBefore());
			System.out.println(product.getProductId());

		}
	}

}
