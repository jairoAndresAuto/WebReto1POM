package com.orangehrm.pruebas.pageobject;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://orangehrm-demo-6x.orangehrmlive.com/")
public class LoginPageObject extends PageObject {

    By btnLogin= By.id("btnLogin");
    By lblPaginaOrange=By.xpath("//a[contains(.,'OrangeHRM, Inc')]");

    public LoginPageObject() {
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(By btnLogin) {
        this.btnLogin = btnLogin;
    }

    public By getLblPaginaOrange() {
        return lblPaginaOrange;
    }

    public void setLblPaginaOrange(By lblPaginaOrange) {
        this.lblPaginaOrange = lblPaginaOrange;
    }
}
