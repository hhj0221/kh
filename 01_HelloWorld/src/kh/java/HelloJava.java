package kh.java;

import java.util.Date;

import kh.java.other.HwangHyunJun;

/*
 * package는 모두 소문자로 작성
 * 단어벼로 끊어서 작성한다.
 * 
 * class명은 대문자로 시작한다.
 * 단어가 연결될때는 연결된 단어는 첫글자는 대문자로 시작한다.
 * --CamelCasing
 */

public class HelloJava {

	/*
	 * 자바는 메소드 단위로 호출하면서 프로그램이 진행된다. 실행코드는 반드시 메소드안에 작성해야한다.
	 * 
	 */

	public static void main(String[] args) {
		/*
		 * 객체 레시피 클래스를 객체로 만들어주는 문법
		 * 
		 */
		// 클래스     변수명
		HelloJava hello = new HelloJava();
		// 샘이 한거
		HelloJava hellow = new HelloJava();
		hellow.callMyName();
		hello.test();// 메솓 호출
		
		/*
		 * 내가한거 hello.callMyName();
		 */

		// HelloKH의 welcome메소드를 호출하기
		HelloKH Kh = new HelloKH();
		Kh.welcome();

		// 다른 패키지를 클래스를 사용하라면 , import문을 반드시 작성해야 한다.
		// kh.java.other.HwnagHyunJun.say을 호출
		HwangHyunJun hhj = new HwangHyunJun();
		hhj.say();
		
		
		// jdk가 제공하는 클래스 가져다 쓰기
		// java.util.Date
		Date today = new Date();
		System.out.println(today);
		
		// java.lang.String
		// java.lang은 import없이 쓸수 있는 유일한 패키지.
		String name = new String("황현준");
		System.out.println(name);

	}

	public void test() {
		System.out.println("안뇽!!!");

	}

	/*
	 * 메소드명은 소문자로 시작 동사로 메소드의 내용을 간단히 설명할 수 있어야 한다. 연결된 단어의 첫글자는 대문자로 작성 public void
	 * kh.java.Hellojava.CallMyName
	 * 
	 */
	public void callMyName() {
		System.out.println("홍길동");
	}
}
