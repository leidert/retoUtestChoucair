package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import static co.com.choucair.certification.proyectoutest.userinterface.UtestRegisterPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class RegisterUserData implements Task {

    private UtestData userData;

    public RegisterUserData(UtestData userData) {
        this.userData = userData;
    }

    public static RegisterUserData withThe(UtestData userData) {
        return Tasks.instrumented(RegisterUserData.class, userData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(userData.getFirtName()).into(FIRST_NAME),
                Enter.theValue(userData.getLastName()).into(LAST_NAME),
                Enter.theValue(userData.getEmailAddress()).into(EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(userData.getBirthMonth()).from(BIRTH_MONTH),
                SelectFromOptions.byVisibleText(userData.getBirthDay()).from(BIRTH_DAY),
                SelectFromOptions.byVisibleText(userData.getBirthYear()).from(BIRTH_YEAR),
                Click.on(LOCATION_BUTTON));
    }
}
