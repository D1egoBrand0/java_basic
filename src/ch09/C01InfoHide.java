package ch09;

//정보은닉
//클래스 내의 멤버변수(멤버함수)의 사용을 제한하는 문법

//접근한정자
//public	: 모든 클래스에서 접근가능
//default	: 동일 패키지에 소한 클래스에서만 접근가능
//private	: 현재 클래스 내에서만 접근가능
//protected	: 동일패키지에 속한 클래스 or 상속관계에서의 하위클래스에서만 접근가능

class C01Person {
//	속성
	private String name;	//이름
	private String id;		//주민번호
	private int age;		//나이
	float weight;	//몸무게
	double height;	//키
	private int salary;		//급여정보
	
//	생성자(모든인자를 받는 생성자)
	public C01Person(String name, String id, int age, float weight, double height, int salary) {
//		super();   //지금 부분에서는 있어도, 없어도 됨
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}

//	Setter 함수
//	private여도 정보가 바뀔수 있으므로 필요한 경우 사용한다.
	public void setSalary(int salary) {
		this.salary = salary;
	}
//	지금은 단순하게 public으로 해놓는 것일 뿐이다.
	
//	Getter 함수
//	내부에서 확인하고 싶을때
	int getSalary() {
//		System.out.println(this.salary);
		return this.salary;
	}
	
//	나머지 private 멤버를 getter and setter함수로 완성해보기
	public void setName(String name) {
		this.name = name;
	}
//	public void setId(String id) {
//		this.id = id;
//	}   // 이유 : 죽어서든 살아서든 주민번호는 안바뀌니까
	public void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return this.name;
	}
	String getId() {
		return this.id;
	}
	int getAge() {
		return this.age;
	}
	
}

public class C01InfoHide {

	public static void main(String[] args) {
		C01Person obj = new C01Person("홍길동","888888-1111111", 40, 80.5f, 177.5, 3800);
		System.out.println(obj);
//		obj.name = "남길동";
//		obj.id = "777777-3333333";
//		private로 id를 변경. private로 지정된 멤버는 접근불가
//		System.out.println(obj.name);
		System.out.println(obj.weight);
		obj.setSalary(1000);
		System.out.println("급여확인 : "+obj.getSalary());
		
		
		obj.setAge(41);
		System.out.println("이름확인 : "+obj.getName());
//		Id는 getter만 사용할 것
		System.out.println("주민번호확인 : "+obj.getId());
		System.out.println("나이확인 : "+obj.getAge());
	
		
	}

}
