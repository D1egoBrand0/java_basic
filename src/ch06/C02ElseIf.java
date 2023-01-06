package ch06;

import java.util.Scanner;

public class C02ElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		국어, 영어, 수학
//		각 과목당 40점 미만 불합격
//		평균이 60미만이면 불합격
//		아니라면 합격
//		국어<40 -> 불합격
//		영어<40 -> 불합격
//		수학<40 -> 불합격
//		평균<40 -> 불합격
//		
//		int kor=0,eng=0,math=0,sum = 0;
//		double avg = 0.0;
//		
//		System.out.print("국어성적 : ");
//		kor = sc.nextInt();
//		System.out.print("영어성적 : ");
//		eng = sc.nextInt();
//		System.out.print("수학성적 : ");
//		math = sc.nextInt();
//		sum = kor + eng + math;
//		avg = (double)(sum / 3);
//		System.out.printf("총합성적 : %d, 평균성적 : %.2f\n",sum,avg);
//		
//		if (kor<40) {
//			System.out.println("불합격");
//		}
//		else if (eng<40) {
//			System.out.println("불합격");
//		}
//		else if (math<40) {
//			System.out.println("불합격");
//		}
//		else if (avg<40) {
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");
//		}
//		
		
//		나이별로 요금을 부과하는 else if문을 만들자
//		나이는 정수값으로 입력
//		8세미만  : 요금 1000원
//		14세미만 : 요금 2000원
//		20세미만 : 요금 2500원
//		20세이상 : 요금 3000원
		int age = sc.nextInt();
		int charge = 0;
		if (age<8) charge = 1000; 
		else if (age<14) charge = 2000;	
		else if (age<20) charge = 2500; 
		else charge = 3000;
		System.out.printf("나이는 %d세, 요금은 %d원이다.\n",age,charge);
//		한줄코딩일경우 {}는 삭제해도 사용된다고 들음.
	}

}
