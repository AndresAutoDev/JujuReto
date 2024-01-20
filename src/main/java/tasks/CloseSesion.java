package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userInterface.HomePage.*;

public class CloseSesion implements Task {

    public static CloseSesion finishSeson() {
        return Tasks.instrumented(CloseSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PROFILE_BTN),
                Click.on(END_SESION_BTN)
        );
    }
}
