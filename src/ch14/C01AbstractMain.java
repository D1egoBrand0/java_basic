package ch14;

class par1 {
	void method1() {
		System.out.println("Son1의 자율적으로 재정의된 메서드");
	}//일반 메서드
}
class son1 extends par1{
//	void method1() {
//		System.out.println("Son1의 자율적으로 재정의된 메서드");
//	}
}
//----------------추상클래스 상속관계---------------
abstract class par2{
	abstract void method2();  //추상메서드. 위와는 다르게 {}로 내용이 없고 그냥 선언만 있다.
}
class son2 extends par2{
	@Override
	void method2() {
		System.out.println("Son2의 강제 재정의된 메서드");
	}
}



public class C01AbstractMain {

	public static void main(String[] args) {
		par1 ob1 = new par1();
		son1 s1 = new son1();
		ob1 = s1;		// upcasting
		ob1.method1();	// 재정의된 son1메서드 호출가능
		
//		par2 ob2 = new par2();	// 추상클래스로 객체생성 불가능
		son2 s2 = new son2();	// 하위클래스에서 물려받은 추상메서드를 재정의한다면 객체생성 가능
		s2.method2();
		par2 ob3 = s2;	// upcasting
		ob3.method2();  // 접근가능해진다.
		
		
		
		
	}

}
