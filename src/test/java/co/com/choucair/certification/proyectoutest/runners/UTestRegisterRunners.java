package co.com.choucair.certification.proyectoutest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/utest_register.feature",
        tags = "@stories",
        glue = {"co.com.choucair.certification.proyectoutest.stepdefinitions", "co.com.choucair.certification.proyectoutest.util" },
        snippets = SnippetType.CAMELCASE)
public class UTestRegisterRunners {
}