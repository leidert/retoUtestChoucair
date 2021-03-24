package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import static co.com.choucair.certification.proyectoutest.userinterface.UtestPasswordPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FinalDataRegister implements Task {

    UtestData userData;

    public FinalDataRegister(UtestData userData) {
        this.userData = userData;
    }

    public static FinalDataRegister the(UtestData utestData) {
        return Tasks.instrumented(FinalDataRegister.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(userData.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(userData.getConfirmPassword()).into(CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(TERM_OF_USE),
                Click.on(PRIVACY_POLICY),
                Click.on(BUTTON_COMPLETED));
    }
}
