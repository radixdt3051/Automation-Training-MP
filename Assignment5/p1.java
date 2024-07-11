import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class p1 {
    public static  void main(String args[]) throws IOException {
        
        File files = new File("..//Assignment5/src/Demo.xls");
        FileInputStream inputStream = new FileInputStream(files);
        
        @SuppressWarnings("resource")
		HSSFWorkbook wb=new HSSFWorkbook(inputStream);
        HSSFSheet sheet=wb.getSheet("Sheet1");
        
        int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
        
        for(int i=0;i<=rowCount;i++) {
        	
            int cellcount=sheet.getRow(i).getLastCellNum();
            System.out.println("Row"+ i+" data is :");
            
            for(int j=0;j<cellcount;j++){
                System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
            }
            System.out.println();
        }
    }
}