package Utility;

import java.sql.SQLOutput;

public class ExcelUtilityFunction {
    public static void main(String[] args) {
        String path = System.getProperty("user.dir");
        String worksheet = "Sheet1";
        getDataFromExcel(path + "/excel/data_string.xlsx", worksheet);
    }

    public static Object[][] getDataFromExcel(String excelPath, String excelSheet) {
        ExcelUse excel = new ExcelUse(excelPath, excelSheet);
        int row_count = excel.getRowCount();
        int col_count = excel.getColumnCount();
        Object data[][]=new Object[row_count-1][col_count];
        for (int i = 1; i <row_count; i++) {
            for (int j = 0; j <col_count; j++) {
                String cell_data = excel.getCellString(i, j);
                System.out.print("Data in the cell:" + cell_data);
                data[i-1][j]=cell_data;
            }
            System.out.println();
        }
        return data;
    }
}
