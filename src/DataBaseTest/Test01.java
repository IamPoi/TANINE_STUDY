package DataBaseTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	int cnt = 0;
	ResultSet rs = null;
	TestDTO testDto = null;
	
	public void Connection() { // DB 연결
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "system";
			String db_pw = "system";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			
			System.out.println("연결 성공");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Close() { // DB 연결 해제
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public TestDTO Lookup() {
		
		Connection();
		try {
			String sql = "select * from MEMBER where id = 'pcy'";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				
				testDto = new TestDTO(id, pw, name);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Close();
		}
		return testDto;
	}
	
	public void Insert() {
		Connection();
		
		try {
			String sql = "insert into member values (?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "pcy");
			psmt.setString(2, "pcy");
			psmt.setString(3, "pcy");
			cnt = psmt.executeUpdate();
			
			if(cnt != 0) {
				System.out.println("성공");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Close();
		}
		
		
	}
	
	public void Delete() {
		Connection();
		
		try {
			String sql = "delete from member where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "pcy");
			cnt = psmt.executeUpdate();
			
			if(cnt != 0) {
				System.out.println("성공");
			}
			
		}catch (Exception e) {

		} finally {
			Close();
		}
	}

}
