package ch16;

class C02Simple{
	int x;
	int y;
	C02Simple(int x, int y){
		this.x = x;
		this.y = y;
	}
	@Override
	public boolean equals(Object obj) {  //Object obj = ob2;// 업캐스팅이다.
		if (obj instanceof C02Simple) {
			C02Simple down = (C02Simple) obj;
			// x,y의 접근이 가능해짐
			return this.x==down.x && this.y == down.y;
		} 
		
		return false;
	}
}

class A{}
class B{}
class C{}


public class C02Object {

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10,20);
		C02Simple ob2 = new C02Simple(30,40);
		C02Simple ob3 = new C02Simple(10,20);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
//		이유 : 힙영역에서 새로 생성된 객체들이라 다 다르다
//		equals를 
		
		
		
	}

}
