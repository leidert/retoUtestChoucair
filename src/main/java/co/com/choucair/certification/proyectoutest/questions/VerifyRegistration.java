package co.com.choucair.certification.proyectoutest.questions;

import static co.com.choucair.certification.proyectoutest.userinterface.UserRegistrationValidation.MESSAGE_ON_SCREEN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyRegistration implements Question<Boolean> {

    private String message;

    public VerifyRegistration(String message) {
        this.message = message;
    }

    public static VerifyRegistration withThe(String message) {
        return new VerifyRegistration(message);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String expectedMessage = Text.of(MESSAGE_ON_SCREEN).viewedBy(actor).asString();
        return (message.equals(expectedMessage));
    }
}
