package StepsObject;

import PageObjects.ParticipantsPage;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class ParticipantsSteps {

    @Then("User clicks button advanced search")
    public void user_clicks_button_advanced_search() {
        element(byXpath(ParticipantsPage.advancedSearch)).click();
    }
}
