package ch07;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {
		//break 
		//가장 가까이에 있는 반복문 벗어나는데 사용
		
//		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum=0;
//		while(true)
//		{
//			n=sc.nextInt();
//			if(n==-1) {
//				break;
//			}
//			sum+=n;
//		}
//		System.out.println("SUM = " + sum);
		
		//break label
		//중첩반복문이 사용되는경우 모든 반복문 혹은 특정 반복문 범위를 벗어나기 위해서 사용
//		int dan=2;
//		int i=1;
//		
//		exit_while: //break label
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				//단 : 7, i:7일때 break;
//				if(dan==7 && i==7)
//					break exit_while; //label지정된 while문 벗어남
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}		
		
//		int dan=2;
//		int i=1;
//		
//		boolean flag=false;
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				//단 : 7, i:7일때 break;
//				if(dan==7 && i==7) {
//					flag=true;
//					break; 
//				}			
//				i++;
//			}
//			if(flag)
//				break;
//			System.out.println();
//			dan++;
//		}	
		
		//continue
		//반복 조건식으로 이동
		int i=1;
		int sum=0;
		while(i<=10)
		{
			if(i%3==0) {
				i++;
				continue; //근접한 반복문의 조건식으로 돌아감
			}
			System.out.println("i=" + i);
			sum+=i;
			i++;	
		}
		System.out.println("SUM = " + sum);
		
		

	}

}
