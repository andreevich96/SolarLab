package StepsObject;

import ConfigRts.Test223Configuration;
import PageObjects.Search223Page;
import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;

public class Search223Steps extends LoggerForSteps {

    private Logger logger = GetLogger(Search223Steps.class.getName());

    Test223Configuration readConfig;
    {
        try {
            readConfig = new Test223Configuration();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final String search223Page = readConfig.search223Page;

    @Then("User clicks button settings")
    public void userClicksButtonSettings () {
        Search223Page.getSettings().click();

        logger.info("Успешный переход в 'Настройки'.");
    }

    @Given("Open rts-tender.ru search 223")
    public void openRtsTenderRuSearch223() {
        Configuration.browser = readConfig.browser;
        Configuration.holdBrowserOpen = readConfig.holdBrowserOpen;
        Configuration.startMaximized = readConfig.startMaximized;
        System.setProperty("webdriver.chrome.driver", "C:\\Program files\\chromedriver.exe");

        open(search223Page);

        logger.info("Успешный переход по ссылке https://www.rts-tender.ru/poisk/poisk-223-fz/");
    }
}
