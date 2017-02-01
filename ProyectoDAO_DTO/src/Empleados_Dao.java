import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.SQLException;





public class Empleados_Dao {

		public  List<EmpleadosDTO> consultaEmpleados(){
			
			List<EmpleadosDTO>lista_e=null;
			lista_e = new ArrayList<EmpleadosDTO>();
			Connection conn = null;
			Statement st = null;
			ResultSet rs = null;
			
			
			try{
				DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
				conn = DriverManager.getConnection ("jdbc:oracle:thin:@127.0.0.1:1521:xe", "Hr", "password");
			    st = conn.createStatement();
			    rs = st.executeQuery("Select * From EMPLOYEES Where DEPARTMENT_ID=50");
			    while(rs.next()){
			    	
			    	lista_e.add(new EmpleadosDTO(rs.getInt(1), rs.getString(2), rs.getInt(8), rs.getInt(11)));
			    }
			    
			   
			
			} catch (Exception e) {
			    e.printStackTrace();
				System.out.println("Error ejecutando bd");
				try {
					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			//conexion, ejecutar consulta, forecah y crear un objeto empleados dto, add ese dto a una lista, liberar recursos.
			
			
		}
			return lista_e ;

	
}
}
