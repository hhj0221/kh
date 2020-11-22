package kh.java.inherit.product.after;

public class SmartPhone extends Product {

	private String os;

	private String carrier;

	public SmartPhone() {
		super();
	}

	public SmartPhone(String brand, String productName, int price, String os, String carrier) {
		setBrand(brand);
		setPrice(price);
		setProductName(productName);

		this.os = os;
		this.carrier = carrier;

	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	@Override
	public String getProductInfo() {
		return super.getProductInfo()+"," + os + ", " + carrier;
	}
}
