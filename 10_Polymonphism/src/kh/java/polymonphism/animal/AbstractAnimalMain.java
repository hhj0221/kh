package kh.java.polymonphism.animal;

/**
 * 부모 클ㄹ래스의 메소드 오버라이딩 강제화
 * -부모클래스 추상화메소드 (미완성메소드)
 * 
 * 추상메소드를 하나라도가지고 있다면, 추상클래스가 된다.
 * 객체화할 수없다.
 * 
 * 자식클래스마다달라져야 하는 필수적인 기능이 있다면, 추상메소드 사용을 권장한다.
 *
 */
public class AbstractAnimalMain {

	public static void main(String[] args) {

		AbstractAnimalMain aam = new AbstractAnimalMain();
		aam.test1();
	}

	public void test1() {
		//추상클래스는 객체화 할수 없다.
	}

}
