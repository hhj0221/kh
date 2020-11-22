package com.oop.coffee.model.dto;

/**
 * - 클래스 : com.oop.coffee.model.dto.Coffee.java - control 클래스 작성 :
 * com.oop.coffee.controller.CoffeeManager.java - 실행클래스 :
 * com.oop.coffee.run.Run.java => main() 메소드 포함함 - Coffee 멤버변수 원산지 origin, 지역
 * location 기본생성자, 모든필드초기화생성자 getter, setter 출력메소드 () - control클래스 구현내용. 1.
 * Coffee 클래스에 대한 객체 배열(세계3대커피정보) 선언함. 배열크기 3. 2. 사용자에게 키보드로 세계3대 커피정보를 입력받아, 각
 * 객체에 기록함 3. 출력 확인함 <세계3대커피> --------------------------- 원산지 지역
 * --------------------------- 예멘 모카마타리 자메이카 블루마운틴 하와이 코나
 * --------------------------- - main() 에서 구현할 내용 1. control클래스 객체생성 및 입력/출력 메소드
 * 호출
 * 
 * @author USER
 *
 */
public class Coffee {
	private String origin;

	private String location;

	public Coffee() {

	}

	public Coffee(String origin, String location) {
		this.origin = origin;
		this.location = location;

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String information(){ 
		return this.origin + " " + this.location + " 커피";

	}
}
