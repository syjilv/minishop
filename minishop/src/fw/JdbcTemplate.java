package fw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//��� DBó�� �޼ҵ忡�� �ߺ��Ǵ� ����� ��Ƴ��� Ŭ����
public class JdbcTemplate {
	// ����̹��ε�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� �ε� ����");
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
	//ResultSet��ȯ
	public static void close(ResultSet rs) {
		try {
			if (rs != null)	rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Statement��ȯ
	public static void close(Statement stmt) {
		try {
			if (stmt != null)	stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//Connection��ȯ
	public static void close(Connection conn) {
		try {
			if (conn != null)	conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}