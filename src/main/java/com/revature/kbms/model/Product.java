package com.revature.kbms.model;

public class Product {

	public Product() {
		// TODO Auto-generated constructor stub
	}
	    private String productId;
	    private java.lang.String productName;
	    private int productCount;
	    private int totalStock;
	    private java.lang.String bestBefore;
	    private double pricePerUnit;
	    
		public Product(int productId, String productName, int productCount, int totalStock, String bestBefore,
				double pricePerUnit) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.productCount = productCount;
			this.totalStock = totalStock;
			this.bestBefore = bestBefore;
			this.pricePerUnit = pricePerUnit;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(String string) {
			this.productId = string;
		}
		public java.lang.String getProductName() {
			return productName;
		}
		public void setProductName(java.lang.String productName) {
			this.productName = productName;
		}
		public int getProductCount() {
			return productCount;
		}
		public void setProductCount(int productCount) {
			this.productCount = productCount;
		}
		public int getTotalStock() {
			return totalStock;
		}
		public void setTotalStock(int totalStock) {
			this.totalStock = totalStock;
		}
		public java.lang.String getBestBefore() {
			return bestBefore;
		}
		public void setBestBefore(java.lang.String bestBefore) {
			this.bestBefore = bestBefore;
		}
		public double getPricePerUnit() {
			return pricePerUnit;
		}
		public void setPricePerUnit(double string) {
			this.pricePerUnit = string;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", productCount=" + productCount
					+ ", totalStock=" + totalStock + ", bestBefore=" + bestBefore + ", pricePerUnit=" + pricePerUnit
					+ "]";
		}
		public void setTotalStock(String string) {
			// TODO Auto-generated method stub
			
		}
		public void setPricePerUnit1(String string) {
			// TODO Auto-generated method stub
			
		}
		public void settypeOfProduct(String string) {
			// TODO Auto-generated method stub
			
		}
		

	     

}
