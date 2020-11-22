package kh.java.oop.method;

/**
 * method -클래스메소드 static -인스턴스메소드 non-static
 * 
 * static자원(필드, 메소드)은 non- static자원(필드, 메소드)를 참조할 수 없다.
 * 
 * @author USER
 *
 */

public class MethodTest {
	static int sno = 99;
	int num = 100;

	public static void main(String[] args) {
		MethodTest m = new MethodTest();
		//객체를 만든 후에 해야한다. 	MethodTest m = new MethodTest();
		
	//	m.instanceMethod();
		MethodTest.classMethod();
		//결가값 99이다 생명주기랑 관련있다 .

	}		
	
		//static가 붙으면 클래스 메소드
		public static void classMethod() {
			System.out.println(sno);
			//System.out.println(num);//인스턴스변수 사용 불가
			
			
		}
	/**
	 * instance메소드에서는 static/non-static 자원 모두 사용가능
	 * 
	 */

	public void instanceMethod() {
		System.out.println(sno);
		System.out.println(num);
		classMethod();
	}

}
