package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test1();
	//	t.test2();
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int i =1;
		int sum =0;
		i=0;
		while (i<=num) {
			System.out.println(i);
			i+=2;
			sum += i;
			
		}
		System.out.println("짝수의합은 "+sum);

			}
	
	public void test1() {
		Scanner  sc= new Scanner(System.in);
		System.out.print("입력받은 정순 단/짝수의 합만 입력하세요");
		
		int num = sc.nextInt();
		int sum =0;
		for(int i =1 ; i<=num;i ++) {
			
			if(i % 2 == 0) {
				sum+=i;
			}
		
		}
		
		System.out.print("짝수의합은: "+sum);
	}
}
