package kh.java.oop.access.modifier.field;

public class Run {

	public static void main(String[] args) {
		//같은 패키지에서
	AccessModifierFieldTest a = new AccessModifierFieldTest();
		System.out.println(a.publicNum);
		System.out.println(a.protectedNUm);
		System.out.println(a.defaultNum);
	//	System.out.println(a.privateNum);//같은 클래스가 아니므로 사용불가
	}

}
