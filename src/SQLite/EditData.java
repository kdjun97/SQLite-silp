package SQLite;
 
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
 
public class EditData {
	public static void editData(Connection con) throws SQLException
	{
		System.out.println("\n*** 데이터 수정 ***");
		Statement stat3 = con.createStatement();
		String sql3 = "UPDATE g_artists SET a_year = '2000년대, 2010년대, 2020년대' "
				+ "WHERE id=1;";
		int cnt3 = stat3.executeUpdate(sql3);
		if (cnt3>0)
			System.out.println("데이터 수정 완료!");
		else
			System.out.println("데이터 수정 오류!");
		stat3.close();
	}
}
