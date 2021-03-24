package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestDevicePage {
    public static final Target BUTTON_LAST_STEP = Target.the("button that takes us to the final record")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target AUTO_DETECTED = Target.the("auto detection validation")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/span"));


}
