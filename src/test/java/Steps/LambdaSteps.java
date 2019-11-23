package Steps;

import cucumber.api.java8.En;

public class LambdaSteps implements En {
    public LambdaSteps() {
        And("^I want to see how this step looks with cucumber-java8$", () -> {
            System.out.println("This is a step using lambdas with Java 8");
        });
    }
}
