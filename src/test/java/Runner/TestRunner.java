package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
glue = {"Steps","Hooks","Pages","Base"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
