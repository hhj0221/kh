package member.run;

import member.controller.MemberManger;
import member.moder.vo.Gold;
import member.moder.vo.Silver;

public class Run {
	public static void main(String[] args) {
		MemberManger m = new MemberManger();
		m.seiverInsert(new Silver("홍길동", "Silver", 1000));

		m.seiverInsert(new Silver("김말똥", "Silver", 2000));
		m.seiverInsert(new Silver("고길동", "Silver", 3000));
	m.goldInsert(new Gold("김회장", "Gold", 1000));
	m.goldInsert(new Gold("이회장", "Gold", 2000));
	m.goldInsert(new Gold("오회장", "Gold", 3000));

		m.priintData();
	}
}
