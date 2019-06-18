package java_20190613;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.hssf.util.HSSFColor;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.CellStyle;
	import org.apache.poi.ss.usermodel.Font;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceltest {
	public static void main(String[] args) {
	         
	        // Workbook ����
	        Workbook xlsWb = new HSSFWorkbook(); // Excel 2007 ���� ����
	 
	        // *** Sheet-------------------------------------------------
	        // Sheet ����
	        Sheet sheet1 = xlsWb.createSheet("bit");
	 
	        // �÷� �ʺ� ����
	     //   sheet1.setColumnWidth(0, 10000);
	      //  sheet1.setColumnWidth(9, 10000);
	        // ----------------------------------------------------------
	         
	   /*     // *** Style--------------------------------------------------
	        // Cell ��Ÿ�� ����
	        CellStyle cellStyle = xlsWb.createCellStyle();
	         
	        // �� �ٲ�
	        cellStyle.setWrapText(true);
	         
	        // Cell ����, ���� ä���
	        cellStyle.setFillForegroundColor(HSSFColor.LIME.index);
	        cellStyle.setFillPattern(CellStyle.BIG_SPOTS);
	     */    
	        Row row = null;
	        Cell cell = null;
	        //----------------------------------------------------------
	         
	        // ù ��° ��
	        row = sheet1.createRow(0);
	         
	        // ù ��° �ٿ� Cell �����ϱ�-------------
	        cell = row.createCell(0);
	        cell.setCellValue("1-1");
	     //   cell.setCellStyle(cellStyle); // �� ��Ÿ�� ����
	         
	        cell = row.createCell(1);
	        cell.setCellValue("1-2");
	         
	        cell = row.createCell(2);
	        cell.setCellValue("1-3 abccdefghijklmnopqrstuvwxyz");
	     //   cell.setCellStyle(cellStyle); // �� ��Ÿ�� ����
	        //---------------------------------
	         
	        // �� ��° ��
	        row = sheet1.createRow(1);
	         
	        // �� ��° �ٿ� Cell �����ϱ�-------------
	        cell = row.createCell(0);
	        cell.setCellValue("2-1");
	         
	        cell = row.createCell(1);
	        cell.setCellValue("2-2");
	         
	        cell = row.createCell(2);
	        cell.setCellValue("2-3");
	      //  cell.setCellStyle(cellStyle); // �� ��Ÿ�� ����
	        //---------------------------------
	 
	        // excel ���� ����
	        try {
	            File xlsFile = new File("c:\\down\\testtest.xls");
	            FileOutputStream fileOut = new FileOutputStream(xlsFile);
	            xlsWb.write(fileOut);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	         
	    }

}