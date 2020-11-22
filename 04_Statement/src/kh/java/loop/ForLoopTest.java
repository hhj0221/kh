package kh.java.loop;

import java.util.Scanner;

/**
 * for
 * 
 * while
 * 
 * do ~ while
 * 
 * 
 *
 */
public class ForLoopTest {

	public static void main(String[] args) {
		ForLoopTest f = new ForLoopTest();
		// f.test1();
		//
		// f.test2();
		// f.test3();
		// f.test4();
		//f.test5();
	//	f.test1_1();

		//f.test2_2();
		//f.test3_3();f
//	f.test4_1();
	f.test5_1();
	}
	/**
	 * 사용자가 입력값을 입력하면   그만큼으  합을 ㄱ구하세요
	 * ex)10까지의 합을 구하시오
	 */
	public void test5_1() {
		int sum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 :");
		int num = sc.nextInt();
		for(int i =0 ;i <=num;i++) {
			sum += i;
		}
		System.out.println("사용자가  입력값의 합은 : "+sum);
		
		
	}
	public void test5() {
		int sum =0;
		/*
		 * for (int i = 1; i <= 10; i++) { sum +=i;
		 * 
		 * } System.out.println(sum);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num;i++) {
			sum += i;
			
		}
		System.out.println("사용자가 입력한 수의 합은 :"+sum);
	}

	/**
	 * 이름을 반복 출력햐두랍ㄴ더
	 * 
	 */
	public void test4_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 일력 : ");
		String name = sc.nextLine();
		System.out.println("반복 횟수 : ");
		int num = sc.nextInt();
		for(int i = 1;i<=num;i++) {
			System.out.println(i+ " "+ name);
		}
	}
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("반복횟수 : ");
		int num = sc.nextInt();
		for (int i = 1; i < num; i++) {
			System.out.println(i + " " + name);
		}
	}

	/**
	 * @실습 문제 : 구구구단:
	 */
	public void test3_3() {
	int dan =3;
	for(int i=1;i<10;i++) {
		System.out.println(dan + " * "+i+"="+(dan*i));
	}
	}
	public void test3() {
		
		int dan = 3;
		for (int i = 1; i < 10; i++) {

			System.out.println(dan + " * " + i + "=" + (dan * i));

		}
	}
	public void test2_2() {
		
		for (int i =1 ;i<=20;i++) {
			System.out.println(i+"헬로");
		}
	}

	public void test2() {
//		for( int i = 11; i <= 20; i += 1) {
//			System.out.println(i + "Hello World~");
//		}
		// 10 ~ 1
//		for(int i = 10; i >= 10;  i --) {
//			System.out.println(i + "Hello World~");
//		}

//		for(int i = 1 ; i < 20; i++ ) {
//			
//			if(i % 2 != 0) {
//				System.out.println(i + "헬로우");
//			}
//		}	
//		
		// 1부터 20 사이의 홀수를 출력
		// 1 3 5 7 9 11 13 15 17 19
//	for(int i = 1; i < 20; i += 2 ) {
//		Syst헬em.out.println(i + "로");
//	}
//	//1부터 20 사이의 짝수를 출력
		// 1 3 5 7 9 11 13 15 17 19
		
		for (int i = 20; i > 0; i -= 2) {
			System.out.println(i + "헬로");

		}
		for (int i = 20; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.println(i + "헬헬로우");
			}
		}
	}

	/**
	 * for(초시식 ; 조건식;증감식) { //반복실행구문 } -초기식 : for문실행시 최초 1회만 실행 -조건식 : 매턴마다 검사해서
	 * true면 반복구문 실행 false면 반복문 종료 -증감식 : 매턴마자 증감변수 처리
	 */
	
	public void test1_1() {
		//20부터 1 까지 -2 씩 하고 
		//출력해라
		for(int i=20;i>1;i-=2) {
			System.out.println(i+" ");
		}
		System.out.println();
		for(int i =20;i>0;i--	) {
			if(i%2 ==0) {
				System.out.println(i+" ");
			}
		}
	}
	public void test1() {
		/*
		 * for(int i=1;i<20;i+=2) { System.out.print(i+" "); }
		 */
		for (int i = 20; i > 1; i -= 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 20; i > 0; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}

		}

		/*
		 * for(int i=10;i>0;i--) { System.out.println(i +" Hello World~"); } for(int i
		 * =1;i<=5;i++) { for(int j =1 ;j<=i;j++) { System.out.print("*"); }
		 * System.out.println(); }
		 * 
		 * for(int i=11;i<21;i++) { System.out.println(i +" Hello World~"); }
		 * 
		 * }
		 */

	}
}
