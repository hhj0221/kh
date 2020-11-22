package kh.java.oop.encapsulation;

public class Account {
	// 필드 /메소드의 접근제한자 public protected default private
	// private 해당 클래스 안에서만 접근 가능
	private String name;
	private long balance;

	public void setName(String name_) {
		// this는 현재객체를 가리키는 참조변ㅅ
		this.name = name_;
	}

	public void setBalance(long balance_) {
		balance = balance_;
	}

	/**
	 * 입금메소드
	 * 
	 */
	/**
	 * getter 필그값 가져오기 해당의 필ㄷ의 자료형과getter리턴타입은 동일하다
	 * 
	 * @return
	 */
	public String getName() {

		return name;

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		if (money > 0) {
			balance += money;
			System.out.printf("%s님의 계좌에 %d 원 입금완료%n ", name, money);
			System.out.printf("%s님의 계좌 잔액은 %d 원  %n", name, balance);
		}

		else {
			System.out.println("우요한 금액을 입력하세요.");
		}
	}

	/**
	 * 출금
	 * 
	 */
	public void witdraw(int money) {
		if (money <= balance) {
			balance -= money;
			System.out.printf("%s님의 계좌에 %d 원 출금 완료%n ", name, money);
			System.out.printf("%s님의 계좌 잔액은 %d 원  %n", name, balance);

		} else {
			System.out.println("잔액이 부족합니다.");
		}

	}

}
