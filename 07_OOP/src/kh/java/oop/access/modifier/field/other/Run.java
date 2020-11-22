package kh.java.oop.access.modifier.field.other;

import kh.java.oop.access.modifier.field.AccessModifierFieldTest;

public class Run {

	public static void main(String[] args) {
		//다른  패키지에서
	AccessModifierFieldTest a = new AccessModifierFieldTest();
		System.out.println(a.publicNum);
	//	System.out.println(a.protectedNUm); //같은 패기지가 아니므로 사용불가
	//	System.out.println(a.defaultNum);  //같은 패기지가 아니므로 사용불가
	//	System.out.println(a.privateNum);//같은 클래스가 아니므로 사용불가
	}

}
