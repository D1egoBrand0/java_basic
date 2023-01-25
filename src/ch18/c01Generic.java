package ch18;

class 팥 extends 호빵재료{
	String meterial;
	팥(String meterial){this.meterial = meterial;}
	@Override
	public String toString() {
		return "팥 [meterial=" + meterial + "]";
	}
}
class 야채 extends 호빵재료{
	String meterial;
	야채(String meterial){this.meterial = meterial;}
	@Override
	public String toString() {
		return "야채 [meterial=" + meterial + "]";
	}
}
class 피자 extends 호빵재료{
	String meterial;
	피자(String meterial){this.meterial = meterial;}
	@Override
	public String toString() {
		return "피자 [meterial=" + meterial + "]";
	}
}

class 민초{
	String meterial;
	민초(String meterial){this.meterial = meterial;}
	@Override
	public String toString() {
		return "민초 [meterial=" + meterial + "]";
	}
}

// 하나의 맛만 제외해보기위해서 추상화클래스 만들기
abstract class 호빵재료{
	
}








//T= templates
//extends로 호빵재료와 관계된 것만 들어오게 바꾼다.
class 호빵<T extends 호빵재료>{
	private T meterial;
	호빵(T meterial){
		this.meterial = meterial;
	}
	void ShowInfo() {
		System.out.println(meterial.toString() +" 으로 만든 호빵!");
	}
}




public class c01Generic {

	public static void main(String[] args) {
//		호빵<팥> 단팥호빵 = new 호빵<팥>(new 팥("단팥"));
//		T가 팥이된다
//		동일한 팥이 들어있으면 아래처럼 삭제가 된다.
		호빵<팥> 단팥호빵 = new 호빵(new 팥("단팥"));
		단팥호빵.ShowInfo();
		호빵<야채> 만두소호빵 = new 호빵(new 야채("만두소"));
		만두소호빵.ShowInfo();
//		호빵<민초> 민초빵 = new 호빵(new 민초("맛있는"));
//		민초빵.ShowInfo();
		
		
	}

}
