package StepsObject;

import PageObjects.Search223_Page;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class Search223_Steps {

    @Then("User clicks button settings")
    public void user_clicks_button_settings () {
        element(byXpath(Search223_Page.settings)).click();
    }
}
