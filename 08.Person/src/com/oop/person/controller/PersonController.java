package com.oop.person.controller;

import java.util.Scanner;

import com.oop.person.model.vo.Persion;

public class PersonController {
			Scanner sc= new Scanner(System.in);
			final int MAX_PE =3;
			
			
			Persion[] arr = new Persion[MAX_PE];
			public void insertPersion() {
				for(int i=0; i<arr.length;i++) {
					Persion p = new Persion();
					System.out.print("이름 : ");
					p.setName(sc.next());
					System.out.print("나이 : ");
					p.setAge(sc.nextInt());
					System.out.print("키 : ");
					p.setHi(sc.nextInt());
					System.out.print("몸무게 : ");
					p.setWi(sc.nextInt());
					System.out.print("재산 : ");
					p.setMoney(sc.nextInt());
					arr[i] =p;
					
					
				}
			}
			public void printPerson() {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i].insertPersion());
			}
			}
			public void getPersonAvg() {
			
				int avgAge =0;
				double avgHi =0.0;
				double avgWi =0.0;
				long  avgmoney=0;
			for(int i=0;i<arr.length;i++) {
				avgAge+= arr[i].getAge();
				avgHi+=arr[i].getHi();
				avgWi+=arr[i].getWi();
				avgmoney +=(long)arr[i].getMoney();
				
				
			}
			avgAge = avgAge/MAX_PE;
			avgHi=avgHi/MAX_PE;
			avgWi=avgWi/MAX_PE;
			avgmoney=avgmoney/MAX_PE;
			System.out.println("평균 나이 : "+ avgAge);
			System.out.println("평균 키 : "+ avgHi);
			System.out.println("평균 몸무게 : "+ avgWi);
			System.out.println("평균 재산 : "+ avgmoney);
			}
}