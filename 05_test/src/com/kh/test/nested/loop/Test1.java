package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		 t.test();
	//	t.test1();
	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		int a = 0;

		for (int i = 0; i < number; i++) {
			System.out.print(i);
			for (int j = 0; j <= i; j++) {
				System.out.print(i);
				System.out.print("*");

			}

			System.out.println();
		}

	}

	public void test_() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를입력하세여 : ");
		int number =sc.nextInt();
		int a =0;
		if(number<= 0) {
			System.out.println("양수가 아니빈다;");
			return;
			
		}
		for(int i =0 ; i<number;i++) {
			for(int j =0;j<=i;i++) {
				System.out.println("*");
			}
		}
		
	}
	public void test() {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력 하세여 :");
		int number = sc.nextInt();
		int a = 0;

		if (number <= 0) {

			System.out.print("양수가 아닙니다 다시입력하세요");

			return;

		}
		for (int i = 0; i < number; i++) {
			System.out.print(i+1);

			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			

			}

			System.out.println();
		}
	}

}
