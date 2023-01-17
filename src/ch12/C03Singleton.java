package ch12;
//디자인 패턴
//
//상품제작시 사전에 발견되었던 문제들을 해결하고 정형화 시켜놓은 작업패턴
//디자인 패턴은 제작자들간의 의사소통 수단의 일종이다
//ex) 의류를 디자인할때 일반적으로 알려진 패턴대로 재단한다(소재는 미싱은)
//ex) 그렇ㄹ게 하지 않을때 품질 이상발생 가능성 높다
//
//프로그래밍 언어의 디자인 패턴
//프로그램 제작시 사전에 발견되었던 문제들을 해결하고 정형화시켜놓은 작업패턴
// http://www.ktword.co.kr/test/view/view.php?nav=2&no=6552&sh=%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4
class C03Company{
	int x,y;	// 개별공간
	private static C03Company instance;
	//생성자
	private C03Company() {
	}
	//멤버함수  // 만들어진 객체의 주소만 사용
	public static C03Company getInstance() {
		if(instance == null) {
			instance = new C03Company();
		}
		return instance;
	}
}


public class C03Singleton {

	public static void main(String[] args) {
//		싱글톤이 중요한 이유 : 객체를 고객이 하나만 사용할 수 있도록 초간소화시키는 것이 필요하다. 많아질수록 서버다운되기 때문.
//		스태틱을 이용한 싱글톤
//		싱글톤 단일객체를 공유
//		스태틱 단일 멤버공유
//		C03Company myCompany0 = new C03Company();  // 불가능하다 왜? private로 막아놓았다.
		C03Company myCompany1 = C03Company.getInstance();
		C03Company myCompany2 = C03Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
		myCompany1.x=10;
		myCompany2.y=20;
		C03Company myCompany3 = C03Company.getInstance();
		System.out.println(myCompany3.x + " "+ myCompany3.y);
		
		
		
	}

}
