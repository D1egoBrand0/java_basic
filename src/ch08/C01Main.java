package ch08;

public class C01Main {
//접근한정자 public
	public static void main(String[] args) {
		C01Person hong = new C01Person();
//		객체의 기본 사이즈와 공간생성해주기
		hong.name ="홍길동";
//		name이라는 멤버에 접근
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
		System.out.printf("%s\n%d\n%.1f\n%.1f\n",hong.name, hong.age,hong.height,hong.weight);
	}

}
