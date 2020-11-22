package kh.java.array;
/**
 * 얕은 복사  shallow copy
 * -배열의 주소값(call stack)을 복사
 *  
 * 
 * 깊은 복사 deep copy
 * - 실제 배열(heap)을 복사 
 *  -System.arrayCopy
 * 
 */
public class ArrayCopyTest {

	public static void main(String[] args) {
		
		ArrayCopyTest a = new ArrayCopyTest();
	//	a.test1();
	//	a.test2();
		a.test3();
		
	}
	public void test3() {
		byte [] arr1 = {1,2,3,4,5};
		byte [] arr2 =arr1.clone();
		//복사를 한다 깊은복사 
		
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		//그래서주소값이 다른다.
		printArr(arr1);//불러온다 
		printArr(arr2);//복사 한 값을 불러온다.
		byte[] arr3 =  new byte[arr1.length];
	//	System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr1, 2, arr3, 1, 3);// arrycopy 는 Object src, int srcPos, Object dest, int destPos, int length
		printArr(arr3);							//	    	전송원 배열  소스배열의 개시위치    전송처 배열    전송처 데이터내의 게시    카피되는 배열 요소
				
	}
	/**
	 * 
	 */
	public void test2() {
		byte[] arr1 = {10,20,30};
		byte[] arr2 = new byte[arr1.length];
		for(int i =0; i<arr1.length;i++	) {
			arr2[i] =arr1[i];
		}
		arr1[1] =127;
		printArr(arr1);
		printArr(arr2);
	}
	public void test1() {
		byte [] arr1 = {1,2,3};
		//
		byte [] arr2 = arr1;
		arr1[1]=100;
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1.hashCode());
		System.out.println(arr2.hashCode());
		printArr(arr1);
		//메소드를 만들고 매개변수 추가 후
		//내용을 만들었다.
		printArr(arr2);
		
	}
	public void printArr_(byte[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(i<arr.length-1) {
				System.out.println(",");
				
			}
			System.out.println();
		}
	}
	public void printArr(byte[] arr) {
		//반복문 
		//i는 0 0<arr.길이 조건을 비교한뒤 i값을 플러스 해주어라
		//결과를 배열 i에 넣어라 인덱스값을
		//비교 검사 
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

}
