package ch19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class C01List {

	public static void main(String[] args) {
		List<String> list= new ArrayList();
//		List<String> list2= new Vector<>();
//		멀티스레드환경에 안전하다.
//		인계영역이란것이 있다. 찾아볼것.
//		List<String> list3= new LinkedList<>();
//		ArrayList<String> list= new ArrayList<String>();
		
		
//		추가
		list.add("JAVA");		//0
		list.add("JDBC");		//1
		list.add("OracleDB");	//2
		list.add("JSP");		//3
		list.add("Servlet");	//4
		list.add("JSP");		//5, 중복허용 
//		확인
		System.out.println("총 개체수   : "+list.size());
//		조회(요소)
		System.out.println("확인 idx 2 : " + list.get(2));
		System.out.println("---------");
//		전체조회
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		삭제
		list.remove(5);
		System.out.println("---------");
		System.out.println("총 개체수   : "+list.size());
		
		for(String i : list) {
			System.out.println(i);
		}
//		전체삭제
		list.clear();
		System.out.println("---------");
		System.out.println("총 개체수   : "+list.size());
		
		
	}

}
