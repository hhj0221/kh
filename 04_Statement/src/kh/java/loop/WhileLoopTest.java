package kh.java.loop;

public class WhileLoopTest {

	public static void main(String[] args) {
		WhileLoopTest wi = new WhileLoopTest();
	//	wi.test1();
		wi.test2();

	}
	public void test2() {
		for(int i = 1;i<=10;i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		int j =1;
		while(j<10) {
			System.out.print(j);
			j++;
		}
		System.out.println("-------------------");
		j =10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
	}
	public void test1() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("---------------");
		int j = 1;
		while (j<=10) {
			System.out.println(j);
			j++;
		}
		System.out.println("----------------");
		j = 10;
		while (j>=1) {
			
			System.out.println(j);
			j--;
			
		}
		System.out.println("------------------");
		j=1;
		while (j<20) {
			System.out.println(j);
			j+=2;
		}
		System.out.println("================");
		j =20;
		while(j>0) {
			System.out.println(j);
			j -= 2;
			
		}
		
	}


}
