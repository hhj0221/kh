package kh.java.oop.constructor;

public class UserMain {

	public static void main(String[] args) {
		User u1 = new User();

		User u2 = new User("honggd");
		u2.printUSerInfo();
		
		User u3 = new User("sinsa", "1234");
		u3.printUSerInfo();
	}

}
