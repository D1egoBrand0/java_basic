package ch03;

public class C01형변환 {

	public static void main(String[] args) {
//		(자료)형변환
//		값이 대입되는 과정에서(or 연산되는 과정) 특정자료형이 다른 자료형으로 변환되거나(자동형변환)
//		프로그래머에 의해 강제로 변환되는 문법
//		대입 : '='
		
		
//		형변환종류
//		자동형변환(암시적 형변환) : 컴파일러에 의해 자동으로 변환
//		강제형변환(명시적 형변환) : 프로그래머에 의해 강제로 변환
		
		
//		자동형변환
//		데이터 손실이 없는 경우. (데이터 손실을 최소화하는 방향으로 형변환 적용) 
//		ex) 범위가 큰 공간에 작은 범위안의 값이 대입되는 경우
//		byte < short < int < long < float < double
		
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의 유니코드: " + intValue );
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);	
		
		
	}

}