package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Test3 t = new Test3();
		// t.test1();
		t.test2();

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력하기: ");

		int dan = sc.nextInt();
		int i = 1;
		if ( dan>= 1 && dan <=9) {
			while (i >= 1 && i <=9) {

				System.out.println(dan + " * " + i + "=" + (dan * i));
				i++;
			}
			
		} else {
			System.out.println("잘못 입력 하셨씁니다 .프로그램 종료합니다");
			
			
		}

	}

	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력하기: ");

		int dan = sc.nextInt();
		if (dan >= 1 && dan <= 9) {
			for (int i = 1; i <= 9; i++) {

				System.out.println(dan + " * " + i + "=" + (dan * i));
			}
		} else {
			System.out.println("잘못 입력 하셨씁니다 .프로그램 종료합니다");

		}

	}

}
