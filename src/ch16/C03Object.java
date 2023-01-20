package ch16;

class Employee{
	String id;
	String name;
	int salary;
	Employee(String id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}
	//equals를 재정의하여 id와 salary가 같으면 true 다르면 false를 반환하도록 하세요
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {
			Employee down = (Employee) obj;
			// x,y의 접근이 가능해짐
			return this.id==down.id && this.name == down.name && this.salary == salary;
		} 
		return false;
	}
}


public class C03Object {

	public static void main(String[] args) {
		Employee ob1 = new Employee("1010", "김김김", 5000);
		Employee ob2 = new Employee("2020", "님님님", 6000);
		Employee ob3 = new Employee("1010", "김김김", 5000);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
		
		
		
	}

}
