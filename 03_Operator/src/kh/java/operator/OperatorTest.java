package kh.java.operator;

import java.util.Scanner;

public class OperatorTest {
	
	public static void main(String[] args) {
		OperatorTest op = new OperatorTest();
		/*
		 * op.test1(); op.test2(); op.test3();
		 */
		//op.test4();
		op.test5();
	}
	public void test5() {
		int x = 15;
		x += 15;
		System.out.println(x);
		x -= 15;
		System.out.println(x);
		x *= 3;
		System.out.println(x);
		x /= 2;
		System.out.println(x);
		x %= 10;
		System.out.println(x);
		
	}
	/**
	 * 삼항 연산자
	 */
	public void test4() {
		 int num = 50;
		 String str = num> 50 ? "안녕 " :" 잘가";
		System.out.println(str);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		str =(num % 2==1)? "훌수 " : "짝수";
		str = (num % 2 == 1)?  "홀수 ": "짝수";
		System.out.println(str + "를 입력하셨습니다.");
		
		int a = 5;
		int b  =7 ;
		int c = a > b ? b : (a== b ? 0: b);
		System.out.println("c = " +c );
				
	}
	/**
	 * 논리비교 연산자 
	 * -a && b(and )a가 참이몀ㄴ서 b도 참인가
	 * -a || b(or)	둘중 하나만 참이면 참)
	 * 
	 */
	public void test3() {
		/*
		 * int m = 50; int n = 100; System.out.println(m < n && m * 2 == n);
		 * System.out.println(true && true); System.out.println(true && false);
		 * System.out.println(false && true); System.out.println(false && false);
		 * System.out.println("===============================");
		 * System.out.println(true || true); System.out.println(true || false);
		 * System.out.println(false || true); System.out.println(false || false);
		 */
		int a = 1; int b = 1;
		/*
		 * 
		 * System.out.println("================================"); 
		 * System.out.println(a > 0 && ++b> 0);
		 * System.out.printf("a = %d, b = %d%n",a,b);
		 */
		//|| 좌항이 true일때
		System.out.println(a > 0 || ++b > 0);
		//|| 좌항이 false일때
		System.out.println(a < 0 || ++b > 0);		
		
		System.out.printf("a = %d, b = %d%n", a, b);
	}

	/**
	 * 이항연산자
	 */
	public void test2() {
		int a = 3;
		int b = 50;
		int c = 11;
		System.out.println(a+b);
		System.out.println(10 % 2 == 0);
		System.out.println(3 % 2 == 0);
		
		//비교 연산
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a>b); // greater than gt
		System.out.println(a<b); // less than >lt
		System.out.println(a>=b);// greater than aor equal to = gt
		System.out.println(a<=b);
	}
	public void test1() {
		int a =10;
		
		int b = -33;
		
		System.out.println(b);
		int m = 10;
		int n = 20;
		/*System.out.println(m++ + --n);
		System.out.println("m ="+ m);
		System.out.println("n = "+ n);*/
	
		//실습문제
		int x = 10;
		int y = 10;
		int z = ++x; //11
		System.out.println("z = " + z);//11
		System.out.println("x = " + x);//11
		
		z = y++;
		System.out.println("z = " + z);//10
		System.out.println("y = " + y);//11
		
		x = 20;
		z = x++ + --y;
		System.out.println("x = " + x);//21
		System.out.println("y = " + y);//10
		System.out.println("z = " + z);//31
		
		int num = 20;
		int result =++num + num; //21
		System.out.println("num = " + num); //21;
		System.out.println("result = " + result);//41
		
	}
}

