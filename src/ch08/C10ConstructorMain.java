package ch08;

class C10Simple{
//	속성
	int x;
	int y;
//	생성자
	C10Simple(){
		System.out.println("Default(기본)생성자 호출!");
//		int -> 0
//		double -> 0.0
//		char -> ''
//		boolean -> false
//		Object -> null
		x=10;
		y=15;
		
	}
	
//	기능
	
	
	
}



public class C10ConstructorMain {

	public static void main(String[] args) {
//		생성자 메서드
//		객체에 필요한 공간형성 + 초기값 설정
//		클래스명과 동일한 이름을 지정
//		매개변수를 가질수도 있다
//		반환자료형은 지정 X
//		객체 생성시에 호출되는 함수(1회만 호출)
//		생성자를 명시하지 않은경우(코드삽입X) 컴파일러에 의해 기본생성자가 주입된다(디폴트 생성자)
		
		C10Simple obj = new C10Simple();
		
		System.out.println("X : "+ obj.x + "  Y : " + obj.y);
		
		
	}

}
