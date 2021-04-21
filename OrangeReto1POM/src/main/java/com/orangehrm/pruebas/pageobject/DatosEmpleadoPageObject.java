package com.orangehrm.pruebas.pageobject;

import org.openqa.selenium.By;

public class DatosEmpleadoPageObject{

    By btnAgregarMas=By.id("addEmployeeButton");
    By lblCampoNombre=By.xpath("//label[contains(.,'Employee Full')]");
    By txtPrimerNombre=By.id("first-name-box");
    By txtSegundoNombre=By.id("middle-name-box");
    By txtApellidos=By.id("last-name-box");
    By btnlocalizacion=By.xpath("(//button[@class='btn dropdown-toggle'])[1]");
    By lstlocalizacion=By.xpath("//*[@class='dropdown-item']//span");
    By swchCrearDetallesLogin=By.xpath("//*[@class='custom-control custom-switch']");
    By txtUserName=By.id("username");
    By txtPassword=By.id("password");
    By txtConfirmarPassword=By.id("confirmPassword");
    By btnRol=By.xpath("(//button[@class='btn dropdown-toggle'])[4]");
    By lstRol=By.xpath("//a[@class='dropdown-item']//span");
    By btnNext=By.xpath("//button[contains(.,'Next')]");
    By lblPersonalDetails=By.xpath("//h4[contains(.,'Personal')]");
    By txtHobbies=By.xpath("//*[@id='5']");
    By lblEmploymentDetails=By.xpath("//h4[contains(.,'Employment Details')]");

    public DatosEmpleadoPageObject() {
    }

    public By getBtnAgregarMas() {
        return btnAgregarMas;
    }

    public void setBtnAgregarMas(By btnAgregarMas) {
        this.btnAgregarMas = btnAgregarMas;
    }

    public By getLblCampoNombre() {
        return lblCampoNombre;
    }

    public void setLblCampoNombre(By lblCampoNombre) {
        this.lblCampoNombre = lblCampoNombre;
    }

    public By getTxtPrimerNombre() {
        return txtPrimerNombre;
    }

    public void setTxtPrimerNombre(By txtPrimerNombre) {
        this.txtPrimerNombre = txtPrimerNombre;
    }

    public By getTxtSegundoNombre() {
        return txtSegundoNombre;
    }

    public void setTxtSegundoNombre(By txtSegundoNombre) {
        this.txtSegundoNombre = txtSegundoNombre;
    }

    public By getTxtApellidos() {
        return txtApellidos;
    }

    public void setTxtApellidos(By txtApellidos) {
        this.txtApellidos = txtApellidos;
    }

    public By getBtnlocalizacion() {
        return btnlocalizacion;
    }

    public void setBtnlocalizacion(By btnlocalizacion) {
        this.btnlocalizacion = btnlocalizacion;
    }

    public By getLstlocalizacion() {
        return lstlocalizacion;
    }

    public void setLstlocalizacion(By lstlocalizacion) {
        this.lstlocalizacion = lstlocalizacion;
    }

    public By getSwchCrearDetallesLogin() {
        return swchCrearDetallesLogin;
    }

    public void setSwchCrearDetallesLogin(By swchCrearDetallesLogin) {
        this.swchCrearDetallesLogin = swchCrearDetallesLogin;
    }

    public By getTxtUserName() {
        return txtUserName;
    }

    public void setTxtUserName(By txtUserName) {
        this.txtUserName = txtUserName;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(By txtPassword) {
        this.txtPassword = txtPassword;
    }

    public By getTxtConfirmarPassword() {
        return txtConfirmarPassword;
    }

    public void setTxtConfirmarPassword(By txtConfirmarPassword) {
        this.txtConfirmarPassword = txtConfirmarPassword;
    }

    public By getBtnRol() {
        return btnRol;
    }

    public void setBtnRol(By btnRol) {
        this.btnRol = btnRol;
    }

    public By getLstRol() {
        return lstRol;
    }

    public void setLstRol(By lstRol) {
        this.lstRol = lstRol;
    }

    public By getBtnNext() {
        return btnNext;
    }

    public void setBtnNext(By btnNext) {
        this.btnNext = btnNext;
    }

    public By getLblPersonalDetails() {
        return lblPersonalDetails;
    }

    public void setLblPersonalDetails(By lblPersonalDetails) {
        this.lblPersonalDetails = lblPersonalDetails;
    }

    public By getTxtHobbies() {
        return txtHobbies;
    }

    public void setTxtHobbies(By btnHobbies) {
        this.txtHobbies = btnHobbies;
    }

    public By getLblEmploymentDetails() {
        return lblEmploymentDetails;
    }

    public void setLblEmploymentDetails(By lblEmploymentDetails) {
        this.lblEmploymentDetails = lblEmploymentDetails;
    }
}
