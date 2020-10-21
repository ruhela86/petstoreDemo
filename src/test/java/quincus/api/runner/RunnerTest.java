package quincus.api.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"classpath:quincusFeature"},
		glue="quincus/StepDef",
		plugin="pretty"
		)
public class RunnerTest {

}
