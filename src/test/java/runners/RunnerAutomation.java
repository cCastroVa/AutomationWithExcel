package runners;


import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import utils.datatofeature.BeforeSuite;
import utils.datatofeature.DataToFeature;
import utils.datatofeature.RunnerPersonalizado;

import java.io.IOException;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(features = {"src/test/resources/features/test.feature"},
                 tags = "@automation",
                 glue = "stepdefinitions",
                 plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
                 snippets= CucumberOptions.SnippetType.CAMELCASE)
public class RunnerAutomation
{
    private RunnerAutomation() {
    }
    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException
    {
        DataToFeature.overrideFeatureFiles("src/test/resources/features/test.feature");
    }
}
