package ch18;

// T와 다른 것을 같이 넣을수도있다.
//class Simple<T, Q>
class Simple<T>{
	T x;
	T y;
	T z;
	Simple(T x, T y){
		this.x = x; this.y = y;
	}
	Simple(T x, T y,T z){
		this.x = x; this.y = y; this.z = z;
	}
	void ShowMember() {
		System.out.println("X = "+x+",\nY = " + y + ",\nZ = "+z);
	}
	
}
class Person
{
	String name;
	String addr;
	Person(String name, String addr){this.name = name;this.addr=addr;}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + "]";
	}
	
	
}

class Fighter{
	String name;
	String country;
	Fighter(String name, String country){this.name = name;this.country = country;}
	@Override
	public String toString() {
		return "Fighter [name=" + name + ", country=" + country + "]";
	}
	
}



public class C02Generic {
	public static void main(String[] args) {
		Simple<Integer> ob1 = new Simple<Integer>(10,20);
		ob1.ShowMember();
		System.out.println();
		
		Simple<Person> ob2 = new Simple<Person>(new Person("홍길동","대구"),new Person("서길동","남해"));
		ob2.ShowMember();
		Simple<Fighter> kof = new Simple<Fighter>(new Fighter("배니마루","약발이 강하구나!"),new Fighter("크리스","아이고난1 아이고난2!"),new Fighter("랄프","띠비야 맞을라구 그냥!"));
		kof.ShowMember();
	}

}
