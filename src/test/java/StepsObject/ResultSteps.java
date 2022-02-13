package StepsObject;

import PageObjects.ResultPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ResultSteps extends BaseStep {

    private Logger logger = GetLogger(ResultSteps.class.getName());

    public BufferedWriter CreateBufferWriter() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("InitialPrices.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Ошибка при создании экземпляра BufferedWriter");
        }
        return writer;
    }

    public void CloseWriter(BufferedWriter writer) {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("Ошибка при закрытии экземпляра BufferedWriter");
        }
    }

    //Дожидается загрузки страницы.
    public void WaitingPageReload() {
        element(byXpath(ResultPage.marker)).waitUntil(Condition.not(visible), 10000);
    }

    //Получает 'Начальная цена' всех извещений на текущей странице.
    public ArrayList<Double> GetInitialPrices() {

        ElementsCollection initialElementsCollection = $$(elements(byXpath(ResultPage.initialPrice)));
        ArrayList<Double> initialPriceCollection = new ArrayList<>();
        initialElementsCollection.forEach((x) -> {
            double initialPrice = Double.parseDouble(x.getAttribute("content"));

            initialPriceCollection.add(initialPrice);
        });
        return initialPriceCollection;
    }


    //Записывает элементы 'Начальная цена' всех извещений на текущей странице в файл InitialPrices.txt
    public void WritePricesToFile(ArrayList<Double> initialPriceCollection, BufferedWriter writer) {

        initialPriceCollection.forEach((x) -> {
            try {
                writer.write(x + "\n");
            } catch (IOException e) {
                e.printStackTrace();
                logger.error("Ошибка записи 'Начальная цена' в файл InitialPrices.txt");
            }
        });
    }


    //Записывает текущую дату и время, добавляет отступы.
    public void WriteInfoToFile(BufferedWriter writer) throws IOException {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss");

        writer.write("\nДата и время запуска теста: "
                + formatForDateNow.format(new Date())
                + "\n"
                + "\n");
    }

    @Then("Autotest is logging initial price value")
    public void autotest_is_logging_initial_price_value() throws IOException {

        WaitingPageReload();

        BufferedWriter writer = CreateBufferWriter();

        ArrayList<Double> initialPriceCollection = GetInitialPrices();

        //Для подсчета количества извещений.
        int countNotices = initialPriceCollection.size();

        WritePricesToFile(initialPriceCollection, writer);

        if (element(byXpath(ResultPage.nextButton)).exists()) {
            do {
                SelenideElement next = element(byXpath(ResultPage.nextButton));
                next.click();
                WaitingPageReload();

                initialPriceCollection = GetInitialPrices();
                WritePricesToFile(initialPriceCollection, writer);
                int countPageNotices = initialPriceCollection.size();
                countNotices += countPageNotices;
            }
            while (element(byXpath(ResultPage.nextButton)).exists());
        }

        writer.write("Количество извещений: " + countNotices);
        WriteInfoToFile(writer);
        CloseWriter(writer);

        logger.info("Успешно произведена запись 'Начальная цена' всех извещений по заданным параметрам в файл InitialPrices.txt");
    }
}

