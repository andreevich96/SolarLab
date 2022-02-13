package PageObjects;

public class SettingsModal {
    public static String eliminateJointProcurement = "//label[text()='Исключить совместные закупки']";
    public static String PP_615RF = "//label[text()='615-ПП РФ']";
    public static String modalSectionDateFilters = "//div[text()='Фильтры по датам']";
    public static String applicationSubmissionTo = "//div[text()='ПОДАЧА ЗАЯВОК']/following::div[6]";
    public static String todayDate = "//div[contains(@class, 'today')]";
    public static String modalSectionDeliveryRegion = "//div[text()='Регион поставки']";
    public static String altaiRegion = "//label[text()='Алтайский край']";
    public static String search = "//div[contains(@class, 'bottomCenterSearch')]//button";
    // Для теста. Удалить
    public static String chooseAll = "//div[text()='Регион поставки']/../../div[@class='modal-settings-row filter-helpers']/a[text()='Выбрать всё']";

}
