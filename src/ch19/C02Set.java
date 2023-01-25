package ch19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		hashcode(), equals()를 이용하여 동일객체여부 판단
		
//		추가
		set.add("JAVA");		//0
		set.add("JDBC");		//1
		set.add("OracleDB");	//2
		set.add("JSP");			//3
		set.add("Servlet");		//4
		set.add("JSP");			//5, 중복불가, 나중에 저장되는 값 저장한다고 함. 이전값을 원하면 equals를 재정의해야함
//		확인
		System.out.println("총개체수 : "+ set.size());
		
		
//		조회 - 순서없음
		System.out.println("---------");
		for(String i : set) {
			System.out.println(i);
		}
		System.out.println("---------");
//		조회(복잡) - 순서없음
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		
		set.remove("JDBC");
		System.out.println("---------");
		System.out.println("총 개체수   : "+set.size());
		for(String i : set) {
			System.out.println(i);
		}
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			String tmp = iter.next();
//			System.out.println(tmp);
//		}
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		System.out.println("---------");
		
	}
	
}
