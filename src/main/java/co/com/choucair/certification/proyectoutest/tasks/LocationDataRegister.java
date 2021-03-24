package co.com.choucair.certification.proyectoutest.tasks;

import static co.com.choucair.certification.proyectoutest.userinterface.UtestLocationPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LocationDataRegister implements Task {



    public static LocationDataRegister withAutomateDetection() {
        return Tasks.instrumented(LocationDataRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(AUTO_DETECTED_LOCATION, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_NEX_DEVICES));
    }
}
