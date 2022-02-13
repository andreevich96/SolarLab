package StepsObject;

import PageObjects.SettingsModal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class SettingsModalSteps {

    @Then("User clicks checkbox exclude joint procurement")
    public void user_clicks_checkbox_exclude_joint_procurement() {
        element(byXpath(SettingsModal.eliminateJointProcurement)).click();
    }

    @Then("User clicks checkbox 615-PP RF")
    public void user_clicks_checkbox_615_PP_RF() {
        element(byXpath(SettingsModal.PP_615RF)).click();
    }

    @Then("User opening modal section date filters")
    public void user_opening_modal_section_date_filters() {
        element(byXpath(SettingsModal.modalSectionDateFilters)).click();
    }

    @And("User clicks datepicker application submission to")
    public void user_clicks_datepicker_application_submission_to() {
        element(byXpath(SettingsModal.applicationSubmissionTo)).click();
    }

    @And("User chooses today date")
    public void user_chooses_today_date() {
        element(byXpath(SettingsModal.todayDate)).click();
    }

    @Then("User opening modal section delivery region")
    public void user_opening_modal_section_delivery_region() {
        element(byXpath(SettingsModal.modalSectionDeliveryRegion)).click();
    }

    @And("User clicks checkbox altai region")
    public void user_clicks_checkbox_altai_region() {
        element(byXpath(SettingsModal.altaiRegion)).click();
    }

    // Для тестирования сценария. Удалить
    @Then("Active")
    public void active() {
        element(byXpath("//div[@class]/label[text()='Активные']")).click();
    }

    // Для тестирования сценария. Удалить
    @Then("User clicks choose all")
    public void user_clicks_choose_all() {
        element(byXpath(SettingsModal.chooseAll)).click();
    }

    @Then("User clicks button search")
    public void user_clicks_button_search() {
        element(byXpath(SettingsModal.search)).click();
    }
}
