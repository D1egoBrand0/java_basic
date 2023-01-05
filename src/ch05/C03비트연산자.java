package ch05;

public class C03비트연산자 {

	public static void main(String[] args) {
		int num1 = 15;					// 00000000 00000000 00000000 00001111
		int num2 = 20;					// 00000000 00000000 00000000 00010100
		int num3 = num1&num2;			// 00000000 00000000 00000000 00000100
		int num4 = num1|num2;			// 00000000 00000000 00000000 00011111 
		int num5 = num1^num2;			// 00000000 00000000 00000000 00010011   
		// ^ : 둘 다 true면 false로 변환	 
		int num6 = ~num1;				// 00000000 00000000 00000000 11110000
		
		System.out.println("AND 비트연산결과 : " + num3);
		System.out.println(" OR 비트연산결과 : " + num4);
		System.out.println("XOR 비트연산결과 : " + num5);
		System.out.println("NOT 비트연산결과 : " + num6);
		
		
		int n = 10;					// 00000000 00000000 00000000 00001010
		int reversen = ~n;
		System.out.println(reversen);
	}

}
