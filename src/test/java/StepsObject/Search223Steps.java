package StepsObject;

import PageObjects.Search223Page;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class Search223Steps extends LoggerForSteps {

    private Logger logger = GetLogger(Search223Steps.class.getName());

    @Then("User clicks button settings")
    public void userClicksButtonSettings () {
        Search223Page.getSettings().click();

        logger.info("Успешный переход в 'Настройки'.");
    }
}
