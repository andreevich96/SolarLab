package StepsObject;

import ConfigRts.Test223Configuration;
import PageObjects.MainRtsPage;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class MainRtsSteps extends LoggerForSteps {

    private Logger logger = GetLogger(MainRtsSteps.class.getName());

    Test223Configuration readConfig;
    {
        try {
            readConfig = new Test223Configuration();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final String rtsUrl = readConfig.mainPage;

    @Given("Open rts-tender.ru")
    public void openRtsTenderRu() {
        //Настройка конфигурации браузера.
        Configuration.browser = readConfig.browser;
        Configuration.holdBrowserOpen = readConfig.holdBrowserOpen;
        Configuration.startMaximized = readConfig.startMaximized;
        System.setProperty("webdriver.chrome.driver", "C:\\Program files\\chromedriver.exe");

        open(rtsUrl);

        logger.info("Успешный переход по ссылке https://www.rts-tender.ru/");
    }

    @When("User clicks link to 223 suppliers")
    public void userClicksLinkTo223Suppliers() {
        MainRtsPage.getSuppliers223().click();
        
        logger.info("Успешный переход в раздел 'Поставщикам 223'.");
    }
}
