package com.choucair.phptravels.logs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CrearFicherosExcel {

	private String estado = "Estado";
	private static Date date;
	private File file;
	private static XSSFWorkbook libro;
	
	public void crearExcel() throws IOException {
		
		date = new Date();
		
	    DateFormat hourdateFormat = new SimpleDateFormat("ddMMyyyy");
	    String current 	= new File( "." ).getCanonicalPath();
	    String fecha 	= hourdateFormat.format(date);
		
		String nombreArchivo 	= "BaseDeDatos" + fecha + ".xlsx";
		String rutaArchivo 		= current+"\\Logs\\BaseDeDatos\\" + nombreArchivo;
		String hojaRecarga 		= "RECARGA";
		String hojaPaquete 		= "PAQUETE";
		String hojaDaviplata 	= "DAVIPLATA";
		String hojaGeneral 		= "GENERAL";
		String hojaRecaudo 		= "RECAUDO";

		libro = new XSSFWorkbook();
		
		XSSFSheet hoja1 = libro.createSheet(hojaRecarga);
		// cabecera de la hoja de excel
		String[] header1 = new String[] {"TRAND_ID", "TRRE_NUMERO", "TRRE_RESPUESTAOPERADOR", "TRRE_FECHA",
				"TRRE_FECHA1", "TRRE_EXTREFNUM", "TRRE_COORDENADAS",estado, " ", "TRAND_ID", "TRRE_NUMERO", "TRRE_RESPUESTAOPERADOR", "TRRE_TRANSACCION",
				"TRRE_FECHA", "TRRE_FECHA1", "TRRE_EXTREFNUM", estado};

		// contenido de la hoja de excel

		// poner negrita a la cabecera
		CellStyle style = libro.createCellStyle();
		Font font 		= libro.createFont();
		
		font.setBold(true);
		style.setFont(font);
		
		// generar los datos para el documento
		XSSFRow row = hoja1.createRow(0);// se crea las filas
		for (int j = 0; j < header1.length; j++) {
			XSSFCell cell = row.createCell(j);// se crea las celdas para la cabecera, junto con la posición
			cell.setCellStyle(style); // se añade el style crea anteriormente
			cell.setCellValue(header1[j]);// se añade el contenido
		}
		
		XSSFSheet hoja2 = libro.createSheet(hojaPaquete);
		// cabecera de la hoja de excel
		String[] header2 = new String[] { "TRAN_ID", "TRPA_NUMERO", "TRPA_AUTORIZACION", "TRPA_RESPONSE", 
			       "TRPA_FECHAREGISTRO", "TRPA_FECHA", "TRPA_EXTREFNUM",estado };

		// contenido de la hoja de excel

		// poner negrita a la cabecera
		font.setBold(true);
		style.setFont(font);
		// generar los datos para el documento
		XSSFRow row2 = hoja2.createRow(0);// se crea las filas
		for (int j = 0; j < header2.length; j++) {
			XSSFCell cell = row2.createCell(j);// se crea las celdas para la cabecera, junto con la posición
			cell.setCellStyle(style); // se añade el style crea anteriormente
			cell.setCellValue(header2[j]);// se añade el contenido
		}
		
		XSSFSheet hoja3 = libro.createSheet(hojaDaviplata);
		// cabecera de la hoja de excel
		String[] header3 = new String[] { "TRAN_ID", "TRAN_ID","TRAD_NUMEROAPROBACION", "TRAD_DAVIPLATA","TRAD_ERROR",
				"TRAD_DOCUMENTODEPOSITANTE", "TRAD_CELULARDEPOSITANTE","TRAD_FECHAREGISTRO","TRAD_RESPUESTA","TRAD_NOMBRETITULAR",
				"TRAD_VALOR","TIPO_ID","TRAD_VALORGIRO","TRAD_FECHA","TRAD_NOMBRESDEPOSITANTE", "TRPA_APELLIDOS", "TRPA_DIRECCIONDEPOSITANTE", 
			       "CIUDAD_ID_DEPOSITANTE","CIUDAD_ID_DEPOSITO", "PVCT_CODIGO",estado};

		// contenido de la hoja de excel

		// poner negrita a la cabecera
		font.setBold(true);
		style.setFont(font);
		// generar los datos para el documento
		XSSFRow row3 = hoja3.createRow(0);// se crea las filas
		for (int j = 0; j < header3.length; j++) {
			XSSFCell cell = row3.createCell(j);// se crea las celdas para la cabecera, junto con la posición
			cell.setCellStyle(style); // se añade el style crea anteriormente
			cell.setCellValue(header3[j]);// se añade el contenido
		}
		
		XSSFSheet hoja4 = libro.createSheet(hojaGeneral);
		// cabecera de la hoja de excel
		String[] header4 = new String[] {"TRAN_ID","PUVE_ID","DISP_ID","MAYO_ID","DIST_ID","COME_ID","PROD_ID","TRAN_VALOR","TRAN_FECHAREGISTRO","TRAN_REGISTRADOPOR","TRAN_TRACE","TRANFECHATRANSACCION","TRAN_TIPO","TRAN_ESTADO","TRAN_PREAPROBADA","TRAN_FECHA",estado,"","MOVI_ID","TIMO_ID","CUEN_ID","TRAN_ID","MOVI_SALDOINICIAL","MOVI_SOBREGIROINICIAL","MOVI_VALOR","MOVI_COMISION","MOVI_SALDOFINAL","MOVI_SOBREGIROFINAL","MOVI_FECHAMOVIMIENTO","MOVI_FECHA","TMCU_ID","TIMO_ID","TIMO_DESCRIPCION","TIMO_CODIGOCONTABLE","TIMO_VER","TIMO_CONTRAPARTIDA","TIMO_NATURALEZA","TIMO_CONTRAPOS"
				,"TIMO_REGISTRADOPOR","TIMO_FECHAREGISTRO","TIMO_PANGEACONTABLECUPOS","TIMO_PREPAGO","TIMOPOSPAGO",estado};

		// contenido de la hoja de excel

		// poner negrita a la cabecera
		font.setBold(true);
		style.setFont(font);
		// generar los datos para el documento
		XSSFRow row4 = hoja4.createRow(0);// se crea las filas
		for (int j = 0; j < header4.length; j++) {
			XSSFCell cell = row4.createCell(j);// se crea las celdas para la cabecera, junto con la posición
			cell.setCellStyle(style); // se añade el style crea anteriormente
			cell.setCellValue(header4[j]);// se añade el contenido
		}
		
		XSSFSheet hoja5 = libro.createSheet(hojaRecaudo);
		// cabecera de la hoja de excel
		String[] header5 = new String[] {"TRDA_ID","CONV_CODIGOCONVENIO","TRDA_IAC","TRDA_REFERENCIA1","TRDA_REFERENCIA2","TRAN_ID"
				,"TRDA_FECHAVENCIMIENTO","TRDA_TALON","TRDA_RESPONSE","TRDA_ERROR","TRDA_CELULAR","PVCT_CODIGO","CONV_NUMEROCUENTADESTINO"
				,"CONV_TIPOCUENTADESTINO","CONV_ID","TRDA_FECHAREGISTRO","TRDA_DETALLE1","TRDA_DETALLE2","TRDA_TIRILLA","TRDA_PDVH2H",estado};

		// contenido de la hoja de excel

		// poner negrita a la cabecera
		font.setBold(true);
		style.setFont(font);
		// generar los datos para el documento
		XSSFRow row5 = hoja5.createRow(0);// se crea las filas
		for (int j = 0; j < header5.length; j++) {
			XSSFCell cell = row5.createCell(j);// se crea las celdas para la cabecera, junto con la posición
			cell.setCellStyle(style); // se añade el style crea anteriormente
			cell.setCellValue(header5[j]);// se añade el contenido
		}
		
		file = new File(rutaArchivo);
		try (FileOutputStream fileOuS = new FileOutputStream(file)) {
			if (file.exists()) {
				if (! file.delete ()) {
					
				  }
			}
			libro.write(fileOuS);
			fileOuS.flush();
			fileOuS.close();			

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}