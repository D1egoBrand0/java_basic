package ch11;

class C01Person{
	String name;
	String age;
	String addr;
	@Override
	public String toString() {
		return "Person의 이름은 " + name 
				+ ", 나이는 " + age 
				+ "세이고, 주소는 " + addr + "이다.";
	}
	
}


public class C01ObjectArray {

	public static void main(String[] args) {
		C01Person [] employee = new C01Person[3];
//		생성자를 아직 안만들어서 오류상태이다. 즉 배열 안에 객체가 없는 상태이다.
		employee[0] = new C01Person();
		employee[1] = new C01Person();
//		이렇게 넣어주면 만들어진다.
		employee[0].name = "홍길동";
		employee[0].age = "44";
		employee[0].addr = "구구구국";
		employee[1].name = "케인인";
		employee[1].age = "99999";
		employee[1].addr = "은평구";
		
		System.out.println(employee[0].toString());
		System.out.println(employee[1].toString());
		
		
		
	}

}
