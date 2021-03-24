package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestPasswordPage {
    public static final Target INPUT_PASSWORD = Target.the("field to register password")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("field to confirm password")
            .located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED = Target.the("more information acceptance field")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERM_OF_USE = Target.the("field of acceptance of terms of use")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_POLICY = Target.the("privacy policy acceptance field")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETED = Target.the("completion button")
            .located(By.id("laddaBtn"));

}
