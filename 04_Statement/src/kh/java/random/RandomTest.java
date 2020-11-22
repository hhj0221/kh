package kh.java.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {

		RandomTest rd = new RandomTest();
		 rd.test1();
	//	rd.test2();
	//	rd.test3();
	}
	public void test3() {
		//0.0(inclusive)과 1.0(exclusive)사이의 난수 발생
		double rndNum = Math.random();
		System.out.println(rndNum);
		
		//1~10사의 난수;
		rndNum = Math.random() * 10 + 1 ;
		int resulst =(int)rndNum;
		System.out.println(rndNum);
		System.out.println(resulst);
	}

	public void test2() {
		// . 사용자 입력값
		Scanner sc = new Scanner(System.in);
		System.out.println("동전 앞 뒤 입력(1.앞 2.뒤)  :");
		int userInput = sc.nextInt();

		// .동전 던시기
//		int coin = (int) (Math.random() * 2 + 1);
		Random rnd = new Random();
		int coin = rnd.nextInt(2)+1;

		// 값비교
		System.out.println("==============================");
		System.out.println("결과 : " + (coin == 1 ? "앞" : "뒤"));
		System.out.println(userInput == coin ? "맞췄습니다" : "틀렸습니다");
	}

	/**
	 * Random - 1~10까지 임의 수 부르는거? - 경우의 수가 중요하다. - 최소값(시작값)
	 */
	public void test1() {
		Random random = new Random();
		// 정수 난수 가져오기
		int rndNum = random.nextInt(10) + 1; // 0~9까지 10개의 수중에
		System.out.println(rndNum);
		// 1-100사이 난수출력
		rndNum = random.nextInt(100) + 1;
		System.out.println(rndNum);
		// 50~100
		rndNum = random.nextInt(51) + 50;
		System.out.println(rndNum);

		// 가위0바위1보2
		int rsp = random.nextInt(3);
		System.out.println(rsp);
		String rsStr = rsp == 0 ? "가위 " : (rsp == 1 ? "바위" : "보");
		System.out.println(rsStr);
		
		// 타입별 난수 지원

		System.out.println(random.nextBoolean());
		System.out.println(random.nextDouble());
	}
}
