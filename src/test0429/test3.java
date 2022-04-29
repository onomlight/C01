package test0429;

import java.sql.*;


public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		

		String driver = "com.mysql.cj.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/tempdb";
		String user = "root";
		String pwd = "1234";
		
		String sql;
		Connection conn= null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(driver);
			//드라이브 적재
			System.out.println("Driver Loading Success");
			//Connection 객체 생성 conn에 연결
			conn=DriverManager.getConnection(url, user, pwd);
			System.out.println("DB Connected..");
			//pstmt에 적절한 격체 연결
			pstmt=conn.prepareStatement("select * from student_tbl");
			//rs에 적절한 객체연결
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				System.out.print(rs.getString("id")+" ");
				System.out.print(rs.getString("name") + " ");
				System.out.print(rs.getInt("age") + " ");
				System.out.print(rs.getString("addr") + " ");
				System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {		
			try{conn.close();}catch(Exception e1) {e1.printStackTrace();}
		}
	}

}
