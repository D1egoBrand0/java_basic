package ch08;


//	클래스의 사용법
class C14Person {
//	속성(필드, 멤버변수) - 사람이라는 클래스지정
	String name;
	int age;
	float height;
	double weight;
	
////	오버로딩을 통해 인자를 집어넣을 수 있게 만들기
	C14Person(String name, int age, float height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
////	오버로딩을 우클릭 source, generate constructor using field사용하여 만들기
//public C14Person(String name, int age, float height, double weight) {
//	super();
//	this.name = name;
//	this.age = age;
//	this.height = height;
//	this.weight = weight;
//}
	C14Person(){}

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
	
	
//	toString 오버라이딩 추가
	@Override
	public String toString() {
		return "이 사람의 이름=" + name +
				", 나이=" + age + 
				", 키=" + height + 
				", 몸무게=" + weight + "이다.";
	}
	
}
public class C14PersonMain {

	public static void main(String[] args) {
		C14Person hong = new C14Person("홍길동",55,177.5f,72.1);		// 생성자 함수를 지정
		System.out.println(hong.toString());		//모든 멤버변수를 확인할수 있도록 toString() 재정의
		
		C14Person kim = new C14Person();
	}

}
