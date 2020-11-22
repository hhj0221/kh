package kh.oop.emp.mdel.Employee;

import java.util.Scanner;

public class Employee {
	private int empNo;
	private String empName;

	private String dept;

	private String job;

	private int age;
	private char gender;

	private int salary;

	private double bonusPoint;

	private String phone;

	private String address;

	// 출력용 클래스입니다.
	public void empInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사번 입력:");
		setEmpNo(sc.nextInt());

		System.out.print("이름 입력:");
		setEmpName(sc.next());

		System.out.print("소속부서 입력:");
		setDept(sc.next());

		System.out.print("직급 입력:");
		setJob(sc.next());

		System.out.print("나이 입력:");
		setAge(sc.nextInt());

		System.out.print("성별을 입력:");
		setGender(sc.next().charAt(0));

		System.out.print("급여을 입력:");
		setSalary(sc.nextInt());

		System.out.print("보너스 포인트를 입력:");
		setBonusPoint(sc.nextDouble());

		System.out.print("핸드폰 번호를 입력:");
		setPhone(sc.next());

		System.out.print("주소를 입력:");
		setAddress(sc.next());

		System.out.println();
	}

	public void empDelete() {
		empNo = 0;
		empName = null;
		dept = null;
		job = null;
		age = 0;
		gender = ' ';
		salary = 0;
		bonusPoint = 0.0;
		phone = null;
		address = null;
	}

	public void empOut() {
		System.out.printf("사번 : %s%n 이름 : %s%n 소속부서 : %s%n"
				+ "직급 : %s%n 나이 : %s%n 성별 : %s%n"
				+ "급여 : %s%n 보너스포인트 : %s%n 휴대폰 : %s%n"
				+ "주소 : %s%n", getEmpNo(), getEmpName(),
				getDept(), getJob(), getAge(), getGender(),
				getSalary(), getBonusPoint(), getPhone(),
				getAddress());
	  }

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public String getDept() {
		return dept;
	}

	public String getJob() {
		return job;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getSalary() {
		return salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

}
