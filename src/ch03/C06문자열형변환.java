package ch03;

public class C06문자열형변환 {

	public static void main(String[] args) {
//		문자열 + 문자열 연산
		System.out.println("문자열1" + "문자열2");			//문자열 + 문자열
		System.out.println("문자열1" +',' +"문자열2");		//문자열 + 문자 + 문자열
		System.out.println("문자열1" + 2);				//문자열 + 숫자 -> 숫자를 문자열로 해석! 단순연결
		System.out.println("문자열" + ','+ '!');
		System.out.println(','+ '!');					//문자 + 문자 -> +를하면 int형으로 바뀌면서 숫자로 나옴

		
//		-----------------------------------------------
		System.out.printf("\n********문자열을 숫자형으로********\n");
//		문자열 -> 정수형으로 변환
//		int n12 = "10";
		System.out.println("10"+"20");					//문자열연결
		
//		wrapper클래스(~~~.parse~~~)
		int n1 = Integer.parseInt("10");				//웹개발코드시 폼으로부터 전달받은 값은 다 문자열임
		int n2 = Integer.parseInt("20");
		System.out.println(n1+n2);
		
//		문자열 -> 실수형으로 변환
		double n3 = Double.parseDouble("10.5");
		double n4 = Double.parseDouble("20.4");
		System.out.println(n3+n4);
		
		short n5 = Short.parseShort("5");
		short n6 = Short.parseShort("5");
		
		System.out.println(n5+n6);
		
		
		
		
//		-----------------------------------------------
		System.out.printf("\n********숫자형을 문자열로********\n");

		
		int value1 = 10;
		double value2 = 3.14;
		
		System.out.println(value1 + value2);		//연산
	
		String str1 = String.valueOf(value1);
		String str2 = String.valueOf(value2);
		
		System.out.println(str1 + str2);			//문자열 붙이기
		System.out.println(value1+""+value2);	    //문자열 붙이기
		
		byte value11 = Byte.parseByte("10");
		int value21 = Integer.parseInt("100");
//		float value3 = Float.parseFloat("20.5");
//		double value4 = Double.parseDouble("3.14159");
		System.out.printf("%d + %d",value11,value21);
		

	}

}


