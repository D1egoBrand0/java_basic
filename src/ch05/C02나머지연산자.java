package ch05;

import java.util.*;

public class C02나머지연산자 {

	public static void main(String[] args) throws InterruptedException  {
		Scanner sc = new Scanner(System.in);
////		1. 짝홀수 구분 - (n % 2) == 0 or 1 boolean과 동일하다
//		int num = sc.nextInt();
//		sc.nextLine();
//		String result = (num %2 == 0) ? "짝수입니다.":"홀수입니다.";
//		System.out.println("결과 : " + result);
//		
////		2. 배수 구분
//		int n1,n2,n3,sum;
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		n3=sc.nextInt();
//		sum = n1 + n2 + n3;
//		String result1 = (sum %5 == 0) ? "5의 배수입니다.":"5의 배수가 아닙니다.";
//		System.out.printf("합계는 %d. 결과 : %s\n", sum, result1);
		
//		3. 수의 범위제한
//		n % 2 = 0~1
//		n % 3 = 0~2
//		n % 10 = 0~9
//		n % 100 = 0~99
//		난수생성
////		01. 랜덤객체 생성
//		Random rnd = new Random();
//		while (true) {
//			System.out.println(rnd.nextInt(5));		// 0~4까지 정수 랜덤 출력
//			Thread.sleep(1000);
//		}
//		
////		02. Math.random()사용
//		while (true) {
//			System.out.println( (int)(Math.random()*100)%45+1 );	//정수 45까지
//			Thread.sleep(100);
//		}
		
////		4. 자리수 구분
//		int numx = 56789;
//		
//		System.out.println("우측 끝 1자리 : " + (numx%10));
//		System.out.println("우측 끝 2자리 : " + (numx%100));
//		System.out.println("우측 끝 3자리 : " + (numx%1000));
//		System.out.println("우측 끝 4자리 : " + (numx%10000));
//		System.out.println();
//		
//		System.out.println("좌측 끝 1자리 : " + (numx/10000));
//		System.out.println("좌측 끝 2자리 : " + (numx/1000));
//		System.out.println("좌측 끝 3자리 : " + (numx/100));
//		System.out.println("좌측 끝 4자리 : " + (numx/10));
//		System.out.println();
		
//		정수 하나를 입력받아 거꾸로 저장해보기()반복문법 이후 풀어보기
//		"%","/" 연산 동시이용하기
//		입력 : 1234
//		저장
//		int reverse = 4321
//		출력 : 4321

//		정수값 3개를 입력받아서 합이 짝수이면서 5의 배수 일때 '참' 아니면 '거짓'출력하기 
		System.out.println("정수를 입력하시오 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int sum = num1 + num2 + num3;
		String result2 = (sum %2==0 && sum%5 ==0) ? "참":"거짓";
		System.out.printf("합계는 %d이고, 결과는 %s입니다.",sum,result2);
		
		sc.close();
		
		
	}

}
