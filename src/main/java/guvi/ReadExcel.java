package guvi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis;
		try {
			fis = new FileInputStream("C:/Users/laksh/OneDrive/Desktop/Maven/student.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			
			XSSFRow xlRow = sheet.getRow(0);
			XSSFCell xlCell = xlRow.getCell(0);
			String cellValue = xlCell.getStringCellValue();
			System.out.println(cellValue+ "  ");
			xlCell = xlRow.getCell(1);
			cellValue = xlCell.getStringCellValue();
			System.out.println(cellValue+ "  ");
			xlCell = xlRow.getCell(2);
			cellValue = xlCell.getStringCellValue();
			System.out.println(cellValue+ "  ");
			
			int lastRow = sheet.getLastRowNum();
			
			for(int i=0; i<=lastRow; i++) {
				xlRow = sheet.getRow(i);
				
				int lastColumn = xlRow.getLastCellNum();
				for(int k=0; k<lastColumn; k++) {
					xlCell = xlRow.getCell(k);
					cellValue = xlCell.getStringCellValue();
					System.out.print(cellValue+ "  ");
				}
				System.out.println(" ");
			}
			
			fis.close();
			wb.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
