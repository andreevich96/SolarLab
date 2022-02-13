package StepsObject;

import org.apache.log4j.Logger;

//Класс для логгирования шагов.
public class BaseStep {
    public Logger GetLogger(String loggerName) {
        return Logger.getLogger(loggerName);
    }
}
