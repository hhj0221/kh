package kh.java.oop.student.run;

import java.util.Scanner;

import kh.java.oop.student.controller.StudentManager;
import kh.java.oop.student.model.vo.Student;

public class StudnetRun {

	public static void main(String[] args) {
		//코드가 가진 성격별로 분리
		//학생 관리 객체 생성 및 메소드 호출
		StudentManager sm = new StudentManager();
		sm.manageStudnet();
		/*
		 * StudnetRun s = new StudnetRun(); s.mangeStudent();
		 */
	}
	/*
	public void mangeStudent() {
		Student[] arr = new Student[5];
	
		 arr[0] = inputStudent(); arr[1] = inputStudent(); arr[2] = inputStudent();
		 // arr[3] = inputStudent(); arr[4] = inputStudent();
		
		//객체 사용자 입력
		for(int i =0 ;i<arr.length;i++) 
			arr[i] =inputStudent();
		//객체 출력
		for(int i =0;i<arr.length;i++) {
			Student s = arr[i];
			System.out.println(s.print());
		
	}	
	//
	//inputStudent()는 Student에  있으니  메소드를 만들때
	/// Studnet을 리턴을 해야한다 .결과값이밑에있다.
	// 옐를 들어 
	
	
	public Student inputStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("학생명 : ");
		String name = sc.next();
		System.out.println("점수 : ");
		int point = sc.nextInt();
		
		
		return new Student(name,point);
				//Student s new Student(name,point)
				//return s 이걸
				
				//이렇게 하면 Student를 리턴한다 (안에있는 매개변수.)
				//새로운객체를 만든다?
	}
	public void mangeStudent_() {
			//객체 배열
		Student[] stdtArr;
		stdtArr = new Student[5];
		stdtArr[0] = new Student("홍길동",80);
		stdtArr[1] = new Student("신사임당",95);
		stdtArr[2] = new Student("세종대왕",70);
		stdtArr[3] = new Student("장영실",87);
		stdtArr[4] = new Student("이황",99);
		for(int i =0;i<stdtArr.length;i++) {
			Student s = stdtArr[i];
	//		System.out.println(s.print());
		}

}
*/	
}