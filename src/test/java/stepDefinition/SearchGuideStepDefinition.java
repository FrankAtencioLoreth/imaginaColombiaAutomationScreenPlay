package stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.SearchPageQuestion;
import tasks.SearchPageTask;
import userInterfaces.SearchPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchGuideStepDefinition {

    private SearchPage searchPage = new SearchPage();
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^El usuario abrela pagina web$")
    public void elUsuarioAbrelaPaginaWeb() {
        theActorCalled("user").wasAbleTo(Open.browserOn(searchPage));
    }

    @When("^El usuario ingrea un codigo valido (.*)$")
    public void elUsuarioIngreaUnCodigoValidoCodigoCorrecto(String data) {
        theActorInTheSpotlight().wasAbleTo(
                SearchPageTask.searchPageTaskInstrumented(data)
        );
    }

    @Then("^El usuario ve la guia de seguimiento (.*)$")
    public void elUsuarioVeLaGuiaDeSeguimientoTextoValidacion(String data) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        SearchPageQuestion.searchPageQuestionInstrumented(data)
                )
        );
    }
}
