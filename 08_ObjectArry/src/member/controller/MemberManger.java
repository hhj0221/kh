package member.controller;

import member.moder.vo.Gold;
import member.moder.vo.Silver;

public class MemberManger {

	public static final int MAX__MEMBER_COUNT = 10;
	//변수를 상수르를 크게 잡고 
	Silver[] s = new Silver[MAX__MEMBER_COUNT];
	Gold[] g = new Gold[MAX__MEMBER_COUNT];

	int siverIndex = 0;
	int goldIndex = 0;
	//등급별로 메소드를 정해준것이다
	
	public void seiverInsert(Silver s) {
		this.s[siverIndex++] = s;
		//siverIndex++;결과적으로 갔죠? 저후위연감증가는  
	}

	public void goldInsert(Gold g) {
		this.g[goldIndex++] = g;
	}

	public void priintData() {
		System.out.println("----------------<<회원 정보>>------------------");
		System.out.printf("%s\t %s\t %s\t %s\n", "이름","등급","포인트","이자포인트");
		System.out.println("---------------------------------------------");
		for(int i= 0 ;i<siverIndex;i++) {
			System.out.printf("%s\t %s\t %s\t %s\n",s[i].getSilverName(),s[i].getSilverGrade(),s[i].getPoint(),s[i].getSilverPoint() );
			
			
			
		}
	}
}
