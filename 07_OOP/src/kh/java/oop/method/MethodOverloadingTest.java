package kh.java.oop.method;
/**
 * 메소드 오버로딩 Overloading
 * 한 클래스내에서 동일한 이름, 매개변수 선언부가 다른메소드를 선언 하는것이라고 한다.
 * 조건
 * -메소드명이 동일해야한다.
 * -매개변수 선언이 달라야한다. 타입,갯수, 순서 가 달라도된다.(호출시 모호하지 않을것)
 * 
 * 
 * 
 * --주의점--
 * 접근제한자, 리턴타입을 상관하지 않는다.
 * -매개변수명도 상관하지 않는다.
 *
 */
public class MethodOverloadingTest {

	public static void main(String[] args) {
		System.out.println(123);
		System.out.println("안녕");
		System.out.println('a');
		System.out.println(true);
	}
	/*
	 * public void pringln(int n){
	 * 
	 */
	
	public void test() {}
public void test(int a) {}

	public void test(char c) {}
	public void test(String s) {}
	public void test(int b,int a) {}
	public void test(int a ,String s) {}
	public void test(String s,int a) {}
//	public void test(int a,int b) {}  //매개변수명은 상관히 않는다.
//	public int test() { returm 100;} 리턴 타입은 상관하지 않는다.
//	private void test() {}//접근제한자는 상관치 않는다ㅏ.
}
