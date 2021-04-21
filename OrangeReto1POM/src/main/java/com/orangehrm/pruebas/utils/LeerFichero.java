package com.orangehrm.pruebas.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFichero {

    private XSSFWorkbook workbook;
    private FileInputStream campo;

    public LeerFichero() {
    }

    public LeerFichero(XSSFWorkbook workbook, FileInputStream campo) {
        this.workbook = workbook;
        this.campo = campo;
    }

    public String leerDatoExcel(String hoja, String ruta, int valorColumna, int valorFila) throws IOException {
        String value = null;
        campo = new FileInputStream(new File(ruta));
        workbook = new XSSFWorkbook(campo);
        Sheet sheet = workbook.getSheet(hoja);
        Row row = sheet.getRow(valorFila);
        Cell cell = row.getCell(valorColumna);
        value = cell.getStringCellValue();
        return value;
    }

}
