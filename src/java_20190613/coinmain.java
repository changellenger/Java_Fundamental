package java_20190613;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class coinmain {
	public void crawlcoin(String name, String start, String end) {

		String url = "https://coinmarketcap.com/currencies/" + name + "/historical-data/?start=" + start + "&end=" + end+ "";

		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		
		Elements elements = doc.select(".table-responsive");
		Elements liEle = elements.select("tr");
		Element temp = null;

		String[] devstr = new String[9];
		
		Workbook xlsWb = new HSSFWorkbook(); // Excel 2007 이전 버전
	/*	int sn = xlsWb.getNumberOfSheets();
		
		for (int i = 0; i < sn; i++) {
			if(name.equals(xlsWb.getSheetName(sn))){
				
				
			}
		}*/
		
		
		
		Sheet sheet1 = xlsWb.createSheet(name);
		Row row = null;
		Cell cell = null;

		row = sheet1.createRow(0);

		cell = row.createCell(0);
		cell.setCellValue("Date");

		cell = row.createCell(1);
		cell.setCellValue("Open*");

		cell = row.createCell(2);
		cell.setCellValue("High	");

		cell = row.createCell(3);
		cell.setCellValue("Low");

		cell = row.createCell(4);
		cell.setCellValue("Close**");

		cell = row.createCell(5);
		cell.setCellValue("Volume");

		cell = row.createCell(6);
		cell.setCellValue("Market Cap");

		for (int k = 1; k < liEle.size(); k++) {
			temp = liEle.get(k);
			row = sheet1.createRow(k);
			for (int j = 0; j < devstr.length; j++) {
				devstr[j] = temp.text().split(" ")[j];
				if (j < 3) {
					cell = row.createCell(0);
					cell.setCellValue(devstr[0] + " " + devstr[1] + " " + devstr[2]);
				} else {
					cell = row.createCell(j - 2);
					double numb = Double.parseDouble(devstr[j].replaceAll(",", ""));
					cell.setCellValue(numb);
				}
			}
		}
		try {
			File xlsFile = new File("c:\\down\\coincrawling.xls");
			FileOutputStream fileOut = new FileOutputStream(xlsFile);
			xlsWb.write(fileOut);
			System.out.println("성공");
		}  catch (IOException e) {
			e.printStackTrace();
			System.out.println("실패");
		}
	}

	public static void main(String[] args) {
		// 1. bitcoin 2. ethereum 3.ripple
		String coinname = "ripple";
		String datestart = "20180613";
		String dateend = "20190613";

		coinmain c = new coinmain();
		c.crawlcoin(coinname, datestart, dateend);
	}

}