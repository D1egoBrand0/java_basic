package ch08;

class C11Simple{
//	속성
	int x;
	double y;
	char z;
	boolean flag;
	String name;
	
//	생성자
	C11Simple(){
		System.out.println("Default(기본)생성자 호출!");		
	}

	
//	기능
//	저장된 값을 확인할때 toString이란 것을 사용한다.
//	우클릭 후 source 클릭 generate toString한다.
	@Override
	public String toString() {
		return "C11Simple [x=" + x + ", y=" + y + ", z=" + z + ", flag=" + flag + ", name=" + name + "]";
	}
	
	
}



public class C11ConstructorMain {

	public static void main(String[] args) {
//		생성자 메서드
//		객체에 필요한 공간형성 + 초기값 설정
//		클래스명과 동일한 이름을 지정
//		매개변수를 가질수도 있다
//		반환자료형은 지정 X
//		객체 생성시에 호출되는 함수(1회만 호출)
//		생성자를 명시하지 않은경우(코드삽입X) 컴파일러에 의해 기본생성자가 주입된다(디폴트 생성자)
		
		C11Simple obj = new C11Simple();
		
//		System.out.println("X : "+ obj.x + "  Y : " + obj.y);
		System.out.println(obj.toString());
//		여기서 표기된 값들이 Default(기본)생성자이다. 객체생성과 관련된 기능
	}

}
