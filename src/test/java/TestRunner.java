//import io.cucumber.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.testng.AbstractTestNGCucumberTests;


import io.cucumber.testng.CucumberFeatureWrapper;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"StepDefinition"},
        tags = {"@CitadelTest"},
        plugin = {
                "html:target/cucumber-report/cucumber-pretty",
                "json:target/cucumber-report/CucumberTestReport.json",
                "pretty",
                "rerun:target/cucumber-reports/rerun.txt"
        }

)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {

        testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs CucumberFeature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        //testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());


    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }

}
