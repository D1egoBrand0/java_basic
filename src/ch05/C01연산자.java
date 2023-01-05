package ch05;

import java.util.Scanner;

public class C01연산자 {

	public static void main(String[] args) {
//		산술연산자 (+ - * / %)
		System.out.println("산술연산자");
		int a = 10, b = 20;;
		System.out.println("a + b = "+( a + b ));
		System.out.println("a - b = "+( a - b ));
		System.out.println("a * b = "+( a * b ));
		System.out.println("b / a = "+( b / a ));		//나누기 - 몫
		System.out.println("a % b = "+( 10 % 6 ));		
//		나누기 - 나머지(1.짝홀수구분, 2.배수구분, 3.수의 범위제한, 4.자리수구분 )
		System.out.println("-a = "+-a);
		
//		대입연산자
//		공간 = 값 (우선처리)
//		문제
//		두 정수를 입력받아 두 수의 합/곱/차를 출력하는 프로그램을 만듭니다.
//		Scanner를 사용합니다.		
		System.out.println("\n대입연산자");
		Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 = ");
        int first = sc.nextInt();
        System.out.print("두번째 정수 = ");
        int second = sc.nextInt();
        sc.nextLine();
        int sum = first + second;
        int minus = first - second;
        int multi = first * second;

        System.out.printf("%d + %d = %d", first, second, sum);
        System.out.printf("\n%d - %d = %d", first, second, minus);
        System.out.printf("\n%d * %d = %d\n", first, second, multi);
        sc.close();
	
//		복합대입연산자(선택)
		System.out.println();
		System.out.println("복합대입연산자");
		int x = 10;		
		x += 10;		// x = x + 10;
		x -= 5;			// x = x - 5;
		x *= 3;			// x = x * 3;
		System.out.println("x=" + x);
		
//		비교연산자(중요!)		(>, >=, <, <=, ==, !=     ? true/false)
		System.out.println();
		System.out.println("비교연산자");
		int d = 10;
		int f = 20;
		System.out.printf("D = %d, F = %d\n",d ,f);
		System.out.println("D == F : " + (d == f));
		System.out.println("D  > F : " + (d  > f));
		System.out.println("D <  F : " + (d <  f));
		System.out.println("D >= F : " + (d >= f));
		System.out.println("D <= F : " + (d <= f));
		System.out.println("D != F : " + (d != f));
		
//		논리연산자(중요!)
//		AND	&& : 모든조건식이 true여야 true반환 
//		OR	|| : 조건식 중 하나라도 true면 true 반환
//		!      : true 일때 false 반환, false 일때 true반환
		System.out.println();
		System.out.println("논리연산자");
		System.out.println("AND");
		System.out.println("true  AND true = "  + (true  && true));
		System.out.println("false AND true = "  + (false && true));
		System.out.println("true  AND false = " + (true  && false));
		System.out.println("false AND false = " + (false && false));
//		좌측부터 읽어들이기에 뒤에 것이 쓸모없으면 경고표시가 나온다.
			
		System.out.println("\nOR");
		System.out.println("true  OR true = "  + (true  || true));
		System.out.println("false OR true = "  + (false || true));
		System.out.println("true  OR false = " + (true  || false));
		System.out.println("false OR false = " + (false || false));
		
		System.out.println("\n!");
		boolean flag = true;
		System.out.println("flag : "+flag);
		System.out.println("!flag : "+!flag);
		
//		증감연산자(++,--)
//		++a(--a) : 전치 연산자 : 먼저 값1 증가(감소) 이후 다른 연산자 처리 
//		a++(a--) : 후치 연산자 : 다른 연산자 처리 먼저 한 후 1증가(감소)
		System.out.println("\n증감연산자");
		int q = 10, w = 10, e,r;
		e = --q + w--;
		r = q-- + w--;
		System.out.printf("q=%d,w=%d,e=%d,r=%d\n",q,w,e,r);
	
//		삼항연산자
//		(조건식)? 참인경우 실행코드 : 거짓인 경우 실행코드 ;
		System.out.println("\n삼항연산자");
		int score = 85;
		int kor = 90;
		int eng = 60;
		char grade = (score > 90) ? 'A' : 'B';
		System.out.println(score + "점은 " + grade + "등급입니다.");
		char gradex = (kor > 80 && eng > 80) ? 'A' : 'B';
		System.out.println(gradex);
	}

}
