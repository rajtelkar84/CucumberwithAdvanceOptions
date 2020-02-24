package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features= "C:\\Users\\telkaraj\\eclipse-workspace\\CucumberProject\\src\\feature", tags="@Login, @Sendemail",  format = {"pretty"} ) // when you want to run specific feature file out of multiple feature file
@CucumberOptions(features= "C:\\Users\\telkaraj\\eclipse-workspace\\CucumberProject\\src\\feature\\Login.feature", tags="@User2",  format = {"pretty"} ) // when you want to run specific scenario out of multiple sceanrio of particular feature file
public class TestRunner {

}
