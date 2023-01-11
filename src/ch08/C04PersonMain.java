package ch08;


//	클래스의 사용법
class C04Person {
//	속성(필드, 멤버변수) - 사람이라는 클래스지정
	String name;
	int age;
	float height;
	double weight;
	
//	기능
//	반환자료형 - void
	void talk() {
		System.out.println(name + "님이 말합니다.");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다.");	
	}
	void info() {
		System.out.printf("%s\n%d\n%.1f\n%.1f\n",name,age,height,weight);			
	}
}
public class C04PersonMain {

	public static void main(String[] args) {
		C04Person hong = new C04Person();
//		객체의 기본 사이즈와 공간생성해주기
		hong.name ="김길동";
//		name이라는 멤버에 접근
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		
		hong.talk();
		hong.walk();
		hong.info();
		
	}

}
