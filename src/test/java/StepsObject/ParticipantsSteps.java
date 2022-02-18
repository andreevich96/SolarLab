package StepsObject;

import PageObjects.ParticipantsPage;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class ParticipantsSteps extends LoggerForSteps {

    private Logger logger = GetLogger(ParticipantsSteps.class.getName());

    @Then("User clicks button advanced search")
    public void userClicksButtonAdvancedSearch() {
        ParticipantsPage.getAdvancedSearch().click();

        logger.info("Успешный переход в 'Расширенный поиск'.");
    }
}
