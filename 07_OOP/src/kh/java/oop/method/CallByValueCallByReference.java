package kh.java.oop.method;

import java.util.Arrays;

public class CallByValueCallByReference {

	public static void main(String[] args) {
		int a =9;
		int[] b= {1,2,3}; ;
		CallByValueCallByReference c= new CallByValueCallByReference();
		//1.call by value = :r값(리터럴)이 복사되는 경우
		
		a = c.test(a);
		System.out.println(a);
		
		//2.call by reference
		c.test(b);
		System.out.println(Arrays.toString(b));
		
	}

	public int test(int x) {
		x *= 100;
		return x;
	
	
	}
	public void test(int[] arr) {
		arr[0] *=100;
	}

}

//