package co.com.choucair.certification.proyectoutest.tasks;

import co.com.choucair.certification.proyectoutest.userinterface.UtestOpenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    UtestOpenPage utestOpenPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestOpenPage));
    }
}
