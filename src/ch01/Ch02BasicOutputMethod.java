package ch01;

public class Ch02BasicOutputMethod {

	public static void main(String[] args) {
		
//		System	: Os관련 자원들을 저장하는 단위
//		.		: --안에
//		out		: 표준출력장치(모니터)
		
//		System.out.print();
//		기본 출력함수
//		Escape문자
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\t");
		System.out.print("HELLO WORLD");
		System.out.println();
		
//			*
//		   ***
//		  *****
//		 *******
		System.out.println("   *\n");
		System.out.println("  ***\n");
		System.out.println(" *****\n");
		System.out.println("*******\n");
		
//		format : 형식, 서식
//		%d : 10진 정수 서식문자
//		%f : 실수 서식문자
//		%c : 한문자 서식문자. 단일문자는 ''
//		%s : 문자열 서식문자. 일반 문자열은 ""
		System.out.printf("%d\t\t %d\t\t %d\n", 10,20,30);
		System.out.printf("%f\t %f\t %f\n", 10.13,20.589,30.5464);
		System.out.printf("%.1f\t\t %.2f\t\t %.3f\n", 10.1234,20.123456,30.123456);
		System.out.printf("%c\t\t %c\t\t %c\n", 'a','b','c');
		System.out.printf("%s\t\t %s\t %s\n", "Hello","My name is ","RVD");
		
		System.out.print("\nWhole new world");
		System.out.println();
		System.out.printf("%s\n\n","금");
		
		System.out.printf("%s\t %s\t %s\t %s\n","NO","이름", "나이", "주소");
		System.out.printf("%d\t %s\t %d\t %s\n",1,"홍길동", 50, "대구");
		System.out.printf("%d\t %s\t %d\t %s\n",2,"서길동", 40, "서울");
		System.out.printf("%d\t %s\t %d\t %s\n",3,"동길동", 30, "울산");
		System.out.println();
		
		System.out.printf("%-10s %-10s %-10s %s\n","NO","이름", "나이", "주소");
		System.out.printf("%-10d %-10s %-10d %s\n",1,"홍길동", 50, "대구");
		System.out.printf("%-10d %-10s %-10d %s\n",2,"서길동", 40, "서울");
		System.out.printf("%-10d %-10s %-10d %s\n",3,"동길동", 30, "울산");
		
		System.out.println("\nHELLO WORLD");
		System.out.print("HELLO WORLD");
		System.out.println("HELLO WORLD");
	}
}
