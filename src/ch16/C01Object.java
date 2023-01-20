package ch16;

class BA{
	int x;
	int y;
	void b() {
		System.out.println("음");
	}
	@Override
	public String toString() {
		return "BA [x=" + x + ", y=" + y + "]";
	}
}
public class C01Object {

	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1.equals(ob1));
		System.out.println(ob1.getClass());
		System.out.println(ob1.toString());
		System.out.println(ob1);
		System.out.printf("%x\n",ob1.hashCode());
		System.out.println();
		
		BA ob2 = new BA();
		System.out.println(ob2.equals(ob2));
		System.out.println(ob2.getClass());
		System.out.println(ob2.toString());
		System.out.println(ob2);
		System.out.printf("%x\n",ob2.hashCode());
		System.out.println();
		ob2.b();
		
		Object ob3 = new BA(); //업캐스팅
		System.out.println(ob2.equals(ob2));
		System.out.println(ob2.getClass());
		System.out.println(ob2.toString());
		System.out.println(ob2);
		System.out.printf("%x\n",ob2.hashCode());
		System.out.println();
	}

}
