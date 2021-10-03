package SQLite;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// SQLite JDBC 쳌!킄!
			Class.forName("org.sqlite.JDBC");
			
			// SQLite 데이터베이스 파일에 연결
			String dbFile = "myfirst.db";
			con = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
			
			// 데이터 조회
			ReadData.readData(con);
			
			// 데이터 추가
			AddData.addData(con);
			
			// 데이터 조회
			ReadData.readData(con);
			
			// 데이터 수정
			EditData.editData(con);
			
			// 데이터 삭제
			DeleteData.deleteData(con);
			
			// 데이터 추가
			AddData.addData(con);
			
			// 데이터 조회
			ReadData.readData(con);
						
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (Exception e) {}
			}
		}
	}
}
