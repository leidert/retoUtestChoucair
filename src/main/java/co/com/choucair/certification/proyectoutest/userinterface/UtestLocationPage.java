package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLocationPage {

    public static final Target BUTTON_NEX_DEVICES = Target.the("next button for device registration")
            .located(By.xpath("//*[contains(text(),'Next: Devices')]"));
    public static final Target AUTO_DETECTED_LOCATION = Target.the("auto detection validation")
            .located(net.serenitybdd.core.annotations.findby.By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[1]/span[2]"));
}