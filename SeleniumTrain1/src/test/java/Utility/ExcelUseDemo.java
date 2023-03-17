package Utility;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUseDemo {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        String worksheet="Sheet1";
        ExcelUse excelUse=new ExcelUse(path + "/excel/data.xlsx",worksheet);
               excelUse.getRowCount();
               excelUse.getCellString(1,1);
               excelUse.getCellNumber(2,2);
    }
}
