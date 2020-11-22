package coo.oop.method.static_;

public class StaticMethod {
	private static String value ="hello" ;
    
    //필드가 모두 static 일 때는 메소드도 전부 static 이어야 함
    //static method
    //1. 반환값 없고 매개변수 없는 메소드
    //value 필드 값을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper

	public static void toUpper() {
		value = value.toUpperCase();
		System.out.println(value);
	}
	 //2. 반환값 없고 매개변수 있는 메소드
    //인덱스와 문자를 전달받아
    //value 필드에서 전달받은 인덱스 위치의 값을 전달받은 문자로 변경하는 static 메소드
    //메소드명 : setChar

	public static void setCahr(int dex,char ch) {
		//필드값에              value 필드에서 전달받은 인덱스 위치의 값을  +   //밑에dex+1을 안하면 추가된다 인덱스 값이 안맞기 떄문인거 같다.  
												
		value = value.substring(0,dex) + ch + value.substring(dex+1);
														//결가값  = dHELLO가 된다
    	System.out.println(value);
	
	}
	//3. 반환값 있고 매개변수 없는 static 메소드
    //value 필드에 기록된 글자갯수 리턴 처리
    //메소드명 : valueLength
	public static int valeLength() {
		return value.length();
	}
	
    //4. 반환값 있고 매개변수 있는 static 메소드
    //문자열값을 전달받아, value 필드값과 하나로 합쳐서 리턴 처리
    //메소드명 : valueConcat

	public static String valueConcat(String ss) {
						//concat =문자열과 문자열을 합친 값을 리턴한다 라는 뜻
		return value = value.concat(ss);
		
	}

}
