package kh.java.type;

/**
 * 내용 정리
 * 
 * 변수란? 메모리(RAM)에 하나의 값을 기록하기 위한 물리적 공간
 * 
 * 자료형을 알고 있어야 한다. 1.기본형 Primitive Type - 실제 데이터, 값을(Literal)을 저장 - 크기가 각각 다른
 * 8가지 타입(논리형, 문자형, 정수형, 실수형) 2.참조형 Reference Type - 8가지 기본형을 제외한 나머지 - 주소값을 저장
 * - 4byte
 *
 */
public class PrimitiveType {
	public static void main(String[] args) {

		PrimitiveType p = new PrimitiveType();
//		p.test1();
//		p.test2();
//		p.test3();
//	p.test4();

		p.test5();

	}

	/**
	 * Data Overflow 지정한 타입의 범위를 넘어선 값이 오게되면, 최소값으로 다시 돌아간다. .
	 */
	public void test5() {
		int iNum = Integer.MAX_VALUE;
		iNum = iNum + 1;
		System.out.println("iNum = " + iNum);
		int num =10;
		System.out.println("re  =" +(12*num++));
	}

	/**
	 * 상수 constant
	 * 
	 */

	public void test4() {
		final int NUM = 100;
		final int AGE_LIMIT = 20;
		int tomAge = 18;
		int janeAge = 24;
		boolean tomAllowed = tomAge > AGE_LIMIT;
		boolean janeAllewed = janeAge > AGE_LIMIT;
		System.out.println("byte : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
		System.out.println("short : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println("int : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);

	}

	/**
	 * 초기화 변수의 선언과 값대입 동시에 하는것.
	 */
	public void test3() {
		double dNum = 123.456;
		System.out.println("dNum= " + dNum);

		char last = '준';
		System.out.println("last = " + last);

		int Year = 2020;
		System.out.println("Year = " + Year);

	}

	/**
	 * 기본형의 종류 1.문자형 char 2byte
	 * 
	 * 2.정수형 byte 1byte short 2byte int 4byte long 8byte
	 * 
	 * 3.실수형 float 4byte double 8 byte
	 * 
	 * 
	 * 4.논리형 boolean 1byte
	 * 
	 * 1. 대소문자 구분 abc Abc 2. 길이제한 없음 3. 자바예약어는 사용할 수 없다. 4. 특수문자는
	 */
	public void test1() {
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 대입 연산자 :

		bNum = 100;
		bNum = -100;
		bNum = 50;

		sNum = 30000;
		iNum = 12345678;
		lNum = 123456789043242434l;
		System.out.println("bNum = " + bNum);
		System.out.println("sNum = " + sNum);
		System.out.println("iNum = " + iNum);
		System.out.println("lNum = " + lNum);

		float fNum;
		double dNum;

		fNum = 0.123f;
		fNum = 0.1234567890f;
		dNum = 0.1234567;
		dNum = 0.12345678901234567890;
		System.out.println("FNum : " + fNum);
		System.out.println("dNum : " + dNum);

		char ch;
		ch = 'a';
		System.out.println("ch = " + ch);

		boolean bool;
		bool = true;
		bool = false;

		System.out.println("bool : " + bool);
	}

	public void test2() {

		int a;
		int b;
		int c;

		a = 10;
		b = 20;
		c = a + b;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c ; " + c);
		boolean bool;
		bool = a < b;
		bool = a > b;
		bool = a >= b;
		bool = a <= b;
		bool = a == b;
		bool = a != b;
		System.out.println("bool = ");

	}

}
