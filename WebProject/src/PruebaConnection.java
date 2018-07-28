import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class PruebaConnection {


	private static String JDBC_DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static String JDBC_URL ="jdbc:oracle:thin:@localhost:1521/xe";
	private static String JDBC_USER ="hr";
	private static String JDBC_PASS ="hr";
	private static Driver driver = null ;
	
	private final String sql_update = " update person set email = ? where id = ? " ;
	//update person set email ='@hotmail' where id =1;
	
	public Connection getConnection() throws SQLException{
		if (driver != null){
			try{
				Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
				driver = (Driver)jdbcDriverClass.newInstance();
				DriverManager.registerDriver(driver);
				
				
			}catch(Exception e){
			System.out.println("Fallo en cargar el driver JDBC");
			e.printStackTrace();
		}					
		}		
		return DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASS);						
	}
	
	
	public static void close (ResultSet rs){
		
		try{
			if (rs != null){
				rs.close();
			}
			}catch (SQLException sqle) {
				sqle.printStackTrace();				
			}
	}
	
	
	public static void close (PreparedStatement stmt){
		try {if (stmt != null){
			stmt.close();
		}
		}catch (SQLException sqle){
			sqle.printStackTrace();
			
		}
	}
	
	public static void close (Connection conn){
		try {
			if (conn != null){
				conn.close();
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
			
			
		}
	}
	
	public int UpdatePersona(int persona_id , String nombre ){
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int rows=0;
		
	 	try{
			conn = getConnection();
			System.out.println("Ejecutando Script: " + sql_update);
			stmt = conn.prepareStatement(sql_update);
			int index = 1;
			stmt.setString(index++, nombre);			
			stmt.setInt(index,persona_id);
			
			rows = stmt.executeUpdate();
			System.out.println("Registros Afectados:" + rows);
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			PruebaConnection.close(stmt);
			PruebaConnection.close(conn);
			
		}
    	return rows;
		
	}
}
