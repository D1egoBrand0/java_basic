package ch1000대타강사님;

class Person{
	void breath() {
		System.out.println("용사님 뭐하세요 숨셔");
	}
	void eat() {
		System.out.println("용사님 뭐하세요 밥머겅");
	}
	void say() {
		System.out.println("용사님 뭐하세요 말해");
	}
}

class Studet extends Person{	// 사람클래스를 상속받음
	void learn() {
		System.out.println("배움에는 끝이 없고 만년동안 응어리진 증오에도 끝이 없다. 이제 난 완전해졌다!");
	}
}

class Teacher extends Person{	// 사람클래스를 상속받음
	void teach() {
		System.out.println("자왈 유교무류라. 가르침은 있으되, 차별은 없음이라.");
	}
}






public class C101상속 {

	public static void main(String[] args) {
//		상속
//		기존클래스를 물려받아 사용한다.(기능이라던가, 형태라던가)
//		사용시 - 클래스명 + extends 부모클래스명
		
		Studet s1 = new Studet();	//학생 인스턴스 s1생성
		s1.breath();				//사람 클래스의 breath 메서드를 상속
		s1.learn();					
		s1.say();
		
		Teacher t1 = new Teacher();	//선생 인스턴스 t1생성
		t1.teach();					//사람 클래스의 eat 메서드를 상속
		t1.eat();
		t1.say();
		
		Person person = new Person();
		person.breath();
//		person.learn;  // 자식클래스의 매서드나 멤버변수는 사용하지 못함.
		
		
		
	}

}
