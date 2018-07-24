package api.helpers;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class readexcelStream {

    String filePath1 = "testdata\\test_data.xlsx";

//    @DataProvider(name = "testdata")
    @DataProvider() // this will by dafult take the name of the method
    public Object[][] dataprovider() throws Exception {

        File file = new File(filePath1);
        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("Get");
        wb.close();

        int lastRowNum = sheet.getLastRowNum();
        int lastcolumn = sheet.getRow(0).getLastCellNum();

        Object[][] obj = new Object[lastRowNum][lastcolumn];

        for (int i = 0; i < lastRowNum; i++) {
            Map<Object, Object> datamap = new HashMap<>();

            for (int j = 0; j < lastcolumn; j++) {
                datamap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
            }
            obj[i][0] = datamap;

        }
        return obj;

    }

    @Factory(dataProvider = "dataprovider" )
    public void integrationTest(Map<Object, Object> map) {
        System.out.println("-------------Test case started ----------------");
        System.out.println(map.get("UserName"));
        System.out.println(map.get("Password"));
        System.out.println(map.get("DoB"));
        System.out.println("-------------Test case Ended ----------------");
    }


}


