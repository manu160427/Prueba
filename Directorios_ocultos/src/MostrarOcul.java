import java.io.File;


public class MostrarOcul {
	
 public static void main(String[] args) {
	 File file=null;
	 
	 file= new File("C:\\Users\\Alumno\\Desktop\\trabajos eclipse\\FicheroOculto");
	 
	 if(file.exists()){
		 
		 System.out.println("existe");
		 String[] lista=null;
		 lista=file.list();
		 for(int i = 0; i<lista.length;i++){
			 System.out.println("la lista es "+lista[i]);
		 }
	 }
	 else{
		 System.out.println("no existe");
	 }

	}



	
 }

