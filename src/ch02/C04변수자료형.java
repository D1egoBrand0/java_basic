package ch02;

public class C04변수자료형 {

	public static void main(String[] args) {

//		-----------------------
//		정수형
//		정수형 int-4byte 정수 (부호미지원)
		int n1 = 0b10101101;		//2진수값
		int n2 = 173;				//10진수
		int n3 = 0255;				//8진수
		int	n4 = 0xad;				//16진수
		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
//		정수 byte-1byte 정수 (부호지원)
		byte b1 = -128;
		byte b2 = -30;
		byte b3 = 30;
		byte b4 = 127;
		byte b5 = (byte)129;   //문제발생 - -128~127까지만 가능. 즉 (2^n) - 1을 넘어가버림
		System.out.printf("%d %d %d %d %d\n", b1,b2,b3,b4,b5);
		
//		정수 short-2byte 정수 부호 지원  |  char-2byte 정수 부호 미지원(양수만 ok)
		char c1 = 65535;	//(0~2^16-1)(0~65535)
		char c2 = 60000;
		short s1 = 32767;   //(-2^15 ~ +2^15-1)(-32768 ~ +32767)
		short s2 = (short)c2;
		System.out.printf("%c + %c + %d %d\n", c1,c2,s1,s2);	
		
//		정수 long-8byte 정수 부호지원
		long l1 = 10;				// 형변환해서 넣어준다.
		long l2 = 20L;				// 8바이트 공간에 처음부터 넣어준다. 형변환없음.  
//		L,l 리터럴접미사 : long자료형 사용하여 값을 저장
//		long l3 = 10000000000;		//문제발생 - int형인 상태에서 변환하려고 해도 범위가 벗어나있었기에 에러.
		long l4 = 10000000000L;
		System.out.printf("%d + %d + %d\n", l1,l2,l4);
		
		
//		--------------------------------------
//		실수
//		유리수와 무리수의 통칭(소숫점 이하의 값을 가지는 수) n.nnnn...
//		float : 4byte 실수(6-9자리)
//		double : 8byte 실수(15~18자리),기본자료형
		
//		정밀도확인
		float f1 = 0.123456789123456789F;		//f,F:float형 접미사
		double d1 = 0.123456789123456789;
		System.out.println(f1);
		System.out.println(d1);
		
//		고정소수점 - 장점:속도 빠름 				단점 : 메모리공간효율성 낮음 
//		부동소수점 - 장점:메모리공간효율성 높음		단점 : 속도 느림
//		1byte는 8개의 공간. 고정으로하면 버려지는 소수점 자리들이 생기지만, 
//		부동소수점하면 들어오는 숫자들에 따라 공간전체에서 소숫점 자리가 옮겨진다.
		
		
//		-----------------------------------
//		단일문자 char 2byte 정수.		ex)..아스키코드, 유니코드
		char ch1 ='a';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 98;
		System.out.println(ch2);
		System.out.println((int)ch2);
	
		char ch3 = 'b'+1;
		System.out.println(ch3);
		System.out.println((int)ch3);
	
		byte ch4 = 'c'+2; 
		System.out.println((char)ch4);
		System.out.println(ch4);
		
		char ch5 = '가';
		char ch6 = 0xac00;
		System.out.printf("%c %c\n",ch5,ch6);
		
//		\\u :유니코드 값 이스케이프문자
//		U+1100~U+11FF 사이에 한글 자모 영역, U+AC00~U+D7AF 사이의 한글 소리 마디 영역
		System.out.printf("%c\n",'\uD7fb');
		char ch7 = 65532;
		System.out.printf("%c\n", ch7);
		
		
		
//		----------------------------		
//		기본자료형(원시타입)
//		byte, short, double, long

//		문자형(클래스자료형) 
//		클래스자료형으로 만든 변수는 '참조변수'라고 하고 
//		참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		int i1 = 10;
		String name= "홍길동";
		String job = "프로그래머";
		System.out.println(i1);
		System.out.println(name);
		System.out.println(job);
		
		
//		-----------------------------
//		boolean 논리형. true, false만 저장
		boolean flag = (10<5);		//참참참
		if(flag) {
			System.out.println("\n참참참");
		} else {
			System.out.println("\n거짓거짓거짓");
		}
//		double v2 = 1e2;
//		float v3 =1e2f;
//		float var = 100.0f; 	
		System.out.println();
		
	}

}
