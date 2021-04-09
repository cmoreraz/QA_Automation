package com.choucair.phptravels.logs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class LeerFicherosExcel {
 
	public static String userCore 		= null;
	public static String userHydrus		= null;
	public static String passwordCore	= null;
	public static String passwordHydrus	= null;
	public static String ipCore			= null;
	public static String ipHydrus		= null;
	public static String ipPortal		= null;	
	public static String numberNode 	= null;
	public static String numberPort		= null;
	
	private static XSSFWorkbook worbook;	
	private static XSSFSheet sheetNode;
	private static XSSFSheet sheetIp;
	private static XSSFSheet sheetServerCore;
	private static XSSFSheet sheetServerHydrus;

	public static String getIpPortal() {
		return ipPortal;
	}
	
	public static void setUserCore(String userCore) {
		LeerFicherosExcel.userCore = userCore;
	}

	public static void setUserHydrus(String userHydrus) {
		LeerFicherosExcel.userHydrus = userHydrus;
	}

	public static String getIpCore() {
		return ipCore;
	}

	public static void setIpCore(String ipCore) {
		LeerFicherosExcel.ipCore = ipCore;
	}

	public static String getIpHydrus() {
		return ipHydrus;
	}

	public static void setIpHydrus(String ipHydrus) {
		LeerFicherosExcel.ipHydrus = ipHydrus;
	}

	public static void setPasswordCore(String passwordCore) {
		LeerFicherosExcel.passwordCore = passwordCore;
	}

	public static void setPasswordHydrus(String passwordHydrus) {
		LeerFicherosExcel.passwordHydrus = passwordHydrus;
	}

	public static String getUserCore() {
		return userCore;
	}
	
	public static String getUserHydrus() {
		return userHydrus;
	}	

	public static String getPasswordCore() {
		return passwordCore;
	}	

	public static String getPasswordHydrus() {
		return passwordHydrus;
	}	
	
	public static String getNumberNode() {
		return numberNode;
	}

	public static String getNumberPort() {
		return numberPort;
	}

	public static void extraerDataLogs() throws IOException {
		
		String nombreArchivo 	= "InsumosDatosPrueba.xlsx";
		String current 			= new File( "." ).getCanonicalPath();
		String rutaArchivo 		= current + "\\src\\test\\resources\\" + nombreArchivo;		
 
		try ( FileInputStream file = new FileInputStream( new File( rutaArchivo ))) {
			
			worbook = new XSSFWorkbook(file);
			
			DataFormatter formatter = new DataFormatter();
			
			//Lectura datos de conexion del server hydrus
			sheetServerHydrus = worbook.getSheet("Server Hydrus");			
			userHydrus 		  = formatter.formatCellValue(sheetServerHydrus.getRow(1).getCell(0));			
			passwordHydrus 	  = formatter.formatCellValue(sheetServerHydrus.getRow(1).getCell(1));			
			ipHydrus 		  = formatter.formatCellValue(sheetServerHydrus.getRow(1).getCell(2));
			numberPort		  = formatter.formatCellValue(sheetServerHydrus.getRow(1).getCell(3));
			
			//Lectura datos de conexion del core
			sheetServerCore = worbook.getSheet("Server Core");
			userCore 		= formatter.formatCellValue(sheetServerCore.getRow(1).getCell(0));
			passwordCore 	= formatter.formatCellValue(sheetServerCore.getRow(1).getCell(1));			
			ipCore 			= formatter.formatCellValue(sheetServerCore.getRow(1).getCell(2));
			numberPort		= formatter.formatCellValue(sheetServerCore.getRow(1).getCell(3));
			
			//Se lee ip del portal
			sheetIp 	= worbook.getSheet("Ip");
			ipPortal 	= formatter.formatCellValue(sheetIp.getRow(1).getCell(0));	
			
			//Se lee numero de nodo
			sheetNode 	= worbook.getSheet("Node");
			numberNode 	= formatter.formatCellValue( sheetNode.getRow(1).getCell(0) );	
			
		} catch ( NullPointerException e) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}
}