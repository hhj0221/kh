package kh.java.oop.field;

/**
 * 찍어내기 위한 IPhone
 *
 */
public class IPhone {
	// 2.전역변수 - 클래스 변수
		 //객체간 공유할 만한 정보 
	public static final int WIDTH = 10;
	public	static final int HEIGHT =10;
	//(크기가 갔다면 static에 담는게 좋다)
	
	// 1.전역변수 - 인스턴스(맴버)변수
	private String owner;
	private String phoneNumber;
	
	
	//3.지역변수
	//메소드 영역에 선언
	//접근 제한자 ,static 키워드를 가질 수 없다.
	
						//매개변수 
	public void heySiri(int a, int b) {
		 int sum =a+b;
		 System.out.println("두수의 합은 : "+ sum + "입니다 ");

	}
	public void setOuner(String owner) {
		this.owner = owner;

	}

	public String getOwner() {
		return owner;

	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;

	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
