package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userInterface.LoguinPage;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Loguin implements Task {
    private String user;
    private String password;

    public Loguin(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public static Loguin OnThePage(String user, String password) {
        return Tasks.instrumented(Loguin.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoguinPage.USER_INPUT, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(user).into(LoguinPage.USER_INPUT),
                Enter.theValue(password).into(LoguinPage.PASSWORD_INPUT),
                Click.on(LoguinPage.GET_IN_BUTTON));

    }


}
