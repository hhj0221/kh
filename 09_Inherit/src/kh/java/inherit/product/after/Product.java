package kh.java.inherit.product.after;

public class Product {
	
	 private String brand;
	 private String productName;
	 private int price;
	 
	 
	 
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product() {

	}
	public Product(String brand, String productName, int price) {
		super();
		this.brand = brand;
		this.productName = productName;
		this.price = price;
	}
	public String getProductInfo() {
		return brand + "," + productName + ", " + price ;
	}
	/**
	 * 오버라이드 하는것을 명시적으로 표현
	 * 부모메소드의 시그니쳐와다른경우, 컴파일오류를 유발
	 */

	
	 
}
