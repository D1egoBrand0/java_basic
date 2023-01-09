package ch07;

import java.util.Scanner;

public class C02While문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		// 구구단(2~9단)
//		int reverseGuGuDan = 2;
//		int subDan=1;
//		while (reverseGuGuDan < 10) {
//			subDan=1;
//			while(subDan <10) {
//				System.out.printf("%d x %d = %d\n",reverseGuGuDan,subDan,reverseGuGuDan*subDan);
//				subDan++;
//			}
//			System.out.println();
//			reverseGuGuDan ++;
//		}

//		// 역구구단- 9단부터 2단
//		int reverseGuGuDan = 9;
//		int subDan=1;
//		while (reverseGuGuDan > 1) {
//			subDan=1;
//			while(subDan <10) {
//				System.out.printf("%d x %d = %d\n",reverseGuGuDan,subDan,reverseGuGuDan*subDan);
//				subDan++;
//			}
//			System.out.println();
//			reverseGuGuDan --;
//		}
		
//		// 역구구단- 9단부터 2단(9*9~2*1 순으로)
//		int reverseGuGuDanCondition = 9;
//		int subDan=9;
//		while (reverseGuGuDanCondition > 1) {
//			subDan=9;
//			while(subDan >0 ) {
//				System.out.printf("%d x %d = %d\n",reverseGuGuDanCondition,subDan,reverseGuGuDanCondition*subDan);
//				subDan--;
//			}
//			System.out.println();
//			reverseGuGuDanCondition --;
//		}
		
//		n단을 입력받아 m단까지 출력(n<m and n<8,m=<9)
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int subDan=1;
//		sc.nextLine();
//		if ((n<m && n<=8 && m<=9)) {
//			while (n < m) {
//				subDan=1;
//				while(subDan <10) {
//					System.out.printf("%d x %d = %d\n",n,m,n*m);
//					m++;
//				}
//				System.out.println();
//				n ++;
//				}
//		}
		
		
		
//		별찍기문제
//		1
//		*****
//		*****
//		*****
//		*****
//		int a = 0;
//		int b = 0;
//		while(a < 4) {
//			b=0;
//			while(b<5){
//				System.out.print('*');
//				b++;
//			}
//			a++;
//			System.out.println();
//		}
		
//		2
//		*
//		**
//		***
//		****
//		int a = 0;
//		int b = 3;
//		while(a < 4) {
//			b=a;
//			while(b > 0) {
//				System.out.print("*");
//				b--;
//			}
//			a++;
//			System.out.println('*');
//		}
		
////		강사님 코드
//		int a = 0;
//		int b = 0;
//		while(a < 4) {
//			b=0;
//			while(b <= a) {
//				System.out.print("*");
//				b++;
//			}
//			a++;
//			System.out.println();
//		}
		
//		문제 추가
//		높이를 입력받아서 높이만큼의 직각삼각형별이 찍히도록 출력
//		int height = sc.nextInt();
//		int a = 0;
//		int b = 0;
//		while(a < height) {
//			b=0;
//			while(b <= a) {
//				System.out.print("*");
//				b++;
//			}
//			System.out.println();
//			a++;
//		}
		
		
//		3
//		****
//		***
//		**
//		*		
//		int a = 4;
//		int b = 0;
//		while(a > 0) {
//			b=a;
//			while(b > 0) {
//				System.out.print("*");
//				b--;
//			}
//			System.out.println();
//			a--;
//		}
////		문제추가
//		int height = sc.nextInt();
//		int a = 0;
//		while(height > 0) {
//			a=0;
//			while(a < height) {
//				System.out.print("*");
//				a++;
//			}
//			System.out.println();
//			height--;
//		}
		
		
		
//		4
//		   *
//		  ***
//		 *****
//		*******
		
		int a = 0;
		int b = 0;
		String s = "*";
		while(a < 4) {
			b=a;
			while(b < 3) {
				System.out.print(" ");
				b++;
			}
			a++;
			System.out.print("*\n");
		}
		
		System.out.println();
		System.out.println();
		
////		강사님 코드
//		int i =0;	//개행
//		int j =0;	//공백
//		int k =0;	//별
//		while (i<4) {
//			j=0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		5
//		*******			a=1 b = 7
//		 *****			a=2 b = 5
//		  ***			a=3 b = 3
//		   *			a=4 b = 1 
		
		
		sc.close();
		
	}

}
