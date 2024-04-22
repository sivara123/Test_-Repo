package guvi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileInputStream fis = new FileInputStream("C:/Users/laksh/OneDrive/Desktop/Maven/student.xlsx");
					XSSFWorkbook wb = new XSSFWorkbook(fis);
					XSSFSheet sheet = wb.createSheet("Excel-Sheet2");
					
					XSSFRow row0 = sheet.createRow(0);
					row0.createCell(0).setCellValue("Name");
					row0.createCell(1).setCellValue("Age");
					row0.createCell(2).setCellValue("Email");
					
					XSSFRow row1 = sheet.createRow(1);
					row1.createCell(0).setCellValue("john");
					row1.createCell(1).setCellValue("25");
					row1.createCell(2).setCellValue("john@gmail.com");
					
					XSSFRow row2 = sheet.createRow(2);
					row2.createCell(0).setCellValue("swith");
					row2.createCell(1).setCellValue("29");
					row2.createCell(2).setCellValue("swith@gmail.com");
					
					XSSFRow row3 = sheet.createRow(3);
					row3.createCell(0).setCellValue("jack");
					row3.createCell(1).setCellValue("34");
					row3.createCell(2).setCellValue("jack@gmail.com");
					
					
					
			 FileOutputStream fos = new FileOutputStream("C:/Users/laksh/OneDrive/Desktop/New folder/student.xlsx");
					   wb.write(fos);
					    fos.close();
					
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				





	}

}
