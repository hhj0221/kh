package kh.java.oop.method;

public class RecursionTest {

	public static void main(String[] args) {
		RecursionTest	r = new RecursionTest();
		
		//factorial 5!= 5*4*3*2*1	
		int result =r.factorial(5);
		System.out.println(result);
		
	}
	//재귀함수는 종료조건 반드시 명시하고,스스로 호출할것
	//StackOverFlowError 주의할것
	
	public int factorial(int n) {
		System.out.println(n);
		if(n==1) {
			return 1;
		}else {
			
		}
		
		return n *factorial (n-1);
	}

}
