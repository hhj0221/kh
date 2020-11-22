package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.test1();
		/**
		 * 클래스명: com.kh.test.nested.loop.Test2.java
		 * 
		 * 메소드명: public void test() 정수하나 입력받아, 그 수가 양수일때만 입력된 수를 줄 수로 적용하여 다음과 같이 출력되게
		 * 하는 프로그램을 만들어보자. 출력예) 정수 입력 : 5
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *
		 * 
		 */
		t.test2();
		
	} public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int input = sc.nextInt();
		if(input<1) {
			System.out.println("양수가 아님");
			return;
		}
		//5행 입력시  i: 012345678(9행이 나와야 한다.)
		for(int i =0 ;i < (input*2-1);i++) {
			if(i< input) {
				for(int j = 0; j<= i;i++) {
					System.out.println("*");
				}
			}
		
				else {
					for(int  j =0; j< input;j++) {
						if(j >( i - input)){
						//j:0 > 5-5
							System.out.println("*");
						}else {
							System.out.println(" ");
						}
					}
				}
			}
		}


	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int input = sc.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("★");

			}
			System.out.println();
		}
			for (int i = 0; i < input; i++) {
				for (int a = 0; a <= i; a++) {
				System.out.print(" ");

			}
			for (int k = input; k >i; k--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
}