package kh.java.switch_;

import java.util.Scanner;
import java.util.UUID;

/**
 * 
 * if문은 논리형의 따라 분기
 * 
 * switch 값에 따라 분기
 * 
 */

public class SwichTest {

	public static void main(String[] args) {
		SwichTest s = new SwichTest();
		// s.test1();
		// s.test2();
		// s.test3();
	//	s.test4();
	//	s.test5();
	 s.test6();	

	}
	public void test6() {
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		
		do {
			calcWaterFee();
			
			System.out.print("계속 하시겠습니까(y/n) : ");
			yn = sc.next().toLowerCase().charAt(0); //YN -> yn
			
		} while(yn == 'y');
		
		System.out.println("이용해주셔서 감사합니다.");
	}
	

			
	
				
		
	public void calcWaterFee() {
		Scanner sc = new Scanner(System.in);
		String sm = "================\n" + "1.가정용 50/Liter \n" + "2.상업용 50/Liter\n" + "3.공업용 50/Liter\n" + "===================\n";
		System.out.print(sm);
		System.out.println("메뉴를 선택하세요)");
		int choice = sc.nextInt();
		System.out.println("사용량을 입력(liter당)");
		int useNum = sc.nextInt(); //사용량 입력입니다.
		
		int price = 0;
		double tax =0;
		int total = 0;
		String user = "";
		
		switch (choice) {
		case 1:
			user = "가정용";
			price = 50 * useNum; // 가격: 가격 * 사용량
			break;
		case 2:
			user = "상업용";
			price = 50 * useNum; // 가격: 가격 * 사용량
			break;
		case 31:
			user = "공업용";
			price = 50 * useNum; // 가격: 가격 * 사용량
			break;
		default : 
			System.out.println("잘못입력 하셨습니다.");
			
		}
		tax = price *0.05;
		total =(int )(price + tax);
		System.out.print("----총 사용요금---\n");
		System.out.print(user +"을 사용 하고 있습니다.\n");
		System.out.print("사용 요금: "+price +"원 입니다\n");
		System.out.print("수도세 : "+ tax+"원 입니다.\n");
		System.out.println("총 납부금액은 : "+total+"원입니다");
		
	}

	/**
	 * @실습 문제 :수도세 계산 프로그램 사용자에게 용도와 물사용량을 입력받아서, 수도세를 계산할것 - 사용 요금 : 용도별 가격 * 사용량 -
	 *     수도세 : 사용 요금 5% - 총 납부 금액 : 사용 요금 + 수도세 용도별 가격은 1 1.가정용 50원/liter 2.상업용
	 *     45/l 3.공업용 30원
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		String sm = "================\n" + "1.가정용  \n" + "2.상업용\n" + "3.공업용\n" + "===================\n";
		System.out.println(sm);
		System.out.println("메뉴를 선택하세요)");
		int choice = sc.nextInt();
		System.out.println("사용량을 선택 해주세요 (liter당)");
		int useNum = sc.nextInt();
		String user = " ";
		int fare = 0; // 사용 요금
		double totalFare = 0; // 전체요금

		switch (choice) {
		case 1:
			user = "가정용";
			fare = useNum * 50;
			break;

		case 2:
			user = "상업용";
			fare = useNum * 45;
			break;
		case 3:
			user = "공업용";
			fare = useNum * 30;
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		totalFare = fare * 1.05;
		System.out.println("-----------------------");
		System.out.println(user + "사용하고 있습니다");
		System.out.println("사용요금: " + fare + " 원");
		System.out.println("총수도요금: " + totalFare + " 원");
		System.out.println("-----------------------");

	}

	public void test3() {
		Scanner sc = new Scanner(System.in);
		String Member = "=================\n" + "1.골드 \n" + "2.실버\n" + "3.브론즈\n" + "===================\n";
		System.out.println("고객님의 등급을 선하세요");
		System.out.print(Member);
		int choice = sc.nextInt();
		String Present = " ";
		String gift = " ";
		switch (choice) {
		case 1:
			gift = "골드";

			Present = "스마트TV,";

		case 2:
			gift = "실버";
			Present += "전자렌지,";

		case 3:
			gift = "브론즈";
			Present += "전기다리미";
			break;
		default:
			System.out.println("다른 등급입니다 죄송하지만 선물은없습니다");
			return;
		}
		System.out.println(gift + "고객님의 선물은 [" + Present + "]입니다 축하드립니다");

	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		String menu = "=======================\n" + "1.순대국\n" + "2.김치찌게\n" + "3.순두부 찌게\n" + "-------------\n" + "> ";

		System.out.print(menu);
		int choice = sc.nextInt();
		int price = 0;
		switch (choice) {
		case 1:
			price = 8000;
			break;
		case 2:
			price = 7000;
			break;
		case 3:
			price = 9000;
			break;
		default:
			System.out.println("잘못 입력 하셨습니다");
			return;

		}
		System.out.println("가격은 [" + price + "]원 입니다");

	}

	/**
	 * 괄호안에는 byte swtch(변수|계산식){ case 값1: 실행문 1 break;
	 * 
	 * case 값2: 실행문 2 break;
	 * 
	 * default: //기본 실행문(모든 case에 해당되지 않는 경우) }
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.사과 2.바나나 3.오렌지");
		System.out.print("> ");

		int choice = sc.nextInt();
		String color = "";
		switch (choice) {
		case 1:
			color = "빨간색";
			break; // 현재 블럭을 빠져나가기
		case 2:
			color = "노란색";
			break;
		case 3:
			color = "주황색";
			break;
		default:
			System.out.println("잘못 입력하셨습니다.	");
			return;// 현재 메소드를 호출한 곳으로 돌아라가
		}
		System.out.println("선택한 과일의 색상은 [" + color + "] 입니다");

	}

}
