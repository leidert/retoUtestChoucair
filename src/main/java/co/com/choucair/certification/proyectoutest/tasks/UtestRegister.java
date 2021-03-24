package co.com.choucair.certification.proyectoutest.tasks;

import static co.com.choucair.certification.proyectoutest.userinterface.UtestRegisterPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class UtestRegister implements Task {

    public static  UtestRegister onThePage(){
        return Tasks.instrumented(UtestRegister.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JOIN_BUTTON));

    }
}
