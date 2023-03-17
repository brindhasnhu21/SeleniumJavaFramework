package Utility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelUtilityUsingTestNG {
    @Test(dataProvider = "dataFromExcel")
    public void test1(String username,String state)
    {
        System.out.println(username+"|"+state);
    }


    @DataProvider(name="dataFromExcel")
    public Object[][] getdata()
    {
        String path = System.getProperty("user.dir");
        String worksheet = "Sheet1";
        Object[][] data=getDataFromExcel(path + "/excel/data_string.xlsx", worksheet);
        return data;
    }

    public static Object[][] getDataFromExcel(String excelPath, String excelSheet) {
        ExcelUse excel = new ExcelUse(excelPath, excelSheet);
        int row_count = excel.getRowCount();
        int col_count = excel.getColumnCount();
        Object data[][]=new Object[row_count-1][col_count];
        for (int i = 1; i <row_count; i++) {
            for (int j = 0; j <col_count; j++) {
                String cell_data = excel.getCellString(i, j);
               // System.out.print("Data in the cell:" + cell_data);
                data[i-1][j]=cell_data;
            }
            System.out.println();
        }
        return data;
    }
}
