package kh.java.print;

public class PrintTest {

	private void printTest() {
		// 출력 메소드
		// println 출력 + 줄바꿈
		System.out.print(1 + "\n");
		System.out.print(2 + "\n");
		System.out.print(3 + "\n");

		System.out.println(1);
	}

	public void printValueTest() {

		// 숫자 System.out.println(2313);
		System.out.println(1234.2);
		System.out.println(12 + 34);

		System.out.println(1 + 3 * 2);

		// 문자 || 문자열

		System.out.println('b');
		System.out.println(12 + "4");

		System.out.println(1 + 2 + "3");
		System.out.println("1" + 2 + 3);
		// 문자는 숫자와 만나면, 숫자로 처리된다.
		// 문자는 문자열 과 만나면, 문자열로 된다.
		System.out.println('a' + 1);
		System.out.println('b' + 2);
		System.out.println('a' + "가나다");
		// ASCII code
		// 문자를 숫자로 변환하기위한 약속 (매핑)
		System.out.println('c' + 3);
		System.out.println('Z' - 3);
		System.out.println('0' + 3);
		System.out.println('A' + 'a');
	}
		/**
	 * escape문자
	 * 인쇄되지 않거나 키보드로 표현불가능한 기능성문자를 표현
	 * \(역슬래시) + 문자
	 * 
	 * - \n : 개행처리
	 * - \t : 탭처리
	 * - \r : carriage return
	 * 		  \r\n 
	 * - \\ : \(역슬래시)를 문자 그대로 사용
	 * - \"
	 * - \'
	 * 
	 */

	public void escapingTest() {
		System.out.println("가\n나\t다");
		System.out.println("a\\b\\c\\d");
		System.out.println("그는 말했다. '안녕~'");
		System.out.println("그는 말했다. \"안녕~\"");
		System.out.println("C:\\Users\\USER\\Downloads");
	}
	/*
	 * 		
	 "ShakeIt 알람"
--------------------------------------------
	흔들기	쏴리질러	터치하기	원터치
--------------------------------------------
아침부터 쌩쑈를 해야 알람을 끌수 있음.
	 */
	private void shakeIt() {
		
		System.out.println("\t\"ShakeIt\" 알람\n----------------------------------------\n\t흔들기 \t쏴리 질러\t터치하기\t원터치\t\n----------------------------------------\n\t아침부터 썡쇼를 해야알람을 끌수 있음.");
		
	}

	public static void main(String[] args) {

		PrintTest p = new PrintTest();
		/*
		 * // p.printValueTest(); // p.printTest(); p.escapingTest(); p.shakeIt();
		 */
		p.shakeIt();
	}

	

}
