package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
glue = {"Hooks","Listeners","Pages","Steps","Transformation","Utils"},
plugin = {"html:target/cucumber-html-report", "json:target/json-report/cucumber-json-report.json"})
public class TestRunner extends AbstractTestNGCucumberTests {

    //Threads
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        //This runner is not working with parallel configuration 'cause it isn't working properly with
        //static variables of BaseUtil.java on Hook.java
        //Run testing.xml file instead
        return scenarios();
    }
}
