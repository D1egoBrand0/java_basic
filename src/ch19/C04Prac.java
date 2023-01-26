package ch19;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04Prac {
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		int num = 0;
		List<String> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 이름 등록");
			System.out.println("2 이름 조회");
			System.out.println("3 이름 삭제");
			System.out.println("4 전체 조회");
			System.out.println("5 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				sc.nextLine();
				System.out.print("아이디: ");
				String id = sc.nextLine();
				if (id != "") {
					System.out.println(id);
					list.add(id);
					System.out.println(list.size());
					}
				else {
					System.out.println("재입력바랍니다");
				}
				break;
				//이름 입력받아서 ArrayList 에  add
				
			case 2:
				if (list.get(0) != "") {
//					System.out.println("있음"+id);
					}
				else {
					System.out.println("없음");
				}
				//이름 입력받아서 조회(있다,없다로 조회) 이름이 있으면 "있다" 없으면 "없다"..
			
				break;
			case 3:
				//이름 입력받아서 삭제.. 삭제되었으면 "삭제완료" 삭제할 이름 없으면 "삭제실패" 
			
				break;
			case 4:
				//전체 조회
				
				break;
			case 5:
				System.exit(-1);
			default:
				System.out.println("다시 입력...");
				
			}
			
		}
		
	}
}

