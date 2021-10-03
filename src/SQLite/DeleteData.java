package SQLite;
 
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteData {
	public static void deleteData(Connection con) throws SQLException
	{
		System.out.println("\n*** 데이터 삭제 ***");
		Statement stat4 = con.createStatement();
		String sql4 = "DELETE FROM g_artists WHERE id=8;";
		int cnt4 = stat4.executeUpdate(sql4);
		if (cnt4>0)
			System.out.println("데이터 삭제 완료!");
		else
			System.out.println("데이터 삭제 오류!");
		stat4.close();
	}
}
