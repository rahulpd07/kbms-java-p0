package com.revature.app.menu;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import com.revature.kbms.Dao.AdminDao;
import com.revature.kbms.Dao.AdminDaoImpl;
import com.revature.kbms.Util.*;
import com.revature.kbms.constants.*;

public class MenuDrivenApplication {

	public static void showMenu() {
		System.out.println(Constants.WELCOME_MESSAGE);
		System.out.println(Constants.SIGN_IN);
		System.out.println(Constants.EXIT);

		char choice = 'y';

		do {

			Scanner choiceScan = new Scanner(System.in);
			choice = choiceScan.next().charAt(0);
			switch (choice) {
			case '1':
				signIn();
				break;
			case '2':
				return;
			default:
				System.out.println("\t\t\tWrong option selected!");
				break;

			}
		} while (choice != 'n');
	}

	private static void signIn() {// throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println(Constants.ADMIN_PREFFERED_LOGINID);
		String loginId = scan.nextLine();

		System.out.print(Constants.PASSWORD);
		String password = scan.nextLine();
		System.out.println("*********You are successfully logged in********");
		System.out.println("*****please select any of the option*****");
		System.out.println("1.View Details");
		System.out.println("2.Please Enter PRODUCT_ID To Search:");

	}
}
