package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C01DBConnect {
	public static void main(String[] args) {
//		연결관련 정보 저장용 변수
		String id  = "root";								//DB연결 id
		String pw  = "1234";								//DB연결 pw
		String url = "jdbc:mysql://localhost/testDB";		//연결URL(DBMS마다 다름)
				   // 포트는 생략가능(localhost:3306)
//		DB연결객체 관련 참조변수
		Connection conn = null;								//DB연결객체용 참조변수
		PreparedStatement pstmt = null;						//SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//1 드라이브 메모리 적재
			System.out.println("드라이버 로딩 완료");
			conn = DriverManager.getConnection(url,id,pw);	//2 DB연결
			System.out.println("DB 커넥트....");
			
		} catch (Exception e) {
			System.out.println("커넥팅문제");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch(Exception e) {e.printStackTrace();}
		}
		
	}
}
