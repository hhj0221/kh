package kh.java.inherit.product.after;


public class ProductAterMain {
	public static void main(String[]args) {
	Desktop d = new Desktop("삼성", "오딧세이", 1_500__000, "window 10", "27인치모니터	", "기게식 키보드");
	
	SmartPhone s = new SmartPhone("애듶", "아이폰12", 1_400_000, "ios", "LG");
//	
	Television tv = new Television("LG"	, "롤러블TV"	,100_000_000,"50인치"	 );

		System.out.println(s.getProductInfo());
	System.out.println(tv.getProductInfo());
	System.out.println(d.getDecktopInfo());
	}
}
