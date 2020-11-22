package coo.oop.method.static_;

public class Run {

	public static void main(String[] args) {
		
	  StaticMethod.toUpper();	
		
		System.out.println("================");
		StaticMethod.setCahr(0	,'1');
		System.out.println("================");
		System.out.println(StaticMethod.valeLength());
		System.out.println("================");
		System.out.println(StaticMethod.valueConcat("오늘은 즐거운 과제를 했네요"));
	}

}
