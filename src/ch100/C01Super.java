package ch100;
//상속과 멤버변수
class Parent{
	int x = 10;
}

class Child extends Parent{
	int x= 50;
	void method() {
		int x =30;
		System.out.println("x = "+x);  // 지정된것이 없어서 가장 가까운 곳에서 선언이 된 지역변수를 불러옴
		System.out.println("this.x = "+this.x);  // this.x는 2개가 있지만 더 가까운 50으로 간다. 객체기준
//		super : 상속을 하면 자식의 멤버(변수, 메서드)와 이름이 겹치게 될 때가 있는데 이를 구분하기 위해 
//		super.변수 super.메서드()를 사용하면 자식의 멤버가 호출되지 않고 상속받은 부모의 멤버를 호출할수 있게 됩니다.
		System.out.println("super.x = "+super.x);  // super.x 부모클래스 기준
	}
}
class YoungLing extends Child{
	void another() {
		int x = 40;
		System.out.println(x);
		System.out.println(super.x);
//		System.out.println(super.super.x); 문법에러라고 함.
	}
}

public class C01Super {

	public static void main(String[] args) {
		YoungLing y = new YoungLing();
		y.another();
		y.method();
		/*
		 x=10
		 this.x = 10
		 super.x = 10
		 */
//		c.method().ano;
	}

}
