package ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class C02DBInsert {
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
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		//1 드라이브 메모리 적재
			System.out.println("드라이버 로딩 완료");
			conn = DriverManager.getConnection(url,id,pw);	//2 DB연결
			System.out.println("DB 커넥트....");
			
			
//			3. SQL 쿼리 객체 받아오기
			pstmt = conn.prepareStatement("INSERT INTO tbl_std (`id`, `name`, `addr`) VALUES ('?', '?', '?')");
			System.out.println("번호,이름,주소 순 입력 : ");
			int sid = sc.nextInt();
//			sc.nextLine();
			String name = sc.next(); 
//			sc.nextLine();
			String addr = sc.next();
//			sc.nextLine();
			System.out.printf("%s %s %s\n",sid,name,addr);
//			각(?,?,?)에 들어갈 내용들
			pstmt.setInt(1, sid);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);

			
			
//			4. SQL 쿼리 전송(추가,수정,삭제 -> executeUpdate)
			int result = pstmt.executeUpdate();
			if (result >0) {
				System.out.println("UPDATE 성공!");
			}else {
				System.out.println("UPDATE 실패...");
			}
			
			
		} catch (Exception e) {
			System.out.println("커넥팅문제");
			e.printStackTrace();
		} finally {
			try {conn.close();} catch(Exception e) {e.printStackTrace();}
		}
		
	}
}
