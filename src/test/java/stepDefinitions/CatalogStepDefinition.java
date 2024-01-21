package stepDefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.CompareQestion;
import questions.ElementIsPresentQuestion;
import tasks.Catalog;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static userInterface.CatalogPage.*;
import static utils.Constants.*;

public class CatalogStepDefinition {
    @Dado("^que el usuario selecciona el apartado de catalogo y de clic en ver mas$")
    public void queElUsuarioSeleccionaElApartadoDeCatalogoYDeClicEnVerMas() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Catalog.VerCatalogo(true));
    }

    @Cuando("^selecciona la opcion de ver mas$")
    public void seleccionaLaOpcionDeVerMas() {

    }

    @Entonces("^es redirigido a la seccion de catalogo y visualiza el catalogo$")
    public void esRedirigidoALaSeccionDeCatalogoYVisualizaElCatalogo() {
        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (CATALOGO_TXT, MSG_CATALOG_SESON), equalTo(true)));

        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (AMOUNT_TXT, MSG_AMOUNT), equalTo(true)));
    }

    @Dado("^que el usuario este en el apartado de catalogo$")
    public void queElUsuarioEsteEnElApartadoDeCatalogo() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Catalog.VerCatalogoSinClickVerMas());
    }

    @Entonces("^visualiza los productos destacados$")
    public void visualizaLosProductosDestacados() {
        OnStage.theActorCalled(ACTOR).should(seeThat(CompareQestion.withExpectedMessage
                (PRODUCTOS_DESTACADOS_TXT, MSG_PRODUCTOS), equalTo(true)));
        OnStage.theActorCalled(ACTOR).should(seeThat(ElementIsPresentQuestion.inThePage(CATALOG_CARRUSEL_BTN)));
    }

}
