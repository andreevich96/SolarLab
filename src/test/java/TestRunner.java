import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features/Test223_FilteredInfo.feature",
        glue = "StepsObject"
)
public class TestRunner {
}
