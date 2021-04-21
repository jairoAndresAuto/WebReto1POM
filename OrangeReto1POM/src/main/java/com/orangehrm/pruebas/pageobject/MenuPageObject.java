package com.orangehrm.pruebas.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MenuPageObject {

    By btnMenuPIM=By.id("menu_pim_viewPimModule");
    By btnAgregarEmpleado=By.id("menu_pim_addEmployee");

    public MenuPageObject() {
    }

    public By getBtnMenuPIM() {
        return btnMenuPIM;
    }

    public void setBtnMenuPIM(By btnMenuPIM) {
        this.btnMenuPIM = btnMenuPIM;
    }

    public By getBtnAgregarEmpleado() {
        return btnAgregarEmpleado;
    }

    public void setBtnAgregarEmpleado(By btnAgregarEmpleado) {
        this.btnAgregarEmpleado = btnAgregarEmpleado;
    }

}
