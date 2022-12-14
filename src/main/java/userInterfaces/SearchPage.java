package userInterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://brave-forest-074656b0f.2.azurestaticapps.net/#/cargo/awb-tracking")
public class SearchPage extends PageObject {
    public static final Target searchInput = Target.the("entrada de busqueda").
            located(By.xpath("//input[contains(@aria-label,'Air Waybill Number')]"));
    public static final Target searchButton = Target.the("boton de busqueda").
            located(By.xpath("//span[@class='block'][text()='Search']"));

    public static final Target detailLbl = Target.the("etiqueta de respuesta").
            located(By.xpath("//p[text()='AWB Details']"));

    public static final Target modal = Target.the("modal").located(By.id("cardContent"));

    public static final Target messageModal = Target.the("mensaje de no encontrado").
            located(By.xpath("//DIV[@class='q-mb-lg'][text()='Could not find AWB 354-4556. Please check your request and try again.']"));

    public static final Target modalButton = Target.the("boton modal").
            located(By.xpath("(//span[@class='q-btn__wrapper col row q-anchor--skip'])[2]"));

}
