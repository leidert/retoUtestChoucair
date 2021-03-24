package co.com.choucair.certification.proyectoutest.stepdefinitions;

import co.com.choucair.certification.proyectoutest.model.UtestData;
import co.com.choucair.certification.proyectoutest.questions.VerifyRegistration;
import co.com.choucair.certification.proyectoutest.tasks.*;
import static co.com.choucair.certification.proyectoutest.util.Constant.ZERO;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import java.util.List;

public class UtestStepDefinitions {



    @Given("^which (.*) wants to register on the Utest page$")
    public void whichLeiderWantsToRegisterOnTheUtestPage( String leider) {
        theActorCalled(leider).wasAbleTo(OpenUp.thePage(), (UtestRegister.onThePage()));
    }

    @When("^leider enters the registration data$")
    public void leiderEntersTheRegistrationData(List<UtestData> userData) {
        theActorInTheSpotlight().attemptsTo(RegisterUserData.withThe(userData.get(ZERO)), LocationDataRegister.withAutomateDetection(),
                DeviceDataRegister.autoDetected(), FinalDataRegister.the(userData.get(ZERO)));
    }

    @Then("^He verifies the (.*) on the screen$")
    public void heVerifiesTheOnTheScreen(String message) {
        theActorInTheSpotlight().should(seeThat(VerifyRegistration.withThe(message)));
    }
}
