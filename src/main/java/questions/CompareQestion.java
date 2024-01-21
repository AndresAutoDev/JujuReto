package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.targets.Target;

public class CompareQestion implements Question<Boolean> {

    private final Target target;
    private final String expectedMessage;

    private CompareQestion(Target target, String expectedMessage) {
        this.target = target;
        this.expectedMessage = expectedMessage;
    }

    public static CompareQestion withExpectedMessage(Target target, String expectedMessage) {
        return new CompareQestion(target, expectedMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(target, isVisible()).forNoMoreThan(15).seconds();
        String actualMessage = target.resolveFor(actor).getText();
        String cleanedActualMessage = actualMessage.replace("\n", "").trim();
        return cleanedActualMessage.equals(expectedMessage);
    }
}
