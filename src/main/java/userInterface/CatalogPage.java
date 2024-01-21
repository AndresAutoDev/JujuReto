package userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogPage {
    public static final Target CATALOG_CARRUSEL_BTN = Target.the("Mensaje de bienvenida " +
                    "y boton para ir a cuenta o cerrar sesion")
            .locatedBy("//div[@class='item active']//descendant::a[contains(text(), 'Ver Detalle')][1]");
    public static final Target VER_MAS_BTN = Target.the("Boton de ver mas en catalogo")
            .locatedBy("//*[contains(text(), '+ Ver más')]");
    public static final Target CATALOGO_TXT = Target.the("Titulo del apartado de catalogo")
            .locatedBy("//h2[contains(text(), ' Catálogo ')]");

    public static final Target AMOUNT_TXT = Target.the("Cantidad de dots para redimir")
            .locatedBy("//h2[contains(text(), '0')]");

    public static final Target PRODUCTOS_DESTACADOS_TXT = Target.the("Seccion de productos destacados")
            .locatedBy("//h2[contains(text(), ' Productos destacados ')]");
}
