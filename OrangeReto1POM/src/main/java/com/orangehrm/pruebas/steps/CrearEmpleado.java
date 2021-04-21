package com.orangehrm.pruebas.steps;

import com.orangehrm.pruebas.pageobject.DatosEmpleadoPageObject;
import com.orangehrm.pruebas.pageobject.MenuPageObject;
import com.orangehrm.pruebas.pageobject.LoginPageObject;
import com.orangehrm.pruebas.utils.MetodosGenericos;
import cucumber.api.PendingException;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CrearEmpleado {

    private LoginPageObject login=new LoginPageObject();
    private MenuPageObject menu=new MenuPageObject();
    private DatosEmpleadoPageObject datosEmpleado=new DatosEmpleadoPageObject();
    private MetodosGenericos genericos=new MetodosGenericos();
    WebDriver driver;
    WebDriverWait wait;

    @Step
    public void ingresarAPagina(){
        wait= new WebDriverWait(login.getDriver(), 30);
        login.getDriver().get("https://orangehrm-demo-6x.orangehrmlive.com/");
        driver=login.getDriver();
    }

    @Step
    public void EsperarElemento(By elemento){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(elemento)));
    }

    @Step
    public void ValidarIngresoPagina(){
        if(!driver.findElement(login.getLblPaginaOrange()).isDisplayed()){
            throw new PendingException("No estamos dentro de la pagina web");
        }
    }

    @Step
    public void clicLogin(){
        genericos.clicElemento(login.getBtnLogin(),driver);
    }

    @Step
    public void clicMenuPIM(){
        genericos.clicElemento(menu.getBtnMenuPIM(),driver);
    }

    @Step
    public void clicAgregarEmpleado(){
        genericos.clicElemento(menu.getBtnAgregarEmpleado(),driver);
    }

    @Step
    public void validarPantallaAgregarEmpleado()throws Exception{
        Thread.sleep(15000);
        Thread.currentThread().interrupt();
        EsperarElemento(datosEmpleado.getLblCampoNombre());
        if(!driver.findElement(datosEmpleado.getLblCampoNombre()).isDisplayed()) {
            throw new PendingException("No estamos dentro de la pantalla");
        }
    }

    @Step
    public void ingresarPrimerNombre() throws Exception{
        String nombre= genericos.leerFichero(0,1);
        genericos.IngresaDato(datosEmpleado.getTxtPrimerNombre(),driver,nombre);
    }

    @Step
    public void ingresarSegundoNombre()throws Exception{
        String nombre_dos= genericos.leerFichero(1,1);
        genericos.IngresaDato(datosEmpleado.getTxtSegundoNombre(),driver,nombre_dos);
    }

    @Step
    public void ingresarApellidos()throws Exception{
        String apellido= genericos.leerFichero(2,1);
        genericos.IngresaDato(datosEmpleado.getTxtApellidos(),driver,apellido);
    }

    @Step
    public void seleccionarLocalidad()throws Exception{
        String Localidad= genericos.leerFichero(3,1);
        genericos.seleccionarElementoLista(datosEmpleado.getBtnlocalizacion(),datosEmpleado.getLstlocalizacion(),driver,Localidad);
    }

    @Step
    public void clicSwitchCreateLogin(){
        genericos.clicElemento(datosEmpleado.getSwchCrearDetallesLogin(),driver);
    }

    @Step
    public void ingresarUserName() throws Exception{
        String userName= genericos.leerFichero(4,1);
        genericos.IngresaDato(datosEmpleado.getTxtUserName(),driver,userName);
    }

    @Step
    public void ingresarPassword()throws Exception{
        String password= genericos.leerFichero(5,1);
        genericos.IngresaDato(datosEmpleado.getTxtPassword(),driver,password);
    }

    @Step
    public void ingresarConfirmarPassword()throws Exception{
        String confirmarPassword= genericos.leerFichero(6,1);
        genericos.IngresaDato(datosEmpleado.getTxtConfirmarPassword(),driver,confirmarPassword);
    }

    @Step
    public void seleccionarRol()throws Exception{
        String rol= genericos.leerFichero(7,1);
        genericos.seleccionarElementoLista(datosEmpleado.getBtnRol(),datosEmpleado.getLstRol(),driver,rol);
    }

    @Step
    public void clicBotonNext()throws Exception{
        if(driver.findElement(datosEmpleado.getBtnRol()).isDisplayed()) {
            Thread.sleep(5000);
            genericos.clicElemento(datosEmpleado.getBtnNext(), driver);
            Thread.currentThread().interrupt();
        }else
        {
            throw new PendingException("elemento no visible");
        }
    }

    @Step
    public void ingresarHobbies()throws Exception{
        Thread.sleep(5000);
        genericos.IngresaDato(datosEmpleado.getTxtHobbies(),driver,"jugar");
        Thread.currentThread().interrupt();
    }


    @Step
    public void verificarEtiqueta() throws Exception{
        Thread.sleep(5000);
        if(driver.findElement(datosEmpleado.getLblPersonalDetails()).isDisplayed()) {
            EsperarElemento(datosEmpleado.getLblPersonalDetails());
        }
        String mensajeValidar= genericos.leerFichero(8,1);
        Assert.assertThat(login.getDriver().findElement(datosEmpleado.getLblPersonalDetails()).getText(), Matchers.is(mensajeValidar));
    }

    @Step
    public void verificarEtiquetaEmployed() throws Exception{
        Thread.sleep(10000);
        String mensajeValidar= genericos.leerFichero(9,1);
        Assert.assertThat(login.getDriver().findElement(datosEmpleado.getLblEmploymentDetails()).getText(), Matchers.is(mensajeValidar));
    }

    @Step
    public void clicBotonNextDos()throws Exception{
            Thread.sleep(5000);
            genericos.clicElemento(datosEmpleado.getBtnNext(), driver);
            Thread.currentThread().interrupt();

    }

}
