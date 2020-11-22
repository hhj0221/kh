package kh.java.args;

import java.util.Arrays;

public class ArraySortTest {

	public static void main(String[] args) {

		ArraySortTest a = new ArraySortTest();
		// a.test1();
		// a.test2();
		 a.test3();

		//a.test4();
		//a.t();
	}

	public void t(){
		
	
		int[] no={100,97,89};
		int[][]count={{3,4,6},{7,4,5}};
		System.out.println(no.length);
		System.out.println(count.length);
		System.out.println(count[1].length);
		System.out.println(no[2]+count[1][2]);
	
		}

	public void test4() {
		int var = 10;
		int re;

		re = var++;
		System.out.println(re);

		re = ++var;
		System.out.println(re);
		re = var + var / var;
		System.out.println(re);
		re = var + 1;
		System.out.println(re);

	}

	public void test3() {
		int[] lotto = new int[6];
		int idx = 0;

		outer: for (;;) {
			int num = (int) (Math.random() * 45 + 1);
			// 중복제거
			for (int i = 0; i < idx; i++) {
				if (lotto[i] == num)
					continue outer;
			}
			lotto[idx++] = num;
			if (idx == 6)
				break;
		}

		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = i + 1; j < lotto.length; j++) {
				if (lotto[i] > lotto[j]) {
					swap(lotto, i, j);

				}

			}

		}
		System.out.printf(Arrays.toString(lotto));
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * 순차 정렬 Sequential Sort
	 * 
	 * 한 회차마다 해당하는 인덱스 적합한 수를 찾는다.
	 * 
	 */
	public void test2() {
		int[] arr = { 4, 3, 0, 2, 1 };
		// i : 0 1 2 3

		for (int i = 0; i < arr.length - 1; i++) {
			/*
			 * i = 0 - > j = 1 2 3 4
			 *  i = 1 - > j = 2 3 4 
			 *  i = 2 - > j = 3 4 
			 *  i = 3 - > j = 4
			 * 
			 */
			for (int j = i + 1; j < arr.length; j++) {
				System.out.printf("%d : %s%n", i, Arrays.toString(arr));
				// 오름차순
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
			System.out.println("==============");
			System.out.println(Arrays.toString(arr));
		}

	}

	public void test1() {
		int num1 = 10;
		int num2 = 20;

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println(num1); // 10
		System.out.println(num2); // 20
		int[] arr = { 2, 1, 3 };
		/*
		 * temp = arr[0]; arr[0] = arr[1]; arr[1] =temp;
		 */
		swap(arr, 0, 1);
		System.out.println(Arrays.toString(arr));
	}

}
