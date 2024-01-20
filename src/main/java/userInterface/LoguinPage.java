package userInterface;

import net.serenitybdd.screenplay.targets.Target;
public class LoguinPage {
    public static final Target USER_INPUT = Target.the("Ingresar el usuario")
            .locatedBy("//input[@id='userName']");

    public static final Target PASSWORD_INPUT = Target.the("Ingresar la contraseña")
            .locatedBy("//input[@id='password']");

    public static final Target GET_IN_BUTTON = Target.the("Boton de entrar")
            .locatedBy("//button[contains(text(),'Entrar')]");

    public static final Target INCORRECT_USER_TXT = Target.the("Msg de usuario incorrecto")
            .locatedBy("//p[contains(text(),'Usuario o contraseña incorrectos.')]");
}
