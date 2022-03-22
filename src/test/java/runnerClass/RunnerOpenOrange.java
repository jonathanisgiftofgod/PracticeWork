package runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features="C:\\Users\\Britto\\eclipse-workspace\\PracticeWork\\featureFile\\openOrange.feature"
						,glue = "stepDef", monochrome=true, dryRun= false)
@RunWith(Cucumber.class)
public class RunnerOpenOrange {

}
