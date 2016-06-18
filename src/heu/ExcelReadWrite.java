package heu;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelReadWrite {

    public String ReadExcel(int columna, int celda) {
        String cellData = "";

        try {

            Workbook workbook = Workbook.getWorkbook(new File("./src/BasedeDatos.xls"));

            Sheet sheet = workbook.getSheet("Sheet1");
            Cell cell = sheet.getCell(columna, celda);
            cellData = cell.getContents();

            workbook.close();
        } catch (Exception e) {
            System.out.println("readExcel ->" + e);
        }
        return cellData;
    }
    
    public void writeExcel(int column,int row, String value){

        String cellData = new String();
        try{
            System.out.println(value);
            Workbook target_workbook = Workbook.getWorkbook(new File("./src/BasedeDatos.xls"));

            WritableWorkbook workbook = Workbook.createWorkbook(new File("./src/BasedeDatos.xls"), target_workbook);

            target_workbook.close();

            WritableSheet sheet = workbook.getSheet("Sheet1");

            jxl.write.Label number = new jxl.write.Label(column, row, value);

            sheet.addCell(number);
            workbook.write();
            workbook.close();
        }catch(Exception e){
            System.out.println("writeExcel ->"+e);
            e.printStackTrace();
        }
    }
}
