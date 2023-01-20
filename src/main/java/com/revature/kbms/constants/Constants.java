package com.revature.kbms.constants;
 
	public class Constants {

		 
	    public static final java.lang.String WELCOME_MESSAGE = "****WELCOME TO KITCHEN BASKET *****";
	    public static final java.lang.String SIGN_IN = "1.Sign In";
	    public static final java.lang.String EXIT = "2. Exit";
	    public static final java.lang.String  ADMIN_PREFFERED_LOGINID = "Enter Login Id: ";
	    public static final java.lang.String PASSWORD = "Enter Password: ";
		public static final String SELECT_SPECIFIC_QUERY = "SELECT `product`.`PRODUCT_ID`,\r\n"
				+ "    `product`.`PRODUCT_NAME`,\r\n"
				+ "    `product`.`PRODUCT_COUNT`,\r\n"
				+ "    `product`.`TOTAL_STOCK`,\r\n"
				+ "    `product`.`BEST_BEFORE`,\r\n"
				+ "    `product`.`PRICE_PER_UNIT`,\r\n"
				+ "    `product`.`TYPE_OF_PRODUCT`\r\n"
				+ "FROM `kbms_project`.`product`;\r\n"
				+ "";
		public static final String SQUERY ="select*from product";
		 
		}
		
		


