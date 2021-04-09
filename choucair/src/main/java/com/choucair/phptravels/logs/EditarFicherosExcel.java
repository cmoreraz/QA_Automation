
package com.choucair.phptravels.logs;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class EditarFicherosExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException{

		String fecha 		 = "20082020";
		String nombreArchivo = "Inventario"+fecha+".xlsx";
		String rutaArchivo	 = "C:\\Ficheros-Excel\\"+nombreArchivo;
		String hoja			 = "RECARGA";
		InputStream inp 	 = new FileInputStream(rutaArchivo);

		XSSFWorkbook wb		 = XSSFWorkbookFactory.createWorkbook(inp);
		XSSFSheet hoja1 	 = wb.getSheet(hoja);

		XSSFRow row 		 = hoja1.getRow(0);
		XSSFCell cell 		 = row.getCell(1);
		String cellContents  = cell.getStringCellValue(); 

		cell.setCellValue(cellContents); 
		FileOutputStream fileOut = new FileOutputStream(rutaArchivo);
		wb.write(fileOut);
		fileOut.close();
	}
}
