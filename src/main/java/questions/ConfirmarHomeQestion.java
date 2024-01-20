package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userInterface.HomePage.*;
import static utils.Constants.MSG_BIENVENIDA;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmarHomeQestion implements Question<Boolean> {

    private final Target target;
    private final String expectedMessage;

    private ConfirmarHomeQestion(Target target, String expectedMessage) {
        this.target = target;
        this.expectedMessage = expectedMessage;
    }

    public static ConfirmarHomeQestion withExpectedMessage(Target target, String expectedMessage) {
        return new ConfirmarHomeQestion(target, expectedMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(target, isVisible()).forNoMoreThan(15).seconds();
        String actualMessage = target.resolveFor(actor).getText();
        String cleanedActualMessage = actualMessage.replace("\n", "").trim();
        return cleanedActualMessage.equals(expectedMessage);
    }
}
