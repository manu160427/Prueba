import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;


public class Idiomas {
	
  private static final String PREFIJO="Story_";
  private static final String SUFIJO=".properties";
  private static final String CLAVE_F_SALIDA="outfile"; 
  private static final String CLAVE_F_INICIO="start";
  private static final String CLAVE_CUERPO="body";
  private static final String CLAVE_FINAL="end";
  
  public static void main(String[] args) {
		
		
		try {
			
			Properties propiedades =null;
			String idioma = args[0];//en run configuration le tengo que meter el parametro sino al ejecutar fallara
			String nombre_fichero= PREFIJO+idioma+SUFIJO;
			String nfs= null;
			String principio;
			String cuerpo;
			String desenlace;
			FileReader fr= new FileReader(nombre_fichero);
			
			  propiedades=new Properties();
			  propiedades.load(fr);
			   
			  nfs=propiedades.getProperty(CLAVE_F_SALIDA);
			  FileWriter fw = new FileWriter(nfs);
			  BufferedWriter bw= new BufferedWriter(fw);
			  
			  principio= propiedades.getProperty(CLAVE_F_INICIO);
			  cuerpo= propiedades.getProperty(CLAVE_CUERPO);
			  desenlace= propiedades.getProperty(CLAVE_FINAL); 
			  
			  bw.write(principio+"\n");
			  bw.write(cuerpo+"\n");
			  bw.write(desenlace);
			  
			  bw.close();
			  fw.close();
			  
			  
		} catch (Throwable  t) {
			
			t.printStackTrace();
		}
		
		//propiedades.load(inStream);
		
		
		
		
		

	}

}
