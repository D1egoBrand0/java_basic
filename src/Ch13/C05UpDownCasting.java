package Ch13;

class A{
	int a = 1;
}
class B extends A{
	int b = 2;
}
class C extends A{
	int c = 3;
}
class D extends B{
	int d = 4; 
}
class E extends B{
	int e = 5;
}
class F extends C{
	int f = 6;
}
class G extends E{
	int g = 7;
}

class UpDownTest {
	void ShowMember(A obj) {
//		System.out.println(obj.a);
//		다운캐스팅
//		B down = (B)obj;
//		System.out.println(down.b);
		
//		instanceof가 여러가지 다운캐스팅 구분시켜줌
		if (obj instanceof D) {
			D down = (D)obj;
			System.out.printf("D객체 : %s %s %s\n",down.a,down.b,down.d);
		} else if(obj instanceof C) {
			C down = (C)obj;
			System.out.printf("C객체 : %s %s\n",down.a,down.c);
		} else if (obj instanceof B) {
			B down = (B)obj;
			System.out.printf("B객체 : %s %s\n",down.a,down.b);
		}		
	}
}


public class C05UpDownCasting {

	public static void main(String[] args) {
		
		UpDownTest test = new UpDownTest();
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
//		E ob4 = new E();
		
		test.ShowMember(ob1); // A obj = ob1; 업캐스팅
		test.ShowMember(ob2); // A obj = ob2; 업캐스팅
		test.ShowMember(ob3); // A obj = ob3; 업캐스팅
		test.ShowMember(new D()); // A obj = new D(); 업캐스팅
	}

}
