package ch08;

class C09Simple{
	String name;
	int sum(int x, int y) {
		System.out.println("sum(int,int)호출!");
		return x+y;
	}
	int sum(double x, double y) {
		System.out.println("sum(double,double)호출!");
		return (int)(x+y);
	}
	int sum(int x, int y,int z) {
		System.out.println("sum(int,int,int)호출!");
		return x+y+z;
	}
	int sum(String str1,int x, int y) {
		System.out.println("sum(Stirng,int,int)호출!");
		name = str1;
		return x+y;
	}
	
}
public class C09MethodOverLoading {
//오버로딩 매개변수를 다양하게 받을수 있도록 함 
	public static void main(String[] args) {
		
		C09Simple obj = new C09Simple();
		int r1 = obj.sum(5, 6);
		int r2 = obj.sum(5.5, 6.9);
		int r3 = obj.sum(5, 6, 7);
		int r4 = obj.sum("나무아미타불 옴마니반메훔 "
				+ "주 예수 가라사대 알라후 아크바르",6,7);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4+"    "+obj.name);
		
		
		
	}

}
