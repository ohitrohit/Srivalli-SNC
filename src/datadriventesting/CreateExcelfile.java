package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CreateExcelfile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./test data/Book1.xlsx");
	Workbook wb= null;
	try {
	wb =WorkbookFactory.create(fis);
    
    Sheet sheet = wb.getSheet("Sheet1");
    
    Row row = sheet.getRow(0);
    
    Cell cell = row.createCell(2);
    
    cell.setCellValue("https://www.facebook.com/");
    
    FileOutputStream fos = new FileOutputStream("./test data/Book1.xlsx");
    wb.write(fos);
    
	}
	finally {
    wb.close();
	}
}
}

