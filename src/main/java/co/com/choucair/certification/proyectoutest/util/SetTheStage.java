package co.com.choucair.certification.proyectoutest.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


public class SetTheStage {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
}
