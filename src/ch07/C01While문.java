package ch07;

import java.util.Scanner;

//import java.util.Scanner;

public class C01While문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
////		while (true){	
////			System.out.println("헬로월드");
////		}
////		무한반복이 된다. 주석처리
//		
//		int i = 0;	   //탈출을 위한 변수 지정
//		while (i<10)   //조건식 활용
//		{	
//			System.out.println("헬로월드");
//			i++;	   //조건식이 거짓이 되기위한 연산
//		}
//		
//
//		int i1 = 0;
//		int sum = 0;
//		while (i1<10){
//			i1++;
//			sum = sum+i1;
//			System.out.printf("i1의 값 : %d, sum의 값 : %d\n",i1,sum);	
//		}
//		System.out.println("sum의 값은 "+sum);
//
//		
////		1부터 n까지의 수의 합 구하기(n은 입력값)
////		n부터 m까지의 합 구하기 (n,m은 입력값)
////		n부터 m까지의 합 구하기 (n,m은 입력값), 조건은 n>m
		
		
		int i3 = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = 0;
////		01. 1부터 n까지의 수의 합 구하기(n은 입력값)
//		while (i3<n) {
//			i3++;
//			sum += i3;
//			System.out.printf("%d %d\n",i3, sum);
//		}
//		System.out.println("n까지의 합은 : " + sum);
		
		
//		02. n부터 m까지의 합 구하기 (n,m은 입력값)
		while (n<=m) {
			System.out.printf("%d %d\n",n, sum);
			sum += n;
			n++;
			System.out.printf("계산된 값 : %d %d\n",n, sum);
		}
		System.out.println("m까지의 합은 : " + sum);
		
		
//		03. n부터 m까지의 합 구하기 (n,m은 입력값), 조건은 n>m
		if (n>m) {
			while (m<=n) {
				System.out.printf("%d %d\n",m, sum);
				sum += m;
				m++;
			}
		} else {
			System.out.println("가정은 틀렸다!");
			while (n<=m) {
				sum += n;
				n++;
			}
		}
		System.out.println(">>> n ~ m의 합은 : " + sum);
		
	
//		강사님 코드 
//		swap 작업필요 - 변수하나 만들어서 n과 m을 바꿔주기
		if (n>m) {
			int tmp = n;
			n=m;
			m=tmp;
			while (n<=m) {
				System.out.printf("%d %d\n",m, sum);
				sum += n;
				n++;
			}
			System.out.print(">>> n ~ m의 합은 : " + sum);
		}  // 다시체크해야함
		
		
//		구구단 (2단)
		int dan = 2;
		int starti = 1;
		while (starti<=9) {
			System.out.printf("%d * %d = %d\n", dan, starti, dan*starti);
			starti++;
		}
		
//		구구단 (n단)
//		1부터 100까지 수중의 4의 배수만 출력하기
		int a = 0;
		while (a<=100) {
			if(a%4==0) System.out.println("a의 값 : "+a);
			a++;
		}
		
//		1부터 100까지 수중에 3의 배수의 합만 출력
		int e = 0;
		int sumx = 0; 
		while (e<=100) {
			if (e%3==0) {
				sumx += a;
			}
			e++;
			System.out.println(sumx);
		}
		System.out.println("3의 배수의 합은 "+sumx);
		
		
//		1부터 n까지 수중에 3의 배수의 합만 출력
		int g = 0;
		int goal = sc.nextInt();
		int sumToGoal = 0; 
		while (g<=goal) {
			if (g%3==0) {
				sumToGoal += g;
			}
			g++;
			System.out.println(sumToGoal);
		}
		System.out.println("3의 배수의 합은 "+sumToGoal);
	}
}
