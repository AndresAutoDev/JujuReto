package userInterface;
import net.serenitybdd.screenplay.targets.Target;
public class CatalogPage {
    public static final Target CATALOG_CARRUSEL_BTN = Target.the("Mensaje de bienvenida y boton para ir a " +
                    "cuenta o cerrar sesion")
          //  .locatedBy("//*[@class='product-card mat-card']//following-sibling::button//following-sibling::span[contains(text(), 'Agregar al carrito')]/ancestor::div[@class='item active']");
            //.locatedBy("//div[@class='item active']//descendant::button//following-sibling::span[contains(text(), 'Agregar al carrito')][1]");
            .locatedBy("//div[@class='item active']//descendant::a[contains(text(), 'Ver Detalle')][1]");

}
