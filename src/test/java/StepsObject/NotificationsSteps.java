package StepsObject;

import PageObjects.MainRtsPage;
import PageObjects.ParticipantsPage;
import PageObjects.Search223_Page;
import io.cucumber.java.en.*;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.CollectionCondition.*;

import com.codeborne.selenide.Configuration;

public class NotificationsSteps {

    @Given("Open rts-tender.ru")
    public void open_rts_tender_ru() {
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        System.setProperty("webdriver.chrome.driver", "C:\\Program files\\chromedriver.exe");
        Configuration.startMaximized = true;
        open("https://www.rts-tender.ru/");
    }

    @When("Press link to 223 suppliers")
    public void press_link_to_223_suppliers() {
        element(byXpath(MainRtsPage.suppliers223)).click();
    }

   @Then("Press button advanced search")
    public void input_value_in_search_field() {
        element(byXpath(ParticipantsPage.advancedSearch)).click();
    }

    @Then ("Press button settings")
    public void press_button_advanced_search () {
        element(byXpath(Search223_Page.settings)).click();
    }

    @And("Close browser")
    public void close_browser () {
        closeWindow();
        closeWebDriver();
    }

}
