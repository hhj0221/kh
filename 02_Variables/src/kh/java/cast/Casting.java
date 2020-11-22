package kh.java.cast;

/**
 *컴퓨터의 작동원리
 *
 * 1. 같은 자료형 사이에서 연산할 수 있다.
 * 2. 리터럴을 같은 자료형의 변수에만 대입할 수 있다.
 * 3. 간은 자료형의 연산결과는 동일한 자료형이다.
 * 
 *
 */

public class Casting {
	
	public static void main(String[]args ) {
		
			Casting c = new Casting();
//			c.test1();
//			c.test2();
			//c.test3();
			c.test4()	;
			
			
	}
	public void test4() {
		System.out.println('A'+1);//66
		//char + int > int + int 
						//65 + 1
		System.out.println('0'+1);//49
		// char + int -> int + int
		
					
					
		System.out.println((char)99);//알바펫 c가 쵤력 될라면?
		//99 형변환이 필요하다
		
		System.out.println(2.0 == (5 / 2));
		//논리형이 
		//더블+  int > doble == dobule
		System.out.println('C'== 67);
		// char == int -> int == int
		System.out.println('A'== 'B' -1);
		// 'A' == char - int -> 'A' == 65
		System.out.println('a' != 97);
	}
	/**
	 * int보다 작은 
	 */
	public void test3() {
		byte b1 =100;
		byte b2 =10;
		
		//byte result =(int)b1+(int)b2;
	}
	/**
	 * 2. 명시적 형변환
	 *  - 데이터소실이 있을 수 있으므로 주의해서 사용ㅇ
	 *  
	 */
	public void test2() {
		int num = (int)3.7;
		System.out.println(num);
		num = 290;
		byte b=  (byte)num;
		System.out.println(b);
		//2. 큰 타입으로 변환(데이터 손실 업음);
		int k = 10;
		int m = 4;
		System.out.println((double)k/m);
	}
	/**
	 * 1. 암묵적 형변환(자동형변환)
	 * 		-데이터 손실이 없는 경우 
	 * 		-승격
	 * 		-byte -> short -> int -> long -> float -> double 
	 * 	
	 */
	public void test1() {
		//1. 자료형이 다른 값의 연산
		int a = 3;
		double b =2.7;
		System.out.println(a+b);
		
		//2. 리터럴이 다른 자료형의 변수에 대입
		int c =5;
		float d = c;
		System.out.println(d);
		char e ='e';
		int f = e;
		System.out.println(f);
		System.out.println('B'+100);
		int k = 10;
		int m = 3;
		System.out.println(k/m);
		int  i = Integer.MAX_VALUE;
		System.out.println(i);
		System.out.println((long)i);

	}
}
