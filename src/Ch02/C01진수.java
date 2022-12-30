package Ch02;

public class C01진수 {

	public static void main(String[] args) {
//		문제
//		2진수를 10진수로
//		01100010	64+32+2			98
//		01010001	64+16+1			81
//		01100110	64+32+4+2		102
//		
//		2진수를 10진수로
//		String num2Str = "01100010";
//		int num2 = Integer.parseInt(num2Str, 2);
//		System.out.println(num2);
		
		
//		10진수를 2진수로
//		31 			00011111
//		25			00011001
//
//		8bit단위로 계산하는 것이 좋다.(1byte)
		
//		십진수를 2진수로
		int i = 111;
		String binaryString = Integer.toBinaryString(i); //2진수
		System.out.println(binaryString);
		

//		진법변환 서식문자
//		%d		: 10진 정수 서식문자
//		%o		: 8진수 서식문자
//		%x		: 16진수 서식문자
		
		System.out.printf("10진수 : %d\n",0b1111);	//2진수 :2진수를 의미하는 접두사
		System.out.printf("10진수 : %d\n",173);   	//10진수
		System.out.printf("10진수 : %d\n",0255);  	//8진수 (0:8진수를 의미하는 접두사)
		System.out.printf("10진수 : %d\n",0xAD);  	//16진수(0x:16진수를 의미하는 접두사)

		System.out.printf("8진수 : %o\n",173);  		//16진수(0x:16진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n",0255);  		//16진수(0x:16진수를 의미하는 접두사)
		System.out.printf("8진수 : %o\n",0xAD);  		//16진수(0x:16진수를 의미하는 접두사)
		// 16진수 표현 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F		
		System.out.printf("16진수 : %X\n",173);  		//16진수(0x:16진수를 의미하는 접두사)
		System.out.printf("16진수 : %X\n",0255);  	//16진수(0x:16진수를 의미하는 접두사)
		System.out.printf("16진수 : %X\n",0xAD);  	//16진수(0x:16진수를 의미하는 접두사)
		
		
		
		
	}

}
