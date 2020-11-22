package kh.java.args;

/**
 * 매개변수 parameter : 변수  메소드 선운부 작성한 변수
 * 
 */
public class ArgumentsTest {
	/**
	 * JVM이 프로그램의 Main 메소드를 호출할때, String[]을 전달한다.
	 * 프로그램 시작시  사용ㅇ자가 프로그램 전달한 문자열 공백 기준으로 잘라서,
	 * 문자열 배열로 전달한ㄷ.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArgumentsTest a = new ArgumentsTest();
		/*
		 * a.test1(3); //매개 인자 for(int i=0;i<args.length;i++) { System.out.println(i +
		 * " : "+ args[i]); }
		 */
		a.adder(args);
	}	public void adder(String[]args) {
		int sum =0;
		for(int i =0 ;i< args.length;i++) {
			
			//문자열 - > 정수현환 하는법은
			
			sum += Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
						//매개 변수
	public void test1(int num) {
		
	}

}
