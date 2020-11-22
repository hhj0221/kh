package kh.java.oop.constructor;

/**
 * 생성자 -new 연사자를 통해 호출되ㅏ는 메소드로써, 객체필드초기화등을 수행한다.
 * 
 * 리턴타입을 작성하지 않는다, 클래스명과 생성자명은 동일하다
 * 
 * 기본생성자(파라미터가 없음)와 하나ㅇ이상의 파라키터생성자를 가질 수 이싿. 파라미터생성자를 작성하지 않았다면, JVM이 자동으로
 * 기본생성자를 생성해처리하지만 파라미터생성자를 작성했다면, JVM이 기본생성자를 자동생성하지않는더,
 * 
 * @author USER
 *
 */
public class User {

	private String userID;
	private String password;
	private boolean enable;
	// setEnable
	// isEnble = 필드 자료형이 boolean인경에만 getter는 is로 시작

	// 생성자
	// 1.기본생성자
	//기본생성자를 호출하지 않ㅇ도, 무조건 작성해둘것
	public User() {
		System.out.println("User() 기본 생성자 호출");
	}
	//2ㄹ파라미터생성자
	public User(String userId) {
		//다른 생성자 ㅗ출
	//최상단에서 딱 한번 호출 할 수있다.
		this(userId, "0000");
		
		//this.userID = userId;
	}

	public User(String userID, String passord) {
		this.userID = userID;
		this.password = passord;
	}

	public void printUSerInfo() {
		System.out.println("userID= " + userID + " passord= " + password);
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
