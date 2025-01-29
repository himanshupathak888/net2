package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelDataReader {

	public static List<String[]> readExcelData(String filePath) throws IOException {
		FileInputStream fis = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(1); // Read the first sheet

		List<String[]> data = new ArrayList<>();

		for (int i = 1; i <= sheet.getLastRowNum(); i++) { // Skip header row
			Row row = sheet.getRow(i);
			if (row != null) {
				String[] rowData = new String[row.getLastCellNum()];
				for (int j = 0; j < row.getLastCellNum(); j++) {
					Cell cell = row.getCell(j);
					rowData[j] = cell != null ? cell.toString() : "";
				}
				data.add(rowData);
			}
		}
		workbook.close();
		fis.close();
		return data;
	}
}
