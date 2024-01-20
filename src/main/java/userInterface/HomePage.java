package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {
    public static final Target PROFILE_BTN = Target.the("Mensaje de bienvenida y boton para ir a " +
                    "cuenta o cerrar sesion")
            .locatedBy("//*[contains(text(), ' Hola,')]");

    public static final Target END_SESION_BTN = Target.the("boton para cerrar sesion")
            .locatedBy("//*[contains(text(), ' Cerrar sesión')]");
}
