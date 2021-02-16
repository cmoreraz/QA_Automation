package co.com.choucair.certification.academy.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(   features = "src/test/resources/features/academyChoucair.feature",
                    glue = "co.com.choucair.certification.academy.stepdefinitions"
)
public class RunnerTags {

}
