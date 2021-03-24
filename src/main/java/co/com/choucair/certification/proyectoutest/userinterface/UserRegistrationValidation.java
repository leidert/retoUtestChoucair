package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UserRegistrationValidation  {
    public static final Target MESSAGE_ON_SCREEN = Target.the("message to verify on screen")
            .located(By.xpath("//*[@id='mainContent']/div/div/div[1]/div/h1"));
}
