package Utility;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUse {
    static String path=null;
    static XSSFWorkbook workbook;
    static XSSFSheet datasheet;
    public ExcelUse(String excelPath, String dataSheet)
    {
        try {
            workbook = new XSSFWorkbook(excelPath);
            datasheet = workbook.getSheet(dataSheet);
        }
        catch(Exception exp)
        {
            System.out.println("exception"+exp);
        }
    }
    public static void main(String[] args) {
      //  getRowCount();
       // getCellString();
       //getCellNumber();
    }

    public static int getRowCount() {
            int row_count = datasheet.getPhysicalNumberOfRows();
           // System.out.println("Total Number of rows" + row_count);
            return row_count;

           }


    public static int getColumnCount() {
        int col_count = datasheet.getRow(0).getPhysicalNumberOfCells();
        //System.out.println("Total Number of rows" + col_count);
        return col_count;
    }
   public static String getCellString(int rowNum,int cellNum) {
       //System.out.println("state of the second employee" + emp_state);
       String cell_data = datasheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
       return cell_data;
          }
    public static void getCellNumber(int rowNum,int cellNum) {
               double emp_id = datasheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();
            System.out.println("Employee ID" + emp_id);
    }
}
