package StepsObject;

import PageObjects.Search223_Page;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class Search223_Steps extends BaseStep {

    private Logger logger = GetLogger(Search223_Steps.class.getName());

    @Then("User clicks button settings")
    public void user_clicks_button_settings () {
        element(byXpath(Search223_Page.settings)).click();

        logger.info("Успешный переход в 'Настройки'.");
    }
}
