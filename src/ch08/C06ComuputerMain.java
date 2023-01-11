package ch08;

class C06Computer {
	String SerialNO;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	
	void PowerON(){
		System.out.println("SerialNO "+SerialNO+"의 전원을 켭니다");
	}
	void ShowInfo() {
		System.out.printf("---LG Gram1010의 스펙---\n"
				+ "시리얼 넘버 : %s\n"
				+ "CPU스펙 : %s\n"
				+ "RAM스펙 : %s\n"
				+ "DISK스펙 : %s\n",SerialNO,CPUSpec,RAMSpec,DISKSpec);
	}
	void PowerOFF() {
		System.out.println("SerialNO "+SerialNO+"의 전원을 끕니다");
	}
}

public class C06ComuputerMain {

	public static void main(String[] args) {
		C06Computer LGGram1010 = new C06Computer();
		LGGram1010.SerialNO="1010";
		LGGram1010.CPUSpec="I7";
		LGGram1010.RAMSpec="16G";
		LGGram1010.DISKSpec="2TB";
		LGGram1010.PowerON();		// SerialNO의 전원을 켭니다. 가 출력
		System.out.println();
		LGGram1010.ShowInfo();		// 모든 멤버변수가 출력
		System.out.println();
		LGGram1010.PowerOFF();		// SerialNO의 전원을 끕니다. 가 출력
	}

}
