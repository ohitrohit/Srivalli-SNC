package practiceChapter3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Program2 {

	public static void main(String[] args) throws IOException {
		Properties property = new Properties();
		property.put("value" , "rohit");
		FileOutputStream fos = new FileOutputStream("./test data/practice.properties");
        property.store(fos, "updated");
	}
}
