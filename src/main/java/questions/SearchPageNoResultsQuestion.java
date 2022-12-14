package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;
import userInterfaces.SearchPage;

public class SearchPageNoResultsQuestion implements Question<Boolean>  {
    private final String textoInvalido;

    public SearchPageNoResultsQuestion(String textoInvalido) {
        this.textoInvalido = textoInvalido;
    }

    public static SearchPageNoResultsQuestion searchPageNoResultsQuestionInstrumented(String data) {
        return new SearchPageNoResultsQuestion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if(Visibility.of(SearchPage.modal).viewedBy(actor).asBoolean()) {
            if (Text.of(SearchPage.messageModal).viewedBy(actor).asString().equals(this.textoInvalido)) {
                actor.attemptsTo(
                        Click.on(SearchPage.modalButton)
                );
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }

    }
}
