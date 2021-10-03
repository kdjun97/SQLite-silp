package SQLite;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class ReadData {
	public static void readData(Connection con) throws SQLException
	{ 
		// 데이터 조회
		System.out.println("\n*** 데이터 조회 ***");
		Statement stat1 = con.createStatement();
		String sql1 = "SELECT * FROM g_artists";
		ResultSet rs1 = stat1.executeQuery(sql1);
		
		while (rs1.next()) {
			String id = rs1.getString("id");
			String name = rs1.getString("name");
			System.out.println(id + " " + name);
		}
		stat1.close();
	}
}
