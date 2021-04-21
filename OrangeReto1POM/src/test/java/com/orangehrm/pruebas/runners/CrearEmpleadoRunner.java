package com.orangehrm.pruebas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.orangehrm.pruebas.stepdefinitions",
        features = "src/test/resources/com.orangehrm.pruebas/agregar_empleado.feature",
        snippets = SnippetType.CAMELCASE
)
public class CrearEmpleadoRunner {
}
