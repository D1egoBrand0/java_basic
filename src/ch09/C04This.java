package ch09;

class C04Simple {
	int x;
	int y;
	
//	1. this 사용하는 이유(매개변수와 멤버변수의 구별)
	void setX(int x) {
		this.x = x;
	}
	
//	2. this사용이유 (동일클래스의 다른 생성자 호출에 사용)
	C04Simple(){
//		x=10;y=10;
		this(10,10);
		System.out.println("디폴트 생성자 호출");
	}
	C04Simple(int x){
//		this.x = x; y=10;
		this(x,10);
		System.out.println("int x 생성자 호출");
	}
	C04Simple(int x, int y){
		this.x=x;this.y=y;
		System.out.println("int x, int y 생성자 호출");
	}
	
}



public class C04This {

	public static void main(String[] args) {
		C04Simple simple = new C04Simple(10);
		System.out.println(simple.x + " " + simple.y);
	}

}
