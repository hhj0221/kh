package com.oop.person.model.vo;

public class Persion {
	private  String name ;
	private int age;
	private int hi;
	private double wi;
	private long money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHi() {
		return hi;
	}
	public void setHi(int hi) {
		this.hi = hi;
	}
	public double getWi() {
		return wi;
	}
	public void setWi(double wi) {
		this.wi = wi;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public Persion() {}
	public void  Persion(String name ,int age,int hi,double wi,long money){
		this.name =name;
		this.age = age;
		this.hi=hi;
		this.wi=wi;
		this.money =money;
	}
		public String insertPersion() {
			return "이름 : "+ name+" " +"나이 : "+ this.age +" 키 : "+ this.hi+" 몸무게 : " +this.wi+" 재산  :"+this.money;
		
	}
		
}
