package ch12;

import java.util.Arrays;
import java.util.stream.Stream;

//다음 2개의 static 가진 ArrayUtil 클래스를 만들어보자. 다음 코드의 실행 결과를 참고하여 concat()와 print()를 작성하여 ArrayUtil 클래스를 완성하라.

class ArrayUtil {
   public static int[] concat(int[] a, int[] b) {
	   int [] newarr = new int [a.length+b.length];
	   for (int i = 0; i < a.length; i++) {
		   newarr[i] = a[i];
		   newarr[i+a.length] = b[i];
		   }
	   return newarr;
   }
   
   public static void print(int[] a) {
      /* 배열 a 출력 */
	  for(int t : a) {
		  System.out.print(t+" ");
	  }
   }
}
public class C04PRAC {
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
	      int[] array1 = {1, 5, 7, 9};
	      int[] array2 = {3, 6, -1, 100, 77};
	      int[] array3 = ArrayUtil.concat(array1, array2);
	      ArrayUtil.print(array3);
	}
}
