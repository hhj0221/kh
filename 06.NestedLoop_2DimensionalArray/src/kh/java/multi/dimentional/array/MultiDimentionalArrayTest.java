package kh.java.multi.dimentional.array;

/**
 * 
 * 2차원배열 - 참조형 참조형태로 2차원 배열을 -간단히 행.열을 이용해서 배영을 할수 있다.
 *
 */
public class MultiDimentionalArrayTest {

	public static void main(String[] args) {

		MultiDimentionalArrayTest t = new MultiDimentionalArrayTest();
		// t.test1();
		/* t.test2(); */
		// t.test3();

		// t.test4();
		t.test5();

	}

	public void test5() {
		char[][] alph1 = new char[2][26];

		for (int a = 0; a < alph1.length; a++) {
			for (int b = 0; b < alph1.length; b++) {
				if (a == 0) {
					alph1[a][b]	=(char )('A'+ b);
				}
				else {
					alph1[a][b]	=(char )('a'+ b);
				}
				System.out.print(alph1[a][b] + " ");
			}
			System.out.println();
		}
	}

	public void test4() {
		int[][] arr = new int[3][4];
		int k = 2;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				// 값 대입
				arr[i][j] = k;
				k += 2;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();

			char[][] alpha = new char[2][26];
			char aa = 'A';
			char bb = 'a';
			for (int a = 0; a < alpha[0].length; a++) {
				for (int b = 0; b < alpha[0].length; b++) {
					if (a == 0) {
						alpha[a][b] = aa++;
					} else {
						alpha[a][b] = bb++;
					}
					System.out.print(alpha[a][b] + " ");
				}
				System.out.println();
			}
		}
	}

	public void test3() {
		char[][] alphabet = { { 'A', 'B', 'C', 'D', 'E' }, { 'a', 'b', 'c', 'd', 'e' } };
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[0].length; j++) {
				System.out.print(alphabet[i][j]);
			}
		}
	}

	public void test2() {
		String[][] arr;
		arr = new String[5][6];
		arr[0][0] = "이원빈";
		arr[0][1] = "김동현";
		arr[0][2] = "유영국";
		arr[0][3] = "강준혁";
		arr[0][4] = "정인석";
		arr[0][5] = "권승현";
		arr[1][0] = "김진하";
		arr[1][1] = "주진홍";
		arr[1][2] = "유인하";
		arr[1][3] = "정다미";
		arr[1][4] = "김지헌";
		arr[1][5] = "김지훈";
		arr[2][0] = "한광희";
		arr[2][1] = "정다솜";
		arr[2][2] = "이상원";
		arr[2][3] = "이제환";
		arr[2][4] = "황현준";
		arr[2][5] = "정다빈";
		arr[3][0] = "정수빈";
		arr[3][1] = "김지수";
		arr[3][2] = "김자경";
		arr[3][3] = "박소연";
		arr[3][4] = "서강석";
		arr[3][5] = "유리";
		arr[4][0] = "정소희";
		arr[4][1] = "사영리";
		arr[4][2] = "강송이";
		arr[4][3] = "강유정";
		arr[4][4] = "이효정";
		arr[4][5] = "이수연";
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void test1() {
		// 1.배열 선언
		// int[][] 타입

		int[][] arr;
		// 2.할당
		arr = new int[2][3];
		// 3.요소에 값대입
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arr[i][j]);

			}

		}

	}

}
