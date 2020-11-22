package coo.oop.book.model.Book;

public class Book {

	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	public Book() {
		
	}


	public Book(String title,int price,double discountRate,String author) {
		this.title =title;
		this.price=price;
		this.discountRate =discountRate;
		this.author = author;
	}
	
	public void bookInfomation() {
		System.out.print(title + ":");
		System.out.print(price + ":");
		System.out.print(discountRate + ":");
		System.out.print(author );	
		System.out.println();
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
