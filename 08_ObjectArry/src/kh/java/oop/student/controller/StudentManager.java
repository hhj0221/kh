package kh.java.oop.student.controller;

import java.util.Scanner;

import kh.java.oop.student.model.vo.Student;

/**
 * StudnetManager ----------->Student 연관관계 : 멤버변수로 Student를ㄹ 참조한다.
 * 
 * has a 포함관계 A has a B StudentManager has a Studnet
 *
 *
 * is a 상속관계
 * 
 * @author USER
 *
 */
public class StudentManager {
	public static final int MAX_STUDENT= 100;
	private int idx = 0;// 학생 인덱습 ㅕㄴ수
	// 지역변수
	private Student[] arr = new Student[MAX_STUDENT];

	private Scanner sc = new Scanner(System.in);

	public void manageStudnet() {
		System.out.println("-----학생 관리 시작------");

		// 1.사용자입력값으로 학생객체 생성
		/*
		 * for (int i = 0; i < arr.length; i++) { arr[i] = inputStudent();
		 */
		while (true) {
			arr[idx] = inputStudent();
			idx++;

			System.out.print("추가입력 하시겠습니까?(y/n) : ");
			char yn = sc.next().charAt(0);
			if (yn == 'n')
				break;
		}
		// 2. 학생 객체 출력
		printStudent();

	}public void printStudent() {
		for(int i = 0; i<idx;i++ ) {
			System.out.println(arr[i].print());
		}
	}

	public void printStudent_() {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ":" + arr[i]);
//			System.out.println(arr[i].print());
		}
	}

	public Student inputStudent() {

		System.out.print("학생명 : ");
		String name = sc.next();
		System.out.print("점수 : ");
		int point = sc.nextInt();

		return new Student(name, point);
		// Student s new Student(name,point)
		// return s 이걸

		// 이렇게 하면 Student를 리턴한다 (안에있는 매개변수.)
		// 새로운객체를 만든다?
	}
}
