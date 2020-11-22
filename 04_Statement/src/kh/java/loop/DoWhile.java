package kh.java.loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		DoWhile d = new DoWhile();
		// d.test2();
		// d.test3();
// d.test4();
		d.test5();
	}

	public void test5() {
	  Scanner sc = new Scanner(System.in);
	  String  menu = "---------------\n"
	  		+ "1.참치김밥(3000)\n"
	  		+ "2.멸치김밥(2,500)\n"
	  		+ "3.라뽁이(3,500)\n"
	  		+ "----------------\n"
	  		+ "번호를 선택하세요";
	  char  yn ='n';
	  int choice =0;
	  int sum = 0;
	  do{
		  System.out.println(menu);
		  choice =sc.nextInt();
		  System.out.println(choice);
		  switch(choice){
		  case 1 :
		  sum += 3000;
		  break;
		  case 2 :
			  sum +=2500;
			  break;
		  case 3:
			sum+=3500;
			break;
			default :
			System.out.println("잘못입력하셨습니다");
		  }
		  System.out.println("더문 하시겠습니까?(y/n) : ");
		  yn   =sc.next().charAt(0);
	  }while(yn == 'y');
	  System.out.println("결제 금액 : "+ sum +"원입니다");
	 System.out.println("이용해주셔서 감사합니다");
  }

	public void test3() {
		Scanner sc = new Scanner(System.in);
		String menu = "============\n" + "1.참치김박(3,000)\n" + "2.멸치김밥(2,500)\n" + "3.라뽁이(3,500)\n"
				+ "-----------------\n" + "선택:";
		char yn = 'n';
		int choice = 0;
		int sum = 0;
		do {
			System.out.println(menu);
			choice = sc.nextInt();
			System.out.println(choice);
			// 누적합 계산
			switch (choice) {
			case 1:
				sum += 3000;
				break;
			case 2:
				sum += 3000;
				break;
			case 3:
				sum += 3000;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
			// 추가주문 여부
			System.out.print("더 주문 하시겠습니까?(y/n) :");
			yn = sc.next().charAt(0);

		} while (yn == 'y');
		// 최종금액 출력
		System.out.println("결제금액 : " + sum + "원");
		System.out.println("이용해주셔서 감사합니다");

	}

	public void test4() {
		Scanner sc = new Scanner(System.in);
		char yn = 'y';
		do {
			System.out.println("게임시작");
			System.out.println("diq dasdasdasdnkasdfnasㅅ ㅠㅇ승윳륭");
			System.out.println("skdjakfnslfsdlf");
			System.out.println("게임을 ㅍ한판더 하시겠습니까?");
			yn = sc.next().charAt(0);
		} while (yn == 'y');
		System.out.println("========게임끝===========");
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		char yn = 'y'; // do ~while 조건식에 사용될 변수는 블럭 바깥에 선언할껏
		do {
			System.out.println("게임시작");
			System.out.println("얍~ 뱍~ 쿵~~ 와~");
			System.out.println("게임===게임오버");
			System.out.println("한판더 하시겠습니까?");
			yn = sc.next().charAt(0);

		} while (yn == 'y');
		System.out.println("======이용해주셔사 감사합니다--------");
	}

}
