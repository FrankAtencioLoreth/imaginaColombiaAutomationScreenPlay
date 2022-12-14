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

}
