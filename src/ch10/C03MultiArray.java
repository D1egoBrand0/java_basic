package ch10;

public class C03MultiArray {

	public static void main(String[] args) {
		// 이차원 배열[행][열]
		// 일차원 배열의 배열요소 단위는 자료형 단위이다.
		// 이차원 배열의 배열요소 단위는 일차원 배열이다.
		int[][] arr2 = {
				{10,20},
				{30,40,50},
				{60,70,80,90},
				{100,110,120,130,140}
		};
				
				
		//길이확인	
		System.out.println("arr2의 행 길이 : "+ arr2.length);
		System.out.println("arr2의 0번째 요소길이 : "+ arr2[0].length);
		System.out.println("arr2의 1번째 요소길이 : "+ arr2[1].length);
		System.out.println("arr2의 2번째 요소길이 : "+ arr2[2].length);
		System.out.println("arr2의 3번째 요소길이 : "+ arr2[3].length);
		
		
		for	(int [] arr: arr2) {
			for(int n :arr) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
	}

}
