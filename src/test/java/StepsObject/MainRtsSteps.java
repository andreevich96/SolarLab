package StepsObject;

import PageObjects.MainRtsPage;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class MainRtsSteps extends BaseStep {

    private Logger logger = GetLogger(MainRtsSteps.class.getName());

    @Given("Open rts-tender.ru")
    public void open_rts_tender_ru() {
        //Настройка конфигурации браузера.
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
        Configuration.startMaximized = true;
        System.setProperty("webdriver.chrome.driver", "C:\\Program files\\chromedriver.exe");

        open("https://www.rts-tender.ru/");

        logger.info("Успешный переход по ссылке https://www.rts-tender.ru/");
    }

    @When("User clicks link to 223 suppliers")
    public void user_clicks_link_to_223_suppliers() {
        element(byXpath(MainRtsPage.suppliers223)).click();
        
        logger.info("Успешный переход в раздел 'Поставщикам 223'.");
    }
}
