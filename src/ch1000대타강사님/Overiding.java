package ch1000대타강사님;

class Student2{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("먹기");
	}
	void say() {
		System.out.println("안녕하세요. 저는 케인인이라고 합니다. 지금부터는");
	}
	
	//Object의 toString. 오브젝트는 최상위 클래스이다. 여기서 오버라이딩은 기본적으로 가능한 상태이다.
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}

class Leader extends Student2{
	void lead() {
		
	}
//	오버라이딩은 자손 클래스에서 부모클래스로부터 물려받은 메서드를 다시 작성하는 것
	@Override
	void say() {	
		System.out.println("선생님께 인사");//오버라이딩  
		super.say();  	//부모클래스의 메서드 실행.
	}
	@Override
	void eat() {
		// TODO Auto-generated method stub
		System.out.print("와구와구 냠냠 쩝쩝 ");
		super.eat();
	}  

}


public class Overiding {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat();  // 상속받은 메서드 사용
		leader.say();  // 오버라이딩한 메서드 사용
	}
}
