import java.util.List;


public class Principal {

	public static void main(String[] args) {
        Empleados_Dao empleados=new Empleados_Dao();
        
        List<EmpleadosDTO> le=empleados.consultaEmpleados();
        
        for (EmpleadosDTO empleadosDTO : le) {
			System.out.println(empleadosDTO.getNombre()+" "+empleadosDTO.getSalario()+" "+empleadosDTO.getId()+" "+ empleadosDTO.getDpto()  );
		}

	}

}
