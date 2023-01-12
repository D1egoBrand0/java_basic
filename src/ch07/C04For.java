package ch07;

import java.util.Scanner;

public class C04For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int i = 0; //초기값
//		while (i < 10)//조건식 
//		{
//			System.out.println("HELLO WORLD");
//			i++;//증감연산식
//		}
		
//		for(int i=0;i<10;i++)
//		{
//			System.out.println("HELLO WORLD");
//		}
		
		//1부터 10까지의 합
		
		//N부터 M까지의 합
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		for (int i = N; i <= M; i++) {
//			sum += i;
//		}System.out.println(sum);
		//2단 출력
//		int dan=2;
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//		}
		//N단 출력
//		int twoDan=sc.nextInt();
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("%d * %d = %d\n",twoDan,i,twoDan*i);
//		}
		//2-9단 출력
//		for (int i = 2; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);			
//			} System.out.println();
//		}
		//2-N단 출력
//		int N = sc.nextInt();
//		for (int i = 2; i <= N; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);			
//			} System.out.println();
//		}
		//N-M단 출력
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		for (int i = N; i <= M; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d\n",i,j,i*j);			
//			} System.out.println();
//		}
		//별찍기~
		
		int i = 0;
		int j = 0;
//		for (i = 0; i < 5; i++) {
//			for (j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		for (i = 5; i > 0; i--) {
			for (j = 0; j < 2*i-1; j++) {
					System.out.print("*");
					if(i==j) {
						System.out.print(" ");
					}
			}
			
			System.out.println();
		}
		
		sc.close();
		
	}

}
