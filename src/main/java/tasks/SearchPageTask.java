package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userInterfaces.SearchPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchPageTask implements Task {
    private final String code;

    public SearchPageTask(String code) {
        this.code = code;
    }

    public static SearchPageTask searchPageTaskInstrumented(String code) {
        return instrumented(SearchPageTask.class, code);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.code).into(SearchPage.searchInput),
                Click.on(SearchPage.searchButton)
        );
    }
}
