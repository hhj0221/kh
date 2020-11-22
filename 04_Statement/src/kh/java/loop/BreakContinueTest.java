package kh.java.loop;

import java.util.Scanner;

public class BreakContinueTest {

	public static void main(String[] args) {
		BreakContinueTest b = new BreakContinueTest();
		// b.test1();
		// b.test2();
		// b.test3();
		// b.test4();
//	\b.test1_1();
		//b.test2_1();
//		b.test3_1();
		
		b.test5();
	}
	/**
	 * 업다운 게임 입니다 임의 램덤 숫자 100을 줘서 큰 수와 작은 수를 말하시오 
	 * 정답이면 정답입니다라고 출력문 램덤점수보다 작으면 업 크면 다운 이라고 말을 해주세요
	 * 
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		//키보드 입력값 
		int RanDom =(int)(Math.random()*100+1); //랜덤 함수를 포함
		System.out.println("[" + RanDom+"]");
		while(true) {
			System.out.println("숫자를 입력하세여요");
			int num =sc.nextInt();
			if(num >RanDom) {
				System.out.println("Down");
			}else if(num <RanDom) {
				System.out.println("up");
				
			}else {
				System.out.println("모두 정답입니다");
			}
		}
	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		int rndNum = (int) (Math.random() * 100 + 1);
		System.out.println("[" + rndNum + "]");
		while (true) {
			System.out.println("숫자를 입력하세요(1~100)");
			int num = sc.nextInt();
			if (num > rndNum) {
				System.out.println("Down");
			}
			// 큰수를 말한경우
			else if (num < rndNum) {
				System.out.println("Up!");
				// 작은수를 말한경우
			} else {
				System.out.println("정답입니다");
				break;
			}

		}

	}

	public void test3_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while (true) {
			if (i == num) {
			
			i++;
			sum +=i;
			System.out.println(i);
			
			}
			System.out.println("1부터 "+num +"까지의 홀수의 합은 " + sum+"입니디");
			break;
		}
		
	
	}

	public void test3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int i = 0;
		int sum = 0;
		while (true) {

			if (i == num) {

				break;
				
			}
			i++;
			sum +=i;
			

		}
		System.out.println("1부터 " + num + "까지의 홀수의 합은  " + sum + "입니다");
	}

	public void test2_1() {
		int i = 0;
		while (i < 100) {
			i++;
			if (i % 2 != 0) {

			}
			System.out.println(i);
		}
	}

	public void test2() {
		/*
		 * int i = 1; while (i <= 100) { if (1 % 2 == 0) System.out.println(i); } i++;
		 */
		int i = 1;
		while (i < 100) {
			i++;
			// 홀수 일때는 반복문을 건너뛰기
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

	public void test1_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sc.nextInt();
		int i = 0;
		while (true) {
			if (i == num) {
				i++;

			}
			System.out.println(i);
			break;
		}
	}

	public void test1() {
		Scanner sw = new Scanner(System.in);
		System.out.println("정수입력 : ");
		int num = sw.nextInt();
		int i = 0;
		while (true) {
			if (i == num)
				i++;

			System.out.println(i);
			break;
		}

	}

}
