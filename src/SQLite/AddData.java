package SQLite;
  
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddData {
	public static void addData(Connection con) throws SQLException
	{
		System.out.println("\n*** 데이터 추가 ***");
		Statement stat2 = con.createStatement();
		String sql2 = "INSERT INTO g_artists (name, a_type, a_year, debut, regdate)" +
				" VALUES ('방탄소년단', '남성', '2010년대', '2013년', datetime('now', 'localtime'));";
		int cnt = stat2.executeUpdate(sql2);
		if(cnt>0)
			System.out.println("새로운 데이터가 추가 되었습니다!");
		else
			System.out.println("데이터 추가 오류!");
		stat2.close();
		
	}
}
