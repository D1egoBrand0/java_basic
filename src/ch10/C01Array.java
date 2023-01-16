package ch10;

import java.util.Scanner;

public class C01Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		자바의 배열은 객체형 배열이다
//		int[] arrayx = {1,2,5};
//		System.out.println(arrayx[0]);
////		길이가 3인 int형 1차원 배열의 생성
//		int[] ar1 = new int[3];
//		ar1[0] = sc.nextInt();
//		ar1[1] = sc.nextInt();
//		ar1[2] = sc.nextInt();
//		
//		System.out.println("길이 : " + ar1.length);
//		System.out.println("ar1[0] : " + ar1[0]);
//		System.out.println("ar1[1] : " + ar1[1]);
//		System.out.println("ar1[2] : " + ar1[2]);
		
////		단순for문
//		for (int i = 0; i < ar1.length; i++) {
//			System.out.println(ar1[i]);
//		}
////		foreach문
//		for(int num : ar1) System.out.println(num);
//		
		
		double [] ar2= {10.5,11.4,15.3,33.5};
		System.out.println("길이 : " + ar2.length);
		for(double num : ar2) System.out.println("ar2의 내용물 : " + num);
		
//		문제
//		5칸짜리 int형 배열 생성후 각각 키보드부터 값을 받아 순서대로 저장한 다음
//		배열에 있는 모든 요소 안의 숫자 합을 출력해보시오.
		int[] arrinput = new int[5];
		int sum =0;
		for(int a : arrinput) {
			a = sc.nextInt();
			sum +=a; 
		}
		System.out.println("Sum : "+sum);
		
		
//		복수저장공간
//		배열, List, Set, map, Properties
		
		
		
	}

}
