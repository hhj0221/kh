package com.oop.emplyee.controller;

import com.oop.emplyee.midel.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.printEmployee();
		
		Employee e1 = new  Employee(1," 홍길동", '남', "010-7777-7777");
		e1.printEmployee();
		Employee e2 = new Employee(2," 유관순", '여', "010-1313-3131", "영업부", 3000000, 0.15);
		e2.printEmployee();
	}
}

