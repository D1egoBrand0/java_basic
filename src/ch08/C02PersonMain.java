package ch08;


//	클래스의 사용법
class C02Person {
//		속성(필드, 멤버변수) - 사람이라는 클래스지정
	String name;
	int age;
	float height;
	double weight;
}
public class C02PersonMain {

	public static void main(String[] args) {
		C02Person hong = new C02Person();
//		객체의 기본 사이즈와 공간생성해주기
		hong.name ="김길동";
//		name이라는 멤버에 접근
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s\n%d\n%.1f\n%.1f\n",hong.name, hong.age,hong.height,hong.weight);

		
	}

}
