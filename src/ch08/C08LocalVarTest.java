package ch08;

//지역변수 : {}내에서 선언된 변수, {}벗어나면 소멸, 절차지향문법

class LocalVar{
//	속성
	int num = 10;
	void func1() {
		System.out.println("num의 값 - "+num); // 멤버변수 num
//		int num = 100;
//		System.out.println("num의 값 - "+num); // func1() 안에서만 사용되는 지역변수 num
		if (true) {
			int num = 200;
			System.out.println("num의 값 - "+num); 
//			 func1() 안의 if문 안에서만 사용되는 지역변수 num
		}
		System.out.println(num);
	}
	void func2() {
		
	}
	
}


public class C08LocalVarTest {

	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
		obj.func1();
		obj.func2();
		
		
	}

}
