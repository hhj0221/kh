package kh.java;
// packge는 보통 domain을 거꾸로 작성 한다. .kr.or.iei\	//
/**javadoc 주석
 * HellWorld 우리가 이클립스에서 사용 하는 클래스입니다

 * 
 * @param args
 */
public class HelloWorld {

	/**
	 * (메소드 레벨)
	 * main 메소드는 프로그램을 실행하는 첫 메소드입ㄴ다.
	 * main 메소드는 없이는 프로그램을 시작할 수 없습니다.
	 */
	
	public static void main(String[] args) {
		
		System.out.println("황현준입니다.");
		System.out.println("HelloWrold");
		int var =10;
		int result ;
		
		result = var ++;
		System.out.println(result);
		result = ++var;
		System.out.println(result);
	}

}
