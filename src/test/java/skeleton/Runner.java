package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\skeleton\\casestudy2.feature",glue="skeleton",
plugin="json:C:\\NexGen Testing Stream\\eclipse-java-neon-3-win32-x86_64\\jsonreport1.json")

public class Runner {

}
