package ch06;

import java.util.Scanner;

public class C03Switch문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		char medalColor;
		switch(ranking)
//		상수값만 case에 넣을수 있다.
		{
		case 1:
			medalColor = 'G';
			System.out.println("메달 색상은 : 금색");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("메달 색상은 : 은색");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달 색상은 : 동색");
			break;
		default:
			medalColor = ' ';
			System.out.println("메달 색상은 : Nothing");
			break;
		}
		System.out.println(ranking+"등의 매달색은 "+ medalColor+"입니다.");
	}

}
