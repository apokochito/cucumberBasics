package Hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void InitializeTest(){
        System.out.println("Opening the browser : MOCK");
    }

    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed() == true){
            System.out.println("Taking ScreenShot");
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
    }
}
