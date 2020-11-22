package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
	//	t.test1();
		t.test2();
		
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력 ");
		
		int num = sc.nextInt();
		int i = 1;
		while(i<=num) {
			if(i% 2==1) {
				System.out.print("수");
			}else {
				System.out.print("박");
				
			}
			i++;
		}
	}
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력받으면 나오눈 글자수~~:");
	
		int num = sc.nextInt();
		
		String a = "";
		for(int i=1;i<=num;i++) {
			if(i %2 !=0) {
				a = "수";
			}else {
				a ="박";
			}
			System.out.print(a);
			
		}
		return;
	}
}
