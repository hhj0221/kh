package kh.java.oop.init_block;

import java.util.Random;

/**
 *  인스턴스 변수 초기화 과정 객체를 만들떄마다 생성이 된다.
 *  1.타입별 기본값이 세팅
 * 	2.초기값. 
 *	3.초기화 블럭에서 대입한 값
 *	4.생성자(객체생서시 호출되는 메소드)에서 대입한 값.
 *   클래스 변수 초기화 과정 
 *  1.타입별 기본값이 세팅
 * 	2.초기값. 
 *	3.초기화 블럭에서 대입한 값
 *
 *
 */

public class Sample {

	int num =100;
	{
	//인스턴스변수의 초기화 블럭	
		System.out.println("초기화블럭 시작: " + num);
		Random rnd = new Random();
		
	num = rnd.nextInt();	
	System.out.println("초기화블럭 끝: " + num);
	
	}
	static int sno = 111;
	static {
		//값이 늦게 했지만 먼제 결과 값에 나온
		System.out.println("stiactic 초기화 블럭 시작 : "+sno);
		sno =333;
		System.out.println("stiactic 초기화 블럭 끝 : "+sno);
	}
	//생성자 : 리턴값 없음,클래스명과 메소드명이 동일
	public Sample() {
		System.out.println("생성자  시작: " + num);
		
		 num =300;
		 System.out.println("생성자  끝: " + num);
			
	}
	
}
