package com.kh.test.dientional.array.test.Sample;

import java.util.Arrays;
import java.util.Random;

public class Sample {

	public static void main(String[] args) {
		Sample s = new Sample();
		//s.exercies1();
	//	s.test();
		s.test1();
	}
	public void test1() {
	int[][] arr = new int [4][4];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 100)+1;
				arr[i][3] += arr[i][j];
			}
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[arr.length-1][j] += arr[i][j];
			
			}

		}
		System.out.print(Arrays.deepToString(arr));

	}
	public void exercise2() {								
		int[][] arr = new int[4][4];						// 행렬 생성
		int sum = 0;										// 합계용 변수
		
		
		for(int i = 0; i < arr.length-1; i++) {
			sum = 0; 									//for문돈 sum 초기화시키기
			
			for(int j = 0; j < arr[0].length-1; j++) {
				// 합계 전 랜덤 변수 할당
				int rnd = (int)(Math.random()*100+1);
				arr[i][j] = rnd;
				sum += rnd;									// 해당 행의 열 합계
			}
			arr[i][3] = sum;							// 합계출력해야 하는 열부분
			arr[arr.length-1][arr[0].length-1] += sum;
		}
		
		for(int j = 0; j < arr[0].length-1; j++) {
			sum = 0;
			for(int i = 0; i <arr.length-1; i++) {
				int rnd = (int)(Math.random()*100+1);
				arr[i][j] = rnd;
				sum += rnd;	
				
			}
			arr[3][j] = sum;
			arr[arr.length-1][arr[0].length-1] += sum;
		}
	    
		
		//값읽기
	    String header = "\t0열\t1열\t2열\t3열\n"
	                 + "-----------------------------------------------------------";
	    System.out.println(header);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+"행\t");
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t"); 			// 행열출력
			}
			System.out.println();
		}
	}

public void test() {
		int[][] arr1 = new int[4][4];
		Random r = new Random();
		int[] sum = new int[arr1.length];
		int[] sum2 = new int [arr1[0].length];
		
		outer:
		for(int i = 0; i < arr1.length; i++) {			
			
			if(i == arr1.length-1) {
				for(int k = 0; k <arr1[0].length; k++) {
					
					for (int t = 0; t < arr1.length-1; t++) {
					sum2[k] += arr1[t][k];
					}
					arr1[arr1.length-1][k] = sum2[k];
					System.out.print(arr1[arr1.length-1][k] +" ");
				}
				continue outer;
			}
			else {
			for(int j = 0; j < arr1[0].length ; j++) {
				
				if(j== arr1[0].length-1) {
					arr1[i][j] = sum[i];
					System.out.println(arr1[i][j]+" ");
					continue outer;
				}
				arr1[i][j] = r.nextInt(100)+1;
				System.out.print(arr1[i][j]+" ");
				sum[i] += arr1[i][j];
			}
			}
			System.out.println();
			
		}
		
	}

	public void exercies1() {
		int[][] arr = new int[4][4];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			// 처음에 배열행을 만들어준다
			sum = 0;
			for (int j = 0; j < arr[0].length - 1; j++) { // 램덤 점수의 배열 마이너스 하는이유는 3번째 에 합을 더해줘야 하기떄문에 마이너스 하는것이다.

				arr[i][j] = (int) (Math.random() * 100 + 1); // 3번쨰 100번의 램던 점수를 행,열에 넣어준다
				sum += arr[i][j]; // 행열의 값을 더해준다.

			}

			arr[i][3] = sum; // i행의3번쨰 열 을 선언해서
			
		}

		// 다시 열을 행열을 만들어준다,
		for (int i = 0; i < arr[0].length; i++) { // 행을 만들어준다.
			sum =0;
			System.out.print(i + "행 :");
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (int) (Math.random() * 100 + 1); // 3번쨰 100번의 램던 점수를 행,열에 넣어준다
				sum += arr[i][j];
			

			
			}
			arr[3][i]=sum;
		
			System.out.println();
		}
		

	}

}
