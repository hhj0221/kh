package kh.java.inherit.basic;

public class Child extends Parent {
	/**
	 * 물려받은 메소드를 다시 쓰기
	 * overriding 이라고 한다.
	 * 
	 */
	public void say() {
		System.out.println("안녕하세요 자식입니다.");
	}
	public void doGame() {
		System.out.println("자식새끼는 게임을 한다");
	}
}
