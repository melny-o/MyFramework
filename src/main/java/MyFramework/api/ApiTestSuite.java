package MyFramework.api;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "MyFramework.api",
        features = "src/test/resources/features/api",
        monochrome = true
)
public class ApiTestSuite {
}
