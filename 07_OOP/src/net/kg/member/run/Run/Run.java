package net.kg.member.run.Run;

import java.util.Scanner;

import net.kg.member.model.Member.Member;

public class Run {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		Member m = new Member();
		
		System.out.print("아이디 : ");
		m.setMemberld(sc.next());
		
		System.out.print("비밀번호 : ");
		m.setMemberPwd(sc.next());
		
		System.out.print("이름 : ");
		m.setMemberName(sc.next());
		
		System.out.print("나이 : ");
		m.setAge(sc.nextInt());
		
		System.out.print("성별(남/여) : ");
		m.setGender(sc.next().charAt(0));
		
		System.out.print("전화번호 : ");
		m.setPhone(sc.next());
		
		System.out.print("이메일 : ");
		m.setEmail(sc.next());


		System.out.printf("아이디 는 :%s 패스워드: %s 이름은 :%s 나이 :%d세이고  %s자이고,번호 :%s 메일은 : %s입니다", 
				m.getMemberld(), m.getMemberPwd(),m.getMemberName(),m.getAge(),m.getGender(),m.getPhone(),m.getEmail());
		
	}

}
