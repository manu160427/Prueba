import java.io.File;


public class fichero {

	public static void main(String[] args) {
		 File file=null;			 
		 file= new File("C:\\Users\\Alumno\\Desktop\\trabajos eclipse\\Fichero");
		 String dir;
		 
		 String[] lista=file.list();
		 
		 
		 dir=verDirectorio(lista);

	}

}
