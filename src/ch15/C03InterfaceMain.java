package ch15;

interface C03Remocon{
	//필드(final static)
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	// 기능 (추상메서드)
	void turnOn();
	void turnOff();
	void seC03Tvolumn(int vol);
}


//추가부분--------
interface SearchURL{
	void Search(String URL);
}
class C03SmartTv extends C03Tv implements SearchURL{

	@Override
	public void Search(String URL) {
		System.out.println(URL+"로 서칭을 시작합니다.");
	}
}
//추가부분끝-------

class C03Tv implements C03Remocon{
	int vol;
	@Override
	public void turnOn() {
		System.out.println("C03Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("C03Tv를 끕니다");
	}

	@Override
	public void seC03Tvolumn(int vol) {
		if(vol>=MAX_VOLUMN) {
			vol= MAX_VOLUMN;
		} else if(vol <= MIN_VOLUMN) {
			vol = MIN_VOLUMN;
		} else {
			this.vol = vol;
		}
	}
	
}


class C03Radio implements C03Remocon{
	int vol;
	@Override
	public void turnOn() {
		System.out.println("raido를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("C03Radio를 끕니다");
	}

	@Override
	public void seC03Tvolumn(int vol) {
		if(vol>=MAX_VOLUMN) {
			vol= MAX_VOLUMN;
		} else if(vol <= MIN_VOLUMN) {
			vol = MIN_VOLUMN;
		} else {
			this.vol = vol;
		}
	}
	
}

public class C03InterfaceMain {
	
	public static void TurnOn(C03Remocon controller) {
		controller.turnOn();
	}
	
	public static void TurnOff(C03Remocon controller) {
		controller.turnOff();
	}
	
	public static void SeC03Tvol(C03Remocon controller,int num) {
		controller.seC03Tvolumn(num);
	}
	
	public static void Search(SearchURL product, String url) {
		product.Search(url);
	}
	
	public static void main(String[] args) {
		C03Tv C03Tv = new C03Tv();
		C03Radio C03Radio = new C03Radio();
		C03SmartTv tv = new C03SmartTv();   //추가부분
//		C03Tv.turnOn();
		TurnOn(C03Tv);
		TurnOff(C03Tv);
		TurnOn(C03Radio);
		TurnOff(C03Radio);
		SeC03Tvol(C03Tv, 4);
		SeC03Tvol(C03Radio, 6);
		System.out.println(C03Radio.vol);
		System.out.println(C03Tv.vol);
		
		Search(tv, "www.naver.com");
		
		
		
	}
}
