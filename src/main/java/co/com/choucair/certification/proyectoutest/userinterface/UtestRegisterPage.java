package co.com.choucair.certification.proyectoutest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegisterPage {
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to register")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("first name field")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Last name field")
            .located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS = Target.the("Email field")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH= Target.the("birth month field")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY= Target.the("birth day field")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR= Target.the("birth year field")
            .located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON= Target.the("button that takes us to the address fields")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[2]/a/span"));
}
