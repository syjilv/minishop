package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//모든 DB처리 메소드에서 중복되는 기능을 모아놓은 클래스
public class JdbcTemplate {
	// 드라이버로딩
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패");
		}
	}

	public static Connection getConnect() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//ResultSet반환
	public static void close(ResultSet rs) {
		try {
			if (rs != null)	rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Statement반환
	public static void close(Statement stmt) {
		try {
			if (stmt != null)	stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Connection반환
	public static void close(Connection conn) {
		try {
			if (conn != null)	conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}