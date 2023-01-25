package ch17;

public class C04Thorws {
	public static void Ex1(){
		try {
			throw new NullPointerException("Ex1의 예외처리!!!!!!");
		} catch (Exception e) {
			System.out.println("Ex1 예외처리");
		}
		System.out.println("Ex1 실행코드");
	}
	public static void Ex2() throws Exception {
		throw new NullPointerException("Ex1의 예외처리!!!!!!");
	}
	
// throw 클래스 내부에서 try,catch 처리
// throws 호출했던 위치로 오류처리 넘김

	
	public static void main(String[] args) {
		Ex1();
		try {
			Ex2();
		} catch (Exception e) {
			System.out.println("Ex2 예외처리");
		}
		
		
	}

}
