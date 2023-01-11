package ch08;

class C05Car{
	String owner;
	int speed;
	int fuel;
	String model;

//	기능
	void Accel() {
//		speed = speed +10;
		System.out.println();
		if (fuel-5<=0) {
			fuel = 0;
			System.out.println("[에러] 가속불가 - 연료가 떨어졌습니다.");
		} else {
			fuel -= 5;  //연료량에서 -5
			if(speed + 10 >=200){
				speed = 200;
				System.out.println("[에러] 가속불가 - 최대속도입니다. 200km/h이상 가속하시면 안됩니다.");				
			}else {
				speed +=10;  // 현재속도에서 +10
				System.out.println("[정보] 가속합니다 = 현재속도 "+speed);
			}
		}
	}
	
	void Break() {
		if (speed <=0) {								// 속도가 0이하일때
			speed = 0;
			System.out.println("[에러] 감속불가 - 이미 정지되었습니다.");
		} else if(speed < 15 && speed >0 ) {			// 속도가 0초과 15미만일 때
			speed -= speed;
			System.out.println("[정보] 감속합니다 - 이제 정지합니다. 현재속도 " + speed + "km/h");			
		} else {										// 속도가 15이상일때
			speed -= 15;
			System.out.println("[정보] 감속합니다 - 현재속도 "+ speed+"km/h");
		}
	}
	
	void Info() {
		System.out.printf("차주 : %s\n현재속도 : %d\n연료량 : %d\n차종 : %s\n", owner, speed, fuel, model);
	}	//	멤버 정보표시용 함수는 이후  toString(재정의로 대체)

}
public class C05CarMain {

	public static void main(String[] args) throws InterruptedException {
		C05Car hong = new C05Car();
		hong.owner = "홍길동";
		hong.speed = 300;
		hong.fuel = 100;
		hong.model = "아반떼xd";
		
		hong.Info();  // owner, speed, fuel,model 출력
//		hong.Accel();
//		hong.Break();
		System.out.printf("%d %d\n\n",hong.speed , hong.fuel);
		while (true) {
//			hong.Accel();
			System.out.println("현재속도는 " + hong.speed + "km/h입니다");
			hong.Break();
			Thread.sleep(1000);
			if (hong.speed<=0){
				break;
			}
		}
		
		
	}

}
