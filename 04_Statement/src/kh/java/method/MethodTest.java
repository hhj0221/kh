package kh.java.method;

import java.util.Scanner;

/**
 *  - 처리절차를 모아둔 곳 ->  반복전인 작업을 한번만 작성해서 처리
 * 메소드 - 매개변수 : 메소드 호풀시에 전달된 갑싱 담기는 변수
 * 
 * - 리턴값 : 메소드 호출 결과값 , 없거나 (void)특정하나의 타입을 가진다.
 * 	
 * 
 *
 */
public class MethodTest {

	public static void main(String[] args) {

		MethodTest m = new MethodTest();
		// m.test1();
		m.test2();
		System.out.println("프로그램 종료");
	}

	/**
	 * 리턴값
	 */
	public void test2() {
		int a = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", a);

		int r = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", r);
		int c = inputNumber();
		System.out.printf("[%d]를 입력하셨습니다.%n", c);
		return;
	}

	public int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");

		int num = sc.nextInt();
		return num;
	}

	/**
	 * 매개변수 : 메소드 선언부에 정의된 변수 매개인자(인수) : 메소드 호출시 전달되는 값
	 */
	public void test1() {
		int age = 30;
		String name = "홀길동";
		// printName(name);
		printPerson(name, age);
		name = "신사임당";
		age = 50;
		// printName(name);
		printPerson(name, age);
	}

	public void printPerson(String name, int age) {
		System.out.printf("안녕하세요, 제이름은 %s이고,나이는 %s입니다.%n", name, age);
	}

	// 매개 변수
	public void printName(String name) {
		System.out.printf("안녕하세요, 제나이는 %s입니다.%n", name);
	}
}
