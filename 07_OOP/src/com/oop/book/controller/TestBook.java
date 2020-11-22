package com.oop.book.controller;

import coo.oop.book.model.Book.Book;

public class TestBook {

	public static void main(String[] args) {
		Book b1= new Book();
		
		Book b2 = new Book("신비한 동물 사전 ",20000, 0.2,"누굴까");
				
		b1.bookInfomation();
		b2.bookInfomation();
		System.out.println("======================");
		b1.setTitle("자바의 정석");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("윤상섭");
		b1.bookInfomation();
		System.out.println("==========3단계=========");
		
		System.out.println("도성명 : " + b1.getTitle());
		System.out.println("할인된 가격 : " +(int)(b1.getPrice()-(b1.getPrice()*b1.getDiscountRate())));
		System.out.println("도서명 : "+ b2.getTitle());
		System.out.println("할인된 가격 : " +(int)(b2.getPrice()-(b1.getPrice()*b2.getDiscountRate())));
	}

}
