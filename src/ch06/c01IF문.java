package ch06;

import java.util.Scanner;

public class c01IF문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
////		01 단순 if
//		int age = sc.nextInt();
//		if (age>=8) {
//			System.out.println("학생이다");
//		}
//		System.out.println("처음 if문 종료");
//		
//		if (age<8) {
//			System.out.println("미취학 아동이다");
//		}
//		System.out.println("두번째 if문 종료");
//		System.out.println("프로그램 종료");
//		sc.close();
		
////		02 if-else
//		int age = sc.nextInt();
//		if (age>=8 && age<=29) {
//			System.out.println("학생이다");
//		}
//		else if (age<8) {
//			System.out.println("미취학 아동이다");
//		}
//		sc.close();
		
//		입력받은 수가 짝수인지 홀수인지 확인
//		입력받은 수가 3의 배수인지 아닌지 확인
//		두 수를 입력받아 큰수를 출력
//		3수를 입력받아 큰수를 출력
		System.out.print("정수를 입력 : ");
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
//		int number4 = sc.nextInt();
		if (number1%2==0) {
			System.out.println(number1 + "은/는 짝귀");
		}else {
			System.out.println(number1 + "은/는 홀수");
		}
		
		if (number1%3==0) {
			System.out.println(number1 + "은/는 3의 배수이다");
		}else {
			System.out.println(number1 + "은/는 3의 배수아니다");
		}
		
		if(number1>number2) {
			System.out.println(number1+"이/가 더 크다");
		}else if (number1<number2) {
			System.out.println(number2+"이/가 더 크다");
		}
		
		
		
		if (number1>=number2 && number1 >=number3) {
			System.out.println(number1+"이/가 가장 큰 수");
		} else if(number2>=number1 && number2>=number3) {
			System.out.println(number2+"이/가 가장 큰 수");
		} else if(number3>=number1 && number3>=number1) {
			System.out.println(number3+"이/가 가장 큰 수");
		} else if (number1==number2 && number2==number3) {
			System.out.println("동일한데?");
		}
		
		
//		
//		for (int i = 0; i < 3; i++) {
//			int save = 0;
//			if (number1>number2) {
//				save = number1;
//			}
//			return save;
//		}
//			
//		int r = (number1>=number2 && number1>=) 
		
	}

}
