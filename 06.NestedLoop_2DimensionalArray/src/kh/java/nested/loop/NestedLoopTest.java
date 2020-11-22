package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopTest {

	public static void main(String[] args) {

		NestedLoopTest n = new NestedLoopTest();
		// n.test1();
		// n.test2 ();
		n.test3 ();
//		n.test4	();
		// n.test5();
		// n.test6();
		// n.test7();
		// n.test8();
		// n.test9();
	//	n.test10();

	}

	public void test10() {
		for (int i = 1; i <= 3; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("★");
			
					
			
			
			}
			System.out.println();
		}
		
			for (int i = 0;i < 2; i++) {

				for (int j =2; j > i; j--) {
					System.out.print("★");
			
		
		}	System.out.println();
				
			}
		}
		
	

	public void test9() {

		for (int i = 0; i < 5; i++) {

			for (int j = 5; i < j; j--) {
				System.out.print("★");
			}
			System.out.println();

		}
		System.out.println();
	}

	public void test8() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("=============" + i + "단" + "============");
			for (int j = 1; j <= 9; j++) {

				System.out.println(i + "*" + j + "=" + i * j);

			}
			System.out.println();
		}
	}

	public void test7() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("+");
				if (i % 2 != 0) {
					break;
				}

			}
			System.out.println();

		}

	}

	public void test6() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("★");
				if ((i % 2) == 1) {
					break;

				}

			}
			System.out.println();
		}
	}

	public void test5() {
		for (int i = 0; i < 5; i++) {
			if (i % 2 != 0) {
				System.out.println("★");
				continue;
			}
			for (int j = 0; j < 3; j++) {
				System.out.print("★");

			}
			System.out.println();
		}

	}

	public void test4() {
//		for(int i =0; i<5; i++) {
//			for(int j = 0 ; j<=i;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}

		/*
		 * outer: for(int i = 0; ; i++) { for(int j =0 ; j<=i;j++) {
		 * 
		 * if(i>=5) break outer; System.out.print("★"); } System.out.println(); }
		 */
		// 라벨을 사용한 continue
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				System.out.print("★");
			}
			System.out.println();
//			}
		}

	}

	// @실습문제 사용작가 원하는 크기의 별박스 출력
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자가 원하는 행 숫자 입력: ");
		int outer = sc.nextInt();
		System.out.print("사용자가 원하는 열의 숫자를 입력 : ");
		int inner = sc.nextInt();
		for (int i = 0; i < outer; i++) {

			for (int j = 0; j < inner; j++) {
				System.out.print("★");
			}
			System.out.println();

		}
	}

	public void test2() {
		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

	public void test1() {
		// outer
		for (int i = 0; i < 2; i++) {
			System.out.print(i + ": ");
			// inner

			for (int j = 0; j < 3; j++) {
				System.out.print(j + ":");
			}
			System.out.println();// 개행
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();// 바같에 있는 걸 내린다
		}
	}
}
