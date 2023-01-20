package ch09;

//class





public class C05StringClass {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		System.out.println("문자열 비교해보기");
//		동일한 문자들을 적었지만 다르다고 나온다.
//		이유 : heap영역을 새로 만들면서 새로 저장하기 때문
		System.out.println("str1 = str2 : " + (str1 == str2));
		System.out.println("str1 = str3 : " + (str1 == str3));
		System.out.println("str1 = str4 : " + (str1 == str4));
		System.out.println("str3 = str4 : " + (str3 == str4));
		System.out.println("----equals사용하기 ------------");
		System.out.println("str1 = str2 : " + (str1.equals(str2)));
		System.out.println("str1 = str3 : " + (str1.equals(str3)));
		System.out.println("str1 = str4 : " + (str1.equals(str4)));
		System.out.println("str3 = str4 : " + (str3.equals(str4)));
		str1.equals(str4);
		
	}

}
