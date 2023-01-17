package ch10;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		//[문제]1차원 배열
		//10 크기의 int형 배열을 만들어서
		//반복문과 함께 해당배열의 0 - 9 까지 요소에 각각 정수값을 입력
		//합,평균,최대값,최소값을 구합시다
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int [10];
		int sum = 0;
		int max = arr1[0];	// 0인 상태이다
		int min = arr1[0];	// 0인 상태이다
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
			sum += arr1[i];
			if (max<=arr1[i]) {
				max = arr1[i];
			}
//			if (min>=arr1[i]) {		//0보다 작은 수가 들어갈리 없으므로  
//				min = arr1[i];		//min은 계속 0이된다.
//			}						//고로 min은 따로 밖에서 한번 더 돌려줘야 한다.
		}
		System.out.println("변화전 배열[0]값 : " + min);
		min = arr1[0]; 				// 배열[0]값 재정의해준다
		System.out.println("변화된 배열[0]값 : " + min);
		for(int num : arr1) {
			if(min>num) {
				min=num;
			}
		}
		double avg = (double)sum/arr1.length;
		System.out.printf("합 : %d, 평균 : %.1f, 최대값 : %d, 최소값 : %d",sum,avg,max,min);
		//[문제]2차원 배열
		//문제 
		//5명의 학생의 국/영/수 점수를 입력받아 출력을 해봅시다
//		int score[][] = new int [3][5];
//		for (int i = 0; i < score[i].length; i++) {
//			for (int j = 0; j < score[j].length; j++) {
//				System.out.println(score[j]);
//			}System.out.println(score[i]);
//		}
		//학생별 평균 구하기
		//과목별 평균 구하기
		//각 행의 합 과 전체 합 // 각행의 평균 전체 평균을 출력하세요
		
		//출력예
		//1 학생 점수입력(국/영/수 순서) : 100 70 60
		//2 학생 점수입력(국/영/수 순서) : 99 98 66
		//3 학생 점수입력(국/영/수 순서) : 99 88 77 
		//4 학생 점수입력(국/영/수 순서) : 100 55 66
		//5 학생 점수입력(국/영/수 순서) : 55 66 77
		//1 학생 총점 : ? 평균 ? 
		//2 학생 총점 : ? 평균 ?
		//3 학생 총점 : ? 평균 ?
		//4 학생 총점 : ? 평균 ?
		//5 학생 총점 : ? 평균 ?
		//국어 총점 : ? 국어 평균 :?
		//영어 총점 : ? 영어 평균 :?
		//수학 총점 : ? 수학 평균 :?

	}

}
