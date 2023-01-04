package ch04;

import java.util.Scanner;
// ctr + shift + o 누르면 필요한 라이브러리가 자동으로 들어감

public class C01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int sum = num1 + num2 + num3 + num4;
		
		System.out.printf("%d + %d + %d + %d = %d\n",num1,num2,num3,num4,sum);
		scan.close();
//		스캐너 제거. 메모리 누수현상이 발생할수 있기 때문에.
//		스캐너 쓸때 여러개 있으면 스페이스바 누르면 같이 사용할수 있다.
		
	}

}
