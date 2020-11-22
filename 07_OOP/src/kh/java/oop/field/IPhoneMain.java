package kh.java.oop.field;

public class IPhoneMain {
	/**
	 * 클래스변수 (IPhone.WIDTH) : 프로그램 시작시 부터(해당클래스가 최초사용시) ~ 프로그램 종료시 
	 * 인스턴스변수 ( owner): 객체생성시 ~ 객체소멸시(가비지 컬렉터에 의한 삭제 될때 바로 삭제가 된다)
	 * 지역변수 (sum): 메소드호출시 ~ 메소드 종료시
	 * 
	 */

	public static void main(String[] args) {
		//클래스 변수입니다.
		IPhone hong = new IPhone();
		hong.setOuner("홍길동");
		hong.setPhoneNumber("010-9818-9869");
		IPhone sin = new IPhone();
		sin.setOuner("신사임당");
		sin.setPhoneNumber("010-1234-2897");
		System.out.printf("%s :  %s%n",hong.getOwner(),hong.getPhoneNumber());
		System.out.printf("%s :  %s%n",sin.getOwner(),sin.getPhoneNumber());
		/*
		 * //staitc hong.width =15; System.out.println(hong.width);
		 * System.out.println(sin.width);
		 */
		//공유 목적일때 객체를 접극하는것이라 아니라 클래스로 접근이 가능하다.
		
		System.out.println(IPhone.WIDTH);
		System.out.println(IPhone.HEIGHT);
		//IPhone.WIDTH =12 상무시므로 값 불가
		hong.heySiri(3, 10);  
		hong.heySiri(3, 5);
		//홍 아이폰 객체 삭제
		hong = null;
	}
}
