package StepsObject;

import PageObjects.ParticipantsPage;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class ParticipantsSteps extends BaseStep {

    private Logger logger = GetLogger(ParticipantsSteps.class.getName());

    @Then("User clicks button advanced search")
    public void user_clicks_button_advanced_search() {
        element(byXpath(ParticipantsPage.advancedSearch)).click();

        logger.info("Успешный переход в 'Расширенный поиск'.");
    }
}
