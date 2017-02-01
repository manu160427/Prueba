import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class empleados {
	public static final String consulta_Update="UPDATE EMPLOYEES SET SALARY = (SALARY * 1.2)WHERE DEPARTMENT_ID IN (SELECT department_id FROM DEPARTMENTS WHERE DEPARTMENT_NAME = 'Administration' OR DEPARTMENT_NAME = 'IT')";
	public static final String consulta_mostrar= null;
	
	
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		ResultSet rset = null;
		Statement stmt = null;
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "HR", "password");
		         stmt = conn.createStatement();
		rset = stmt.executeQuery(consulta_Update);
		while (rset.next())
		      {
		        System.out.println (rset.getString(1));  
		      } 
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
		{
		if (rset != null) { try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (stmt != null) { try { stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
		if (conn != null) { try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
		    
		}   

		}
	
}
