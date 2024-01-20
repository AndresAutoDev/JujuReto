package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.LoguinPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterface.CatalogPage.*;
import static userInterface.HomePage.CATALOG_BTN;

public class Catalog implements Task {

    public static Catalog Carrusel() {
        return Tasks.instrumented(Catalog.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATALOG_BTN),
                Click.on(CATALOG_CARRUSEL_BTN)
                //WaitUntil.the(LoguinPage.USER_INPUT, isVisible()).forNoMoreThan(15).seconds()
        );
    }
}
