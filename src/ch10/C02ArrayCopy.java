package ch10;

import java.util.Arrays;

public class C02ArrayCopy {

	public static void main(String[] args) {
		int [] arr1= {10,20,30};
		// 얕은 복사(위치값 복사)
//		int [] arr2 = arr1;
//		// arr1의 주소를 arr2의 주소와 동일하게 바꾼다
		
//		// 깊은 복사(공간 복사후 데이터값 복사)
//		int[] arr2 = new int[3];
//		for (int i=0;i< arr1.length;i++) {
//			arr2[i] = arr1[i];
//		}
		// 깊은 복사2
		int [] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		arr2[0]=300;
		for(int  n : arr1) {
			System.out.print(n + " ");
		}
		System.out.println();

//		주소다른거 확인
		System.out.println("arr1 : "+ arr1);
		System.out.println("arr2 : "+ arr2);
		
		
		
		
		
		
	}

}
