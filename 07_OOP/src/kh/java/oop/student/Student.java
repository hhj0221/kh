package kh.java.oop.student;
//기능 제공용 클래스입니다

/**
 * 클래스 - 객체를 만들기 위한 도면 (설계도) - 프로그램의 성격에 맞게 추상화 하여 속성/기능을 정의 할 수 있다.
 * 
 * 객체 - 클래스를 바탕으로 메모리에 실체화된 결과물 - new연사자를 사용하여 개수 제한 없이 생성 가능하다. - 각각의 객체는 다른
 * 정보를 가질 수 있다.
 * 
 * 속성 attribute/field
 * 
 * 기능 operation/method
 */
public class Student {

	// 속성(상태)
	private String name;
	private char gender;
	private int age;

	public void setName(String name_) {
		this.name = name_;
	}

	public void setGender(char gender_) {
		this.gender = gender_;
	}

	public void setAge(int age_) {
		this.age = age_;
	}

	public String getName() {
		return name;
	}

	public char getchar() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	// 긴으
	public void introduce() {

		System.out.printf("안녕하세요 저는 %s입니다 .%c자이구요 %s살입니다 반갑습니다%n", getName(), getchar(), getAge());
	}

}
