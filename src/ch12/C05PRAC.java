package ch12;
//
class ShopService{
	//	싱글톤 구현
	String shopName;
	String manager;	
	private static ShopService instance;
	private ShopService() {};
	public static ShopService getInstance() {
		if(instance==null)
			instance=new ShopService();	
		return instance;
	}
}


// 내가 따로 써봄. 왜 void를 안붙여도 될까?
//class ShopService{
//	String shopName;
//	String manager;
//	
//	private static ShopService instance;
//	private void ShopService() {};
//	public static ShopService getInstance() {
//		if (instance == null) {
//			instance = new ShopService();
//		}
//		return instance;
//	}
//}

public class C05PRAC {

	public static void main(String[] args) {
		//---------------------------------------
		//Practice
		//---------------------------------------
		//shopService 객체를 싱글톤으로 만들어 보세요 
		//ShopServiceExample 클래스에서 shopService 의 getInstance() 메소드로 싱글톤을 얻을 수 있도록
		//ShopService 클래스를 작성해보세요






		ShopService obj1 = ShopService.getInstance();
		ShopService obj2 = ShopService.getInstance();
		obj1.shopName = "GS감삼점";
		obj2.manager ="홍길동";

		if (obj1.manager == obj2.manager) {
			System.out.println("같은 ShopService 객체입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}

		

	}

}
