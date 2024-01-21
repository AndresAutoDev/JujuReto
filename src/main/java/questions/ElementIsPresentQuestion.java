package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class ElementIsPresentQuestion implements Question<Boolean> {
    private final Target elemento;

    public ElementIsPresentQuestion(Target elemento) {
        this.elemento = elemento;
    }

    public static ElementIsPresentQuestion inThePage(Target elemento) {
        return new ElementIsPresentQuestion(elemento);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(elemento, isPresent())
        );
        return elemento.resolveFor(actor).isVisible();
    }
}
