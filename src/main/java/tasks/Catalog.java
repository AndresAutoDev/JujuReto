package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static userInterface.CatalogPage.*;
import static userInterface.HomePage.CATALOG_BTN;

public class Catalog implements Task {

    public static Catalog VerCatalogo(boolean b) {
        return Tasks.instrumented(Catalog.class, b);
    }

    public static Catalog VerCatalogoSinClickVerMas() {
        return Tasks.instrumented(Catalog.class, false);
    }

    private final boolean clickVerMas;

    public Catalog(boolean clickVerMas) {
        this.clickVerMas = clickVerMas;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CATALOG_BTN),
                Scroll.to(PRODUCTOS_DESTACADOS_TXT).andAlignToTop()

        );
        if (clickVerMas) {
            actor.attemptsTo(
                    Click.on(VER_MAS_BTN)
            );
        }
    }
}

