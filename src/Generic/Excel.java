package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Excel {

	public static String getcellData(String xlpath,String sheet,int row ,int cell){
		String val="";
		try {
			FileInputStream fis=new FileInputStream(xlpath);
			Workbook wb=WorkbookFactory.create(fis);
			val=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			val=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			System.out.println(val);
		}

		catch(Exception e) {

		}
		return val;
	}

}