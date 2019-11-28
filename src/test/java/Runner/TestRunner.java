package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
glue = {"Steps","Hooks","Pages", "Utils"},
plugin = {"html:target/cucumber-html-report", "json:target/json-report/cucumber-json-report.json" } )
public class TestRunner extends AbstractTestNGCucumberTests {
}
