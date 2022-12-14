package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userInterfaces.SearchPage;

public class SearchPageQuestion implements Question<Boolean> {

    private final String textoValido;

    public SearchPageQuestion(String textoValido) {
        this.textoValido = textoValido;
    }

    public static SearchPageQuestion searchPageQuestionInstrumented(String data) {
        return new SearchPageQuestion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(SearchPage.detailLbl).viewedBy(actor).asString().equals(this.textoValido);
    }
}
