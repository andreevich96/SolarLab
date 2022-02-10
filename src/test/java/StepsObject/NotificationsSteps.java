package StepsObject;

import PageObjects.MainRtsPage;
import PageObjects.ParticipantsPage;
import PageObjects.Search223_Page;
import PageObjects.SettingsModal;
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

    @Then ("Press checkbox eliminate joint procurement")
    public void press_checkbox_eliminate_joint_procurement () {
        element(byXpath(SettingsModal.eliminateJointProcurement)).click();
    }

    @Then ("Press checkbox 615-PP RF")
    public void press_checkbox_615_PP_RF () {
        element(byXpath(SettingsModal.PP_615RF)).click();
    }

    @Then ("Press opening modal section date filters")
    public void press_opening_modal_section_date_filters () {
        element(byXpath(SettingsModal.modalSectionDateFilters)).click();
    }

    @And ("Press datepicker application submission to")
    public void press_datepicker_application_submission_to () {
        element(byXpath(SettingsModal.applicationSubmissionTo)).click();
    }

    @And ("Choose today date")
    public void choose_today_date () {
        element(byXpath(SettingsModal.todayDate)).click();
    }

    @Then ("Press opening modal section delivery region")
    public void press_opening_modal_section_delivery_region () {
        element(byXpath(SettingsModal.modalSectionDeliveryRegion)).click();
    }

    @And ("Press checkbox arkhangelsk region")
    public void press_checkbox_arkhangelsk_region () {
        element(byXpath(SettingsModal.arkhangelskRegion)).click();
    }

    @Then ("Press button search")
    public void press_button_search () {
        element(byXpath(SettingsModal.search)).click();
    }


//    @And("Close browser")
//    public void close_browser () {
//        closeWindow();
//        closeWebDriver();
//    }

}
