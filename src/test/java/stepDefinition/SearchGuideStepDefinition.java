package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchGuideStepDefinition {
    @Given("^El usuario abrela pagina web$")
    public void elUsuarioAbrelaPaginaWeb() {
    }

    @When("^El usuario ingrea un codigo valido (.*)$")
    public void elUsuarioIngreaUnCodigoValidoCodigoCorrecto(String data) {
    }

    @Then("^El usuario ve la guia de seguimiento (.*)$")
    public void elUsuarioVeLaGuiaDeSeguimientoTextoValidacion(String data) {
    }
}
