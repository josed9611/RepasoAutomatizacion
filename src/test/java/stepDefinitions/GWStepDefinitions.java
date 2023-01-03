package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.StepPaginaPrincipal;

import java.io.IOException;

public class GWStepDefinitions {


    @Steps
    StepPaginaPrincipal paginaPrincipal ;

    @Given("^ingreso a Linio e inicio sesion$")
    public void ingreso_a_Linio_e_inicio_sesion() {
        paginaPrincipal.abrir_navegador();
    }

    @When("^me encuentro en Linio$")
    public void me_encuentro_en_Linio() throws IOException {

       paginaPrincipal.InicioSesion();
       paginaPrincipal.ingresoCorreoyContrasena();
       paginaPrincipal.compras();
       paginaPrincipal.busquedaproducto();
       paginaPrincipal.validacionProducto();



    }

    @Then("^busco producto y lo agrego al carrito$")
    public void busco_producto_y_lo_agrego_al_carrito() {

    }

}
