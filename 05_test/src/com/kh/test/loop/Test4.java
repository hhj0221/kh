package com.kh.test.loop;

import java.util.Scanner;

/**
 * (문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것) 문자열과 문자열에서 검색될 문자를 입력 받아 문 자열에 그
 * 문자가 몇 개이었는지 개수를 확인하는 프로그램을 작성하세요. 또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후 프로그램을
 * 종료하세요.
 * 
 * 출력 예) 문자열 입력 : application 검색할 문자 입력 : p 'p'가 포함된 갯수 : 2 개
 * 
 * 코드 는 97부터 122까지 문자열 입력 : apple_test123 문자 입력 : ㄱ 영문자가 아닙니다.
 * 
 * @author USER
 *
 */
public class Test4 {

	public static void main(String[] args) {

		Test4 t = new Test4();
		// test1();
		// t.test2();
		// t.test3();
		// t.test4();

		t.test5();

	}

	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println("str : " + str);
		System.out.println("검색할 문자 입력 : ");
		char srCahr = sc.next().charAt(0);

		int i = 0;

		if ((srCahr >= 'A' && srCahr <= 'Z') || (srCahr >= 'a' && srCahr <= 'z')) {
			int cout = 0;
			while (i < str.length()) {

				if (srCahr == str.charAt(i)) {
					cout += 1;
					
				}
			
				i++;

			}
			System.out.print("'" + srCahr + "'가 포함된 갯수: " + cout + "개입니다");

		} else {
			System.out.println("영문자 아님");
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine().toLowerCase();
		System.out.println("str = " + str);
		System.out.print("검색할 문자 입력:");
		char srchCahr = sc.next().toLowerCase().charAt(0);

		if ((srchCahr >= 'A' && srchCahr <= 'Z') || (srchCahr >= 'a' && srchCahr <= 'z')) {
			int num = 0;

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == srchCahr)
					num++;
				System.out.println("'" + srchCahr + "'가 포함된 갯수: " + num + "개입니다");

			}

		} else {
			System.out.println("영문자가 아닙니다");
		}

	}

	/**
	 * (문자열의 길이를 리턴하는 String의 메소드를 api에서 찾아 사용할 것) 문자열과 문자열에서 검색될 문자를 입력 받아 문 자열에 그
	 * 문자가 몇 개이었는지 개수를 확인하는 프로그램을 작성하세요. 또, 검색할 문자가 영문자가 아니면 "영문자가 아닙니다." 출력후 프로그램을
	 * 종료하세요.
	 * 
	 * 출력 예) 문자열 입력 : application 검색할 문자 입력 : p 'p'가 포함된 갯수 : 2 개
	 * 
	 * 코드 는 97부터 122까지 문자열 입력 : apple_test123 문자 입력 : ㄱ 영문자가 아닙니다.
	 * 
	 * @author USER
	 *
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자를 입력하세ㅇ요 : ");
		String inPut = sc.next();
		System.out.print("검색할 문자 입력 : ");
		char inPutNum = sc.next().charAt(0); // a~z
												// A~Z
		// 갯수 표현?

		if ((inPutNum >= 65 && inPutNum < 96) || (inPutNum >= 97 && inPutNum <= 122)) { // 아스키를 써서 비교 검사후 반복
			// 대문자 이거나 소문자 이거나
			int num = 0;
			System.out.println("length = " + inPut.length());
			for (int i = 0; i < inPut.length(); i++) { // 전체 길이만큼 반복 0,1,2,3,4,5
				char c = inPut.charAt(i); // 특정 인덱스 값의 길이 안에 찾는거
				if (c == inPutNum)// 해당 내용의 0번지 1번지 2번지 내용을 플러스?
					num++;
			}
			System.out.println("'" + inPutNum + "'가 포함된 갯수: " + num + "개입니다");
		}
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력하세ㅇ요 : ");
		String inPut = sc.next();
		System.out.println("검색할 문자 입력 : ");
		char inPutNum = sc.next().charAt(0); // a~z
												// A~Z
		// 갯수 표현?
		int num = 0;
		if ((inPutNum >= 65 && inPutNum < 96) || (inPutNum >= 97 && inPutNum <= 122)) { // 아스키를 써서 비교 검사후 반복
			// 대문자 이거나 소문자 이거나
			for (int i = 0; i < inPut.length(); i++) {
				/**
				 * 안에 하나를 조건을 제시 사용자가 검색할 문자 InpuNum을 입력했을때 이 값이 inPut의 i값과 값으면 ㅅ 실행후
				 */

				if (inPutNum == inPut.charAt(i)) {

					num += 1;
				}
			}

		} else {
			System.out.println("영문자가 아닙니다.");
		}
		System.out.println(inPutNum + "가 포함된 갯수는 " + num + "개입니다");

	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자를 입력하세요: ");
		String input = sc.next();

		System.out.print("검색할 문자 입력: ");
		char inputCh = sc.next().charAt(0);// 입력 값의 첫번쨰 글짜
		// charAt()은 String으로 저장된 문자열 중에서 한 글자만 선택해서
		// char타입으로 변환해준다

		int num = 0;
		if ((inputCh >= 65 && inputCh <= 96) || (inputCh >= 97 && inputCh <= 122)) {
			for (int i = 0; i < input.length(); i++) {
				if (inputCh == input.charAt(i)) {
					num += 1;

				}
			}
		}

		else {
			System.out.print("영문자가 아닙니다");
			return;
		}

		System.out.print(inputCh + "가 포함된 갯수는 : " + num + "개");

	}

}
