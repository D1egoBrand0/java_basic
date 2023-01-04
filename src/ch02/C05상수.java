package ch02;

public class C05상수 {

	public static void main(String[] args) {
//		상수 : 항상 같은 수
//		리터럴상수: 이름 부여없음	상수pool 저장
//		심볼릭상수: 이름 부여됨 	stack에 저장	final 예약어 사용

//		리터럴접미사
//		l,L: long접미사
//		f,F: float접미사
		
		int n1 =100;			//변수
		final int n2 = 111;		//상수
		
		n1+=10;
//		n2+=10;
		
		System.out.println(n1);
		System.out.println(n2);
		
		
	}

}
