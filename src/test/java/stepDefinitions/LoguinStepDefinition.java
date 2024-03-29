package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.CompareQestion;
import tasks.CloseSesion;
import tasks.Loguin;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static userInterface.HomePage.*;
import static userInterface.LoguinPage.*;
import static utils.Constants.*;

public class LoguinStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR);
    }

    @Dado("^el usuario ingreso a la plataforma$")
    public void elUsuarioIngresoALaPlataforma() {
        OnStage.theActorCalled(ACTOR).wasAbleTo(Open.url(PAGINA_WEB));
    }

    @Cuando("^el usuario ingrese \"([^\"]*)\" \"([^\"]*)\" y oprima entrar$")
    public void elUsuarioIngreseYOprimaEntrar(String user, String password) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Loguin.OnThePage(USER, PASSWORD));

    }

    @Entonces("^el usuario es redirigido a la pagina de inicio y visualiza el mensaje de bienvenida$")
    public void elUsuarioEsRedirigidoALaPaginaDeInicioYVisualizaElMensajeDeBienvenida() {
        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (PROFILE_BTN, MSG_BIENVENIDA), equalTo(true)));
    }

    @Entonces("^el usuario cierra sesion$")
    public void elUsuarioCierraSesion() {
        OnStage.theActorCalled(ACTOR).attemptsTo(CloseSesion.finishSeson());
        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (NAME_USER_TXT, MSG_LOGUIN_INICIO), equalTo(true)));
    }

    @Cuando("^el usuario ingrese \"([^\"]*)\" \"([^\"]*)\" incorrectas y oprima entrar$")
    public void elUsuarioIngreseIncorrectasYOprimaEntrar(String user, String password) {
        OnStage.theActorCalled(ACTOR).attemptsTo(Loguin.OnThePage(PASSWORD, PASSWORD_INCORRECT));
    }

    @Entonces("^el usuario visualiza el mensaje de credenciales incorrectas$")
    public void elUsuarioVisualizaElMensajeDeCredencialesIncorrectas() {
        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (INCORRECT_USER_TXT, MSG_CREDENCIALES_INCORRECTAS), equalTo(true)));
    }
}
