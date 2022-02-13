package StepsObject;

import PageObjects.ResultPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Then;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class ResultSteps {

    public BufferedWriter CreateBufferWriter() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("InitialPrices.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return writer;
    }

    public void CloseWriter(BufferedWriter writer) {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Дожидается загрузки страницы.
    public void WaitingPageReload() {
        element(byXpath(ResultPage.marker)).waitUntil(Condition.not(visible), 10000);
    }

    public ArrayList<Double> GetInitialPrices() {

        ElementsCollection initialElementsCollection = $$(elements(byXpath(ResultPage.initialPrice)));
        ArrayList<Double> initialPriceCollection = new ArrayList<>();
        initialElementsCollection.forEach((x) -> {
            double initialPrice = Double.parseDouble(x.getAttribute("content"));
//            System.out.println(initialPrice);
            initialPriceCollection.add(initialPrice);
        });
        return initialPriceCollection;
    }

    public void WritePricesToFile(ArrayList<Double> initialPriceCollection, BufferedWriter writer) {

        initialPriceCollection.forEach((x) -> {
            try {
                writer.write(x + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

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

        int countNotices = initialPriceCollection.size();

        WritePricesToFile(initialPriceCollection, writer);

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

        writer.write("Количество извещений: " + countNotices);
        WriteInfoToFile(writer);
        CloseWriter(writer);
    }
}

