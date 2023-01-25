package ch17;

public class C03Exception {

	public static void main(String[] args) {
//		캐치를 여러개를 줄수도 있다.
		try {
//			int arr[] = new int[4];
//			arr[5]=10;
//			String str = null;
//			System.out.println(str.hashCode());
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("예외처리완료"+"\n");
			System.out.println("예외 원인 : "+e.getCause()+"\n");				//예외원인
			System.out.println("예외객체 설명 : "+e.toString()+"\n");			//예외객체 설명
			System.out.println("예외객체의 정보 : "+e.getStackTrace()+"\n");	//예외객체의 해시코드등 정보
			e.printStackTrace();
		} 
		
//		추가부분
		finally {
//			 예외가 발생하든 하지않든 간에 무조건 실행되는 코드
			System.out.println("실행1");
			System.out.println("실행2");
		}
		
		
	}

}
