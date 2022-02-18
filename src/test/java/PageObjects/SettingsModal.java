package PageObjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;

public class SettingsModal {
    private static String eliminateJointProcurementXPath = "//label[text()='Исключить совместные закупки']";
    public static SelenideElement getEliminateJointProcurement () {
        return element(byXpath(eliminateJointProcurementXPath));
    }

    private static String PP615RFXPath = "//label[text()='615-ПП РФ']";
    public static SelenideElement getPP615RF () {
        return element(byXpath(PP615RFXPath));
    }


    private static String modalSectionDateFiltersXPath = "//div[text()='Фильтры по датам']";
    public static SelenideElement getModalSectionDateFilters () {
        return element(byXpath(modalSectionDateFiltersXPath));
    }


    private static String applicationSubmissionToXPath = "//div[text()='ПОДАЧА ЗАЯВОК']/following::div[6]";
    public static SelenideElement getApplicationSubmissionTo () {
        return element(byXpath(applicationSubmissionToXPath));
    }


    private static String todayDateXPath = "//div[contains(@class, 'today')]";
    public static SelenideElement getTodayDate () {
        return element(byXpath(todayDateXPath));
    }


    private static String modalSectionDeliveryRegionXPath = "//div[text()='Регион поставки']";
    public static SelenideElement getModalSectionDeliveryRegion () {
        return element(byXpath(modalSectionDeliveryRegionXPath));
    }

    private static String altaiRegionXPath = "//label[text()='Алтайский край']";
    public static SelenideElement getAltaiRegion () {
        return element(byXpath(altaiRegionXPath));
    }


    private static String searchXPath = "//div[contains(@class, 'bottomCenterSearch')]//button";
    public static SelenideElement getSearch () {
        return element(byXpath(searchXPath));
    }


    // Для теста. Удалить
    private static String chooseAllXPath = "//div[text()='Регион поставки']/../../div[@class='modal-settings-row filter-helpers']/a[text()='Выбрать всё']";
    public static SelenideElement getChooseAll () {
        return element(byXpath(chooseAllXPath));
    }



}
