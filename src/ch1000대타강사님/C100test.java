package ch1000대타강사님;

//class test{
//	private String name;
//	private int age;
//	private short grade;
//	private double avg;
//	private int[] numArr;
//	
//	
//	/*setter: 클래스 외부에서 값을 받아서 멤버변수에 저장
//	return type은 void.
//	매개변수는 수정할 멤버변수와 같은 type 이어야함.
//	이름앞에 set을 붙이고 뒤에는 수정할 멤버변수의 이름.
//	getter : 클래스 외부에 멤버변수의 값을 전달(반환)
//	return type은 참조할 멤버변수의 자료형과 일치. 매개변수는 필요없음.
//	이름앞에 get을 붙이고 뒤에는 리턴할 멤버변수의 이름.*/
//	
//	
//	
//	public test(String name, int age, short grade, double avg, int[] numArr) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//		this.avg = avg;
//		this.numArr = numArr;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public short getGrade() {
//		return grade;
//	}
//
//	public void setGrade(short grade) {
//		this.grade = grade;
//	}
//
//	public double getAvg() {
//		return avg;
//	}
//
//	public void setAvg(double avg) {
//		this.avg = avg;
//	}
//
//	public int[] getNumArr() {
//		return numArr;
//	}
//
//	public void setNumArr(int[] numArr) {
//		this.numArr = numArr;
//	}
//	
//
//	
//}

class Student{
	String name;
	private int ban, no, kor, eng, math;
	
//	 int Total = (int)(kor + eng + math);
	public int getTotal() {
		return kor + eng + math;
	};
//	private double Average = (double)Total/3;
	public double getAverage() {
		return (double)this.getTotal()/3;
	}
	
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
//	public double getAverage() {
//		return Average;
//	}
//	public void setAverage(double average) {
//		Average = average;
//	}
//	public void setTotal(int total) {
//		this.Total = total;
//	}
//	public int getTotal() {
//		return Total;
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}



public class C100test {

	public static void main(String[] args) {
		Student stu = new Student("김", 1, 1, 100, 95, 66);
//		stu.name = "김";
//		stu.ban =1;
//		stu.no = 1;
//		stu.eng = 100;
//		stu.kor = 100;
//		stu.math = 50;
		System.out.println(stu.name);
//		stu.setTotal(500);
		System.out.println(stu.getTotal());
		System.out.println(stu.getAverage());
		
		
	}

}
