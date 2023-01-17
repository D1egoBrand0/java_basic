package ch12;

class Co2Simple{
	int n1;			//객체만들어야 공간이 생긴다.
	static int n2;	//static변수
	void Func1() {
		n1=10;
		n2=20;
	}
	static void Func2(){//객체가 없어도 만들어진 static void
//		n1 = 10;		//문제발생... 왜??  객체가없는데 
		n2 = 30;
		int num=10;
	}
}


public class C02Static {

	public static void main(String[] args) {
		
		
	}

}
