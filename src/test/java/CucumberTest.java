import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "steps", plugin = {"json:target/cucumber-report/cucumber.json"})
public class CucumberTest {

}
