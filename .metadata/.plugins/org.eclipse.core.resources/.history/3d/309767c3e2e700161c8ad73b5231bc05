import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;




public class MainXML {

	public static void main(String[] args) throws FileNotFoundException, IOException, SAXException {
		XMLReader reader = 
				XMLReaderFactory.createXMLReader();
				
				ArrayLista arrayLista = null;
				arrayLista = new ArrayLista();
				
				reader.setContentHandler(arrayLista);
				
				reader.parse
				(new InputSource
						(new FileInputStream("libros.xml")));

	}

}
