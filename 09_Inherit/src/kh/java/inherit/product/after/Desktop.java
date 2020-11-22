package kh.java.inherit.product.after;

public class Desktop extends Product {

	private String os;
	private String monitor;
	private String keyboard;

	public Desktop() {
	}

	public Desktop(String brand, String productName, int price, String os, 
			String monitor, String keyboard) {

		/*
		 * this.brand = brand; this.productName = productName; this.price = price;
		 */
		//1.public메소드를 통해 우회접근이가능하다
		setBrand(brand);
		setPrice(price);
		setProductName(productName);
		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	public String getDecktopInfo() {
		return getBrand() + "," + getProductName() + ", " + getPrice() + "," + os + ", " + monitor + "," + keyboard;
	}
	/**
	 * 오버라이드 하는것을 명시적으로 표현
	 * 부모메소드의 시그니쳐와다른경우, 컴파일오류를 유발
	 */
	@Override
	public String getProductInfo() {
		//부모를 Product의 getProuctInfo 호출
		
	 return super.getProductInfo()+ "," + os + ", " + monitor + "," + keyboard;
		
	}

}
