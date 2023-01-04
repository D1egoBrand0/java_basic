package Ch04;

import java.util.Scanner;

public class C02스캐너 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num1 = scan.nextInt();
//		System.out.println("입력된 정수 값 : " + num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = scan.nextDouble();
//		System.out.println("입력된 실수 값 : "+ num2);
//
//		System.out.print("문자열 입력 : ");
//		String str1 = scan.next();
////		문자열 입력받기기능 함수. 띄워쓰기는 포함하지 않는다.
////		문자열 입력받기기능 함수. 띄워쓰기는 포함한다.
//		System.out.println("입력된 문자 값 : "+ str1);
//		
//		System.out.print("문자열 입력 : ");
//		String str2 = scan.nextLine();
//		String str3 = scan.nextLine();
//		System.out.println("입력된 띄워쓴 문자 값 : "+ str3);
////		주의점 nextLine() 함수사용시 주의할점
////		nextInt(), nextDouble(),next()함수 사용이후에
////		nextLine()함수를 사용해서 문자열을 받는 경우
////		sc.nextLine()을 한번더 사용해서 읽어들이는 버퍼라인을 초기화해야한다.

		
//		---------------------------------------
		System.out.print("정수 입력 : ");
		int num1 = scan.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		System.out.print("문자열 입력 : ");
		String str1 = scan.nextLine();
		scan.nextLine();				// 이런식으로 넣어주자.
		System.out.println("입력된 문자 값 : "+ str1);
		scan.close();
//		반드시 닫아주자
	}

}
