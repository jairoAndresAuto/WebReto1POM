package com.orangehrm.pruebas.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class MetodosGenericos {

    private LeerFichero leerFichero=new LeerFichero();

    public MetodosGenericos() {
    }

    public String leerFichero(int columna, int fila) throws IOException {
        String dato =leerFichero.leerDatoExcel("Hoja1", "OrangeData.xlsx", columna, fila);
        return dato;
    }

    public void clicElemento(By elementoPaagina, WebDriver driver)  {
         driver.findElement(elementoPaagina).click();
    }

    public void IngresaDato(By elementoPaagina, WebDriver driver,String dato)  {
        driver.findElement(elementoPaagina).sendKeys(dato);
    }

    public void seleccionarElementoLista(By elementoPaaginaClic,By listPaaginaClic, WebDriver driver,String dato){
        clicElemento(elementoPaaginaClic,driver);
        List<WebElement> listLocation=driver.findElements(listPaaginaClic);
        for (WebElement locatio:listLocation) {
            if(locatio.getText().equals(dato)){
                locatio.click();
                break;
            }
        }
    }

}
