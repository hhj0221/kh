package kh.java.inherit.product.after;

public class Television extends Product {

	private String size;

	public Television() {
		super();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Television(String brand, String productName, int price, String size) {

		setBrand(brand);
		setPrice(price);
		setProductName(productName);

		this.size = size;

	}

	@Override
	public String getProductInfo() {
		return super.getProductInfo() + "," + size;
	}
}
