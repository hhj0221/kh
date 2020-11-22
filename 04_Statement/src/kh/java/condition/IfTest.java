package kh.java.condition;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		IfTest m = new IfTest();
	//	m.test2();
		//m.test3();
	//	m.test4();
	//	m.test5();
	//	m.test6();
	//	m.test7();
		m.test8();
	}
	/**
	 * @실습문제 
	 * 두수를입력받아서 그중 큰수와 작은 수르 차례로 출력하세요
	 */
	public void test8() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 정수를 입력하세요 : ");
		int Max = sc.nextInt();
		System.out.println(" 정수를 입력하세요");
		int Min = sc.nextInt();
		if(Max>Min) {
			System.out.println(Max+","+Min)	;
		
		}else if(Max<Min) {
			System.out.println(Min+","+Max);
			
			
		}else {
			System.out.println("두수는 같습니다");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void test5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.점수 입력 : " );
		int num = sc.nextInt();
		System.out.print("2.점수 입력 : ");
		int num2  = sc.nextInt();
		if(num>num2) {
			System.out.println(num+","+num2);
			
		}else if(num<num2) {
			System.out.println(num2+","+num);
		}else {
			System.out.println("두수는 같습니다");
		}
		/*
		 * if(num == num2) { System.out.println("두수는 같습니다."); }else{
		 * System.out.println("두수는 같지 않습니다."); }
		 */
		//System.out.printf("1.첫번쨰 입력값 : %d입니다%n2.두전쨰 입력값 : %d입니다%n",num,num2 );
		
	}
	
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력  : ");
		int num = sc.nextInt();
		char grade =' ';
		if(num>=90) {
			System.out.println('A');
			grade = 'A';
			
		}
		if(num >=80 && num<90) {
			System.out.println('B');
			grade = 'B';
			
		}
		if(num >=70&&num<80) {
			System.out.println('C');
			grade = 'C';
			
		}
		if(num >= 60 && num<70) {
			System.out.println('D');
			grade = 'D';
			
			
		}if(num < 60) {
			System.out.println('F');
			grade = 'F';
		}
		System.out.printf("점수 :  %d%n 학점 : %c%n",num,grade);
		
	}

	/**
	 * if......
	 * else if ..
	 * else 
	 * 
	 * 여러 조건식을 직렬화한다.
	 * 참인 조건식의 if문의 실행된다.
	 * if블럭 실행시 나머지 블럭을 건너뛰고, 전체 조건문을 빠져나간다.
	 * 
	 */
	public void test7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력하세요 : ");
		int num = sc.nextInt();
		char grade = ' ';
		if(num>=90) {
			grade ='A';
		}else if(num >=80) {
			grade='B';
			
		}else if(num >=70) {
			grade ='C';
			
		}else if(num >=60) {
			grade = 'D';
			
		}else{
			grade ='F';
		}
		System.out.printf("점수 : %d%n학점 : %c%n",num,grade);
	}
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수입력  : ");
		int num = sc.nextInt();
		char grade =' ';
		if(num>=90) {
			grade = 'A';
			
		}else if(num >=80) {
			grade = 'B';
			
		}else if(num >=70) {
			grade = 'C';
			
		}else if(num >= 60) {
			grade = 'D';
			
			
		}else {
			grade = 'F';
		}
		System.out.printf("점수 :  %d%n학점 : %c%n",num,grade);
		
	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int ss = sc.nextInt();

		if(ss %2!=0) {
			System.out.println("홀수 ");
			
		}else if(ss %2==0){
			System.out.println("a는 짝수 입니다 :");
		}else {
			System.out.println("잘못 입력 하셨습니다");
		
		}
	}

	public void test2() {
	int a = 7;
	
	if(a % 2!= 0) {
		System.out.println("홀수");
	
		
	}else {
		System.out.println("a는 짝수");
	}
	//@ 실습 문제 ㅣ: 사용자 나이를 입력받고
	 	Scanner sc = new Scanner(System.in);
	 	
	 	System.out.print("나이 :");
	 	int age = sc.nextInt();
	 	if(age >=20 ) {
	 		System.out.println("성인 인증 되었습니다.");
	 	}else {
	 		System.out.println("성인 인증 실패하였습니다");
	 	}
		
	}

}
