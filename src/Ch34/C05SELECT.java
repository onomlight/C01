package Ch34;

import java.sql.*;

public class C05SELECT {

	public static void main(String[] args) {

		// 연결관련 정보 저장용 변수
		String id="root";
		String pw="1234";
		String url="jdbc:mysql://localhost:3306/testdb";
		
		//DB연결 관련 객체를 위한 참조 변수
		Connection conn = null; 			// DB연결객체
		PreparedStatement pstmt = null;		// SQL 쿼리 전송 객체 
		ResultSet rs = null;				// 쿼리결과 수신용 객체 

		//연결
		try {
			// DB Driver 로드
			Class.forName("com.mysql.cj.jdbc.Driver"); // 자바 메모리공간에 드라이버 클래스를 적제시킴
			System.out.println("Driver Loading Success!");
			// DB 연결객체 생성 
			conn=DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected..");
			
			//SQL 전송객체
			pstmt=conn.prepareStatement("select * from students_tbl");
			
			//SQL 실행
			rs=pstmt.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(
						rs.getString("Name")+" "+rs.getInt("Addr")+" "+rs.getString("Hoddy")+" "+rs.getString("goals")
						);
			}
					
		}catch(Exception e) // 예외처리 
		{
			e.printStackTrace();
		}finally {
			try{conn.close();}catch(Exception e1) {e1.printStackTrace();}
		}
	}

}
