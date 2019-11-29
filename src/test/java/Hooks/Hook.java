package Hooks;

import Utils.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    public BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest(Scenario scenario) {
        scenarioDef = base.features.createNode(scenario.getName());

        //System.out.println("Opening the browser : MOCK");
        //Passing a WebDriver dummy instance
        //base.stepInfo = "Firefox Driver";

        System.setProperty("webdriver.chrome.driver", "C:\\TEMP\\chromedriver_win32\\chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed() == true) {
            System.out.println("Taking ScreenShot");
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }
}
