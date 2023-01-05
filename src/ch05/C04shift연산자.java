package ch05;

public class C04shift연산자 {

	public static void main(String[] args) {
		int n1 = 15;				// 00000000 00000000 00000000 00001111
		int n2 = 20;				// 00000000 00000000 00000000 00010100
		int n3 = n2<<2;				// 00000000 00000000 00000000 01010000
		int n4 = n2>>2;				// 00000000 00000000 00000000 00000101
		
		System.out.println("<<Shift 연산결과 : " + n3); 		// 계산쉽게 -> 20*2^3
		System.out.println(">>Shift 연산결과 : " + n4);		// 계산쉽게 -> 20*2^-2		
			
		}

}
