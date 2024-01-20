package stepDefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.Catalog;
import static utils.Constants.*;
public class CatalogStepDefinition {
    @Dado("^que el usuario selecciona el apartado de catalogo$")
    public void queElUsuarioSeleccionaElApartadoDeCatalogo() {
        OnStage.theActorCalled(ACTOR).attemptsTo(Catalog.Carrusel());
    }

    @Cuando("^selecciona la opcion de ver mas$")
    public void seleccionaLaOpcionDeVerMas() {

    }

    @Entonces("^es redirigido a la seccion de catalogo y visualiza el catalogo$")
    public void esRedirigidoALaSeccionDeCatalogoYVisualizaElCatalogo() {

    }

}
