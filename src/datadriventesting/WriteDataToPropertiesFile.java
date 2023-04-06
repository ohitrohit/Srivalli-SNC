package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataToPropertiesFile {
	public static void main(String[] args) throws IOException {
		
	
	 FileInputStream fis = new FileInputStream("./test data/data.properties");
	    
		Properties property = new Properties();
		
		property.load(fis);
		property.put("key" , "value");
		FileOutputStream fos = new FileOutputStream("./test data/data.properties");
        property.store(fos, "updated");
	}
}