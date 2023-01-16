package ch09;

class Controller{
	Member member;
	
	void SetMember(Member member) {
		this.member = member;
	}
	Member getMember() {
		return member;
	}
}


class Member{
	String name;
	int age;
	String addr;
//	모든 인자가 받는 생성자(Source 기능 사용해서 코드삽입)
	public Member(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
//	toString 재정의(Source 기능 사용해서 코드삽입)
	@Override
	public String toString() {
		return "Member의 이름 = " + name 
				+ ", 나이 = " + age 
				+ ", 주소 = " + addr + "]";
	}
	
}



public class C08ClassMethod {

	public static void main(String[] args) {
		Controller con = new Controller();
//		con.SetMember(new Member("김멤버", 99, "염라국 발설지옥"));
//		Member hong = new Member("홍길동",456,"율도국 국왕 전직 얼굴벗기는 흉악연쇄살인마");
//		System.out.println("hong : "+ hong);  //오버라이딩 toString 주석처리시 위치정보 확인용
//		con.SetMember(hong);
		con.SetMember(new Member("홍길동",456,"율도국 국왕 전직 얼굴벗기는 흉악연쇄살인마"));
		
		System.out.println(con.getMember());
		
		
		
		
	}

}
