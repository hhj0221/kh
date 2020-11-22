package kh.oop.emp.run.EmpTest;

import java.util.Scanner;

import kh.oop.emp.mdel.Employee.Employee;

//******* 사원 정보 관리 프로그램 ************
//    1. 새 사원 정보 입력  => empInput() 메소드 실행
//   2. 사원 정보 삭제 => 참조변수에 null대입할  것.
//   3. 사원정보 출력 =>  empOutput() 메소드 실행
//   9. 끝내기
//********************************************
public class EmpTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee el= new Employee();
		String sm =" ******* 사원 정보 관리 프로그램 ************\r\n" + 
				"	 +  1. 새 사원 정보 입력 \r\n" + 
				"	 +  2. 사원 정보 삭제 \r\n" + 
				"	 +  3. 사원정보 출력 \r\n" + 
				"	 +  9. 끝내기\r\n" + 
				" ***************************************\n"
				+ "번호를 입력하세요: ";
				
		char yn = 'n';
		int choice = 0;
		do {
			System.out.println(sm);
			choice = sc.nextInt();
			System.out.println(choice);
			switch(choice) {
			case 1:
				el.empInput();
				
				break;
			case 2:
				el.empDelete();
				
				break;
			case 3:
				el.empOut();
				break;
			case 9 :
			System.out.println("프로그램 종료합니다");		
			return;
			
			default : 
				System.out.println("잘못 입력하셨습니다 ");
				
			}System.out.println("다시 입력(y/n?): ");
			yn = sc.next().charAt(0);
			
			
			
	}while(yn =='y');
		System.out.println("입력되었습니다.");
		return;

}
}
