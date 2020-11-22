package coo.oop.method.nonstatic;

import java.util.Arrays;

public class NonStaticSample {
	public static void main(String[] args) {
		 	NonStaticSample n = new NonStaticSample();
		 	n.printLottoNumbers();
		 	//정수하나 입력
		 	int a  =19;
		 	//문자 입력
		 	char ch= 'a';
		 	//메소드를 불러와 메게 변수 값을 입력후 나오게 하는 것
		 	n.outputChar(a, ch);
		 	n.alphabet();
		 	System.out.println();
		 	
		 	String userString = "안녕하세요";
		 
		 	System.out.println(n.mySubstring(0,1,userString));
	}

	/**
	 * //1. 반환값 없고 매개변수 없는 메소드 //실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	 * //메소드명 : printLottoNumbers
	 */
	public void printLottoNumbers() {
		int[] randomNumber = new int[6];
		int index = 0;
		outer: for (;;) {
			//실행 요청시 1~ 1~45까지의 임의 정수 
			int num = (int) (Math.random() * 45 + 1);
			// 중복제거
			for (int i = 0; i < index; i++) {
				//배열의 i값이 == 랜덤 num이랑 비교후
		
				if (randomNumber[i] == num)
					//다시 처음으로 돌아가라 뜻
					continue outer;
				
			}
			//ㄱ랜덤 배열의 인덱스 값을 ++헤사 num의 값을 넣는것
			randomNumber[index++]=num;
			//if == 6 비교
			if(index == 6)
				break;
			
		
		
		}
		System.out.println(Arrays.toString(randomNumber));
	}

	
	//실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	//메소드명 : outputChar
	
	////2. 반환값 없고 매개변수 있는 메소드
	public void outputChar(int userInt ,char userC) {
	// 반복 하는 것
	for(int i =0;i<userInt;i++) {
		//문자를 정수 만큼 나오개하는 출력문
		System.out.print(userC);
		

	}
	System.out.println();
	}
	//3. 반환값 있고 매개변수 없는 메소드
	//실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	//메소드명 : alphabet
	//3. 반환값 있고 매개변수 없는 메소드
	public char  alphabet() {
		char alphaB =' ';
		//공백을 만들고
		alphaB = (char)(Math.random()*26+65);
					// 127로하면 알파벳이 안나온다 그래서	
					//알파뱃 갯수26+65번부터 시작 
		System.out.print
		(alphaB);
		return alphaB;
		
	}
	/**
	 * //4. 반환값 있고 매개변수 있는 메소드
	실행 요청시 문자열과 시작인덱스, 
	추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	메소드명 : mySubstring

	 */
	//4. 반환값 있고 매개변수 있는 메소드
	//실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	//추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리

	public String  mySubstring(int StrIndex ,int EndIndex,String userString) {
		String s ="";
		//실행시 문자열 값을 넣을 값
				 
		if(userString == null) {
			return null;
		}
			for(int i =StrIndex; i<=EndIndex;i++	) {
				s+=userString.charAt(i);
			}
		

		return s;
	
}
}
