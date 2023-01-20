package ch17;

public class C01Exeption {

	public static void main(String[] args) {
//		NullPointerException 확인해보기
		try {
			String str = null;
			System.out.println(str.toString());
		}
//		예외처리로 실행1,2를 보여주자
		catch (NullPointerException e) {
			System.out.println("예외처리완료"+"\n");
			System.out.println("예외 원인 : "+e.getCause()+"\n");				//예외원인
			System.out.println("예외객체 설명 : "+e.toString()+"\n");			//예외객체 설명
			System.out.println("예외객체의 정보 : "+e.getStackTrace()+"\n");	//예외객체의 해시코드등 정보
			e.printStackTrace();
		}
		System.out.println("\n"+"실행1");
		System.out.println("실행2");
		
		
	}

}
