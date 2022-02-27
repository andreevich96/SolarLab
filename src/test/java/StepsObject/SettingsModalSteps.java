package StepsObject;

import PageObjects.SettingsModal;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

public class SettingsModalSteps extends LoggerForSteps {

    private Logger logger = GetLogger(SettingsModalSteps.class.getName());

    @Then("User clicks checkbox exclude joint procurement")
    public void user_clicks_checkbox_exclude_joint_procurement() {
        SettingsModal.getEliminateJointProcurement().click();

        logger.info("Успешно отмечен чек-бокс 'Исключить совместные закупки'.");
    }

    @Then("User clicks checkbox 615-PP RF")
    public void user_clicks_checkbox_615_PP_RF() {
        SettingsModal.getPP615RF().click();

        logger.info("Успешно отмечен чек-бокс '615-ПП РФ'.");
    }

    @Then("User opening modal section date filters")
    public void user_opening_modal_section_date_filters() {
        SettingsModal.getModalSectionDateFilters().click();

        logger.info("Успешно открыта модальная секция фильтрации по дате.");
    }

    @And("User clicks datepicker application submission to")
    public void user_clicks_datepicker_application_submission_to() {
        SettingsModal.getApplicationSubmissionTo().click();

        logger.info("Успешно открыто средство выбора даты.");
    }

    @And("User chooses today date")
    public void user_chooses_today_date() {
        SettingsModal.getTodayDate().click();

        logger.info("Успешно выбрана текущая дата.");
    }

    @Then("User opening modal section delivery region")
    public void user_opening_modal_section_delivery_region() {
        SettingsModal.getModalSectionDeliveryRegion().click();

        logger.info("Успешно открыта модальная секция выбора региона поставщика.");
    }

    @And("User clicks checkbox altai region")
    public void user_clicks_checkbox_altai_region() {
        SettingsModal.getAltaiRegion().click();

        logger.info("Успешно отмечен чек-бокс 'Алтайский край'.");
    }

// Для тестирования сценария. Удалить
//    @Then("Active")
//    public void active() {
//        element(byXpath("//div[@class]/label[text()='Активные']")).click();
//    }

//    Для тестирования сценария. Удалить
    @Then("User clicks choose all")
    public void userClicksChooseAll() {
        SettingsModal.getChooseAll().click();
    }

    @Then("User clicks button search")
    public void userClicksButtonSearch() {
        SettingsModal.getSearch().click();

        logger.info("Успешный переход по кноке 'Найти'.");
    }
}
