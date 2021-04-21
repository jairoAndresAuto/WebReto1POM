package com.orangehrm.pruebas.stepdefinitions;

import com.orangehrm.pruebas.steps.CrearEmpleado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class CrearEmpleadoStepDefinition {

    @Steps
    private CrearEmpleado crearEmpleado;

    @Dado("^el usuario ingresa a la pagina$")
    public void elUsuarioIngresaALaPagina() {
        crearEmpleado.ingresarAPagina();
        crearEmpleado.ValidarIngresoPagina();
        crearEmpleado.clicLogin();
    }

    @Cuando("^se ingresa selecciona la del menu y submenu$")
    public void seIngresaSeleccionaLaDelMenuYSubmenu() {
        crearEmpleado.clicMenuPIM();
        crearEmpleado.clicAgregarEmpleado();
    }

    @Cuando("^se llena la información de forma correcta$")
    public void seLlenaLaInformaciónDeFormaCorrecta() throws Exception{
        crearEmpleado.validarPantallaAgregarEmpleado();
        crearEmpleado.ingresarPrimerNombre();
        crearEmpleado.ingresarSegundoNombre();
        crearEmpleado.ingresarApellidos();
        crearEmpleado.seleccionarLocalidad();
        crearEmpleado.clicSwitchCreateLogin();
        crearEmpleado.ingresarUserName();
        crearEmpleado.ingresarPassword();
        crearEmpleado.ingresarConfirmarPassword();
        crearEmpleado.seleccionarRol();
        crearEmpleado.clicBotonNext();
        crearEmpleado.verificarEtiqueta();
        crearEmpleado.ingresarHobbies();
    }

    @Entonces("^Se puede validar el mensaje de exito$")
    public void sePuedeValidarElMensajeDeExito() throws Exception{
        crearEmpleado.clicBotonNextDos();
        crearEmpleado.verificarEtiquetaEmployed();
    }

}
