package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile2 {
public static void main(String[] args) throws IOException {
	FileInputStream f = new FileInputStream("./test data/data.properties");
    
	Properties property = new Properties();
	
	property.load(f);
	
	String url = property.getProperty("url");
	String username = property.getProperty("username");
	String password = property.getProperty("password");
	long time = Long.parseLong(property.getProperty("time"));
	System.out.println(url+"\n"+username+"\n"+password+"\n"+time);
}
}
