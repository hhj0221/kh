package kh.java.array;

import java.util.Scanner;

/**
 * 변수 : 하나의 자료형, 한가지 값을 보관
 *
 * 배열 : 하나의 자료형 , 여러가지 값을 보관
 */
public class ArrayTest {

	public static void main(String[] args) {

		ArrayTest a = new ArrayTest();
		// a.test1();
		// a.test2();
		// a.test3();
		// a.test4();
		// a.test5();

		// a.test6();
		a.test7();
	}

	/**
	 * 배열 초기회ㅏ - 배열 할당 및 값대입
	 * 
	 */
	public void test7() {
		int[][] arry = { { 5, 5, 5, 5, 5 }, { 10, 10, 10 }, { 20, 20, 20, 20 }, { 30, 30 } };
		byte[] arr1 = { 1, 2, 3, 4, 5 };
		byte[] arr2 = arr1;
		System.out.println(arry[1].length);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
	}

	public void printArr(byte[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if (i < arr.length - 1) {
				System.out.println(",");
			}
		}
	}

	/**
	 * 배열의 특징
	 * 
	 * -배열의 크기는 변경할 수없다. - 배열의 삭제
	 */
	public void test6() {
		int[] arr1 = new int[5];
		System.out.println(arr1.length);
		System.out.println(arr1.hashCode());
		// 새로운 배열을 할당
		arr1 = new int[10];
		System.out.println(arr1.length);
		System.out.println(arr1.hashCode());
		// 배열 삭제
		arr1 = null;
		// 참조형변수가 heap게 가리키는 객체가 없을떄(null인 경우)
		// 메소드,속겅등을 참조하면 NullPointerExxception 예외발생
		System.out.println(arr1.length);
		System.out.println("프로그램 종료 -------------");
	}

	public void test5() {
		// 선생님 배열 순서
		// 1.배열 생성
		char[] alphabet = new char[26];
		// 2.요소 값대입
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('a' + i);
			System.out.print(alphabet[i]);
			System.out.print((i < alphabet.length - 1) ? "," : "");

		}

		/*
		 * char[] charArr = new char[26]; for (int i = 0; i < charArr.length; i++) {
		 * charArr[i] = (char) ('a' + i);
		 * 
		 * }
		 * 
		 * for (int i = 0; i < charArr.length; i++) { System.out.print(charArr[i]); if
		 * (i != charArr.length - 1) { System.out.print(","); } }
		 */
	}

	public void test4() {
		// 1.배열 선언 및 할당
		int[] numArr = new int[8];
		// 2.요소의 값대입
		for (int i = 0; i < numArr.length; i++) {
			// i가 0이고
			// 배열 i값에 넣고 i+1을 해주라
			// 10단위numArr[i] =(i+1)*10;
			// 2468 numArr[i] =(i+1)*2
			// numArr[i] =(i+1)*2; //1을 더해주는 이유는 0부터 시작하기 떄문에
			numArr[i] = (i + 1) * 2;
			// 1. 0 0 +1 0번지에 1을 대입
			// 2.i++ 해서 i =1
			// 3.2 = 2 +1
			// 4.i++ -> =2
			// 5.3

		}

		// 3.요소값 사용
		for (int i = 0; i < numArr.length; i++) {

			System.out.print(numArr[i]);
			if (i != numArr.length - 1) { // 배열 변수.길이 만큼이지만 -1 이면 마지막껄
				// 마지막 인데스 에서 뺴줘라 라는뜻
				System.out.print(",");
			}
		}
	}

	public void test3() {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요:");
		name = sc.nextLine();
		String[] strArr = new String[10];
		strArr[0] = "홍길동";
		strArr[1] = "들리";
		strArr[2] = "도우너";
		for (int i = 0; i < 3; i++) {
			System.out.println(strArr[i]);
		}

	}

	/**
	 * @실습문제 문자배열을 이름길이로 생성하고, 각 인데스에 일므을 대입후출력할것
	 *
	 */
	public void test2() {

		// 1.배열선언
		char[] name;
		// 2.heep에 배열 할당

		name = new char[3];
		// 배열 요서 값 대입
		name[0] = '황';
		name[1] = '현';
		name[2] = '준';
		System.out.print(name[0]);
		System.out.print(name[1]);
		System.out.print(name[2]);

	}

	public void test1() {
		int kor = 80;
		int eng = 100;
		int math = 90;

		// 1.배열변수 선언
		int[] arr;
		// 2.배열 할당(heap영억에 확보)
		// 배열 크기글 반드시 지정할것.
		// heap은 자료형별 기본값으로 초기화한다.
		// int : 0 .dubble : 0.0 .boolean: fals, char : ' '
		// 참조형 : null;
		arr = new int[3];
		// 배열 요서 값대입
		arr[0] = 80;
		arr[1] = 100;
		arr[2] = 90;
		// 배열 요소 값 확인
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		// HEPP 변수공간의 이름이 없다
		// 콜스텍에서는 가능
		// 콜스텍은 어떤 변수를 선언하면 초기화가 안되고 힙에선느 초기화가 지원한다
		//

	}

}
