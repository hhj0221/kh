package kh.java.oop.encapsulation;

public class AccountMain {

	public static void main(String[] args) {
			
		Account acc= new Account();
//		acc.name ="홀길동";
//		acc.balance = 1_000_000;
//		
		acc.setName("홍길동");
		acc.setBalance(1_000_000);
		
	
		//입금
//		acc.deposit(500_000);
//		System.out.printf("%s 님의 계좌 잔액은 %d원 입니다 .%n",acc.getName(),acc.getBalance());
		
		//출금
		/*
		 * acc.balance -= 700_000;
		 * System.out.printf("%s 님의 계좌 잔액은 %d원 입니다 .%n",acc.name,acc.balance);
		 */
		acc.witdraw(700_000);
		System.out.printf("%s 님의 계좌 잔액은 %d원 입니다 .%n",acc.getName(),acc.getBalance());
	}


}
