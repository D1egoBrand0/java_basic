package ch02;

public class C03자료형 {

	public static void main(String[] args) {
//		LeftValue = RightValue - 대입연산자(=)를 기준으로 왼쪽은 lv(공간) 오른쪽은 rv(값)
//		lv(공간) = rv(값)
		
		int num1;		// 4바이트 정수 공간생성 + num1 이름부여(변수 선언 or 변수 정의)
		num1 = 10;		// 10이란값을 상수 Pool에 저장(int)하고 num1공간에 복사(대입)
		int num2 =4;	// 4값을 상수Pool에 저장(int)하고 새로 만들어지는 4바이트 정수공간 num2에 초기화한다.
		int num3 = num1+num2;	//num1의 값 + num2의 값을 4바이트 정수공간 num3에 초기화
		System.out.println(num3);  // num3의 공간에 저장된 값을 불러와 print한다.
		
	}

}
