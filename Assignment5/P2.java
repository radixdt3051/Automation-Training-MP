import java.io.FileOutputStream; 
//import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 
  

public class P2 { 
  
   
    public static void main(String[] args) 
    { 
  
        
        @SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(); 
  
       
        XSSFSheet sheet = workbook.createSheet("Test Case Details"); 
  
      
        Map<String, Object[]> data = new TreeMap<String, Object[]>(); 
  
        
        data.put("1", new Object[] { "TC_ID", "TC_NAME", "RESULT" }); 
        data.put("2", new Object[] { 001, "Login", "Pass" }); 
        data.put("3", new Object[] { 002, "Register", "Fail" }); 
        data.put("4", new Object[] { 003, "Product", "Pass" }); 
        data.put("5", new Object[] { 004, "Order", "Fail" }); 
  
        
        Set<String> keyset = data.keySet(); 
  
        int rownum = 0; 
  
        for (String key : keyset) { 
  
          
            Row row = sheet.createRow(rownum++); 
  
            Object[] objArr = data.get(key); 
  
            int cellnum = 0; 
  
            for (Object obj : objArr) { 
  
               
                Cell cell = row.createCell(cellnum++); 
  
                if (obj instanceof String) 
                    cell.setCellValue((String)obj); 
  
                else if (obj instanceof Integer) 
                    cell.setCellValue((Integer)obj); 
            } 
        } 
  
        
        try { 
  
           
            FileOutputStream out = new FileOutputStream(new String("Testcase.xlsx")); 
            workbook.write(out); 
  
           
            out.close(); 
  
            
            System.out.println( 
                "Testcase.xlsx written successfully."); 
        } 
  
      
        catch (Exception e) { 
  
           
            e.printStackTrace(); 
        } 
    } 
}