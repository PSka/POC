package cucumbertests;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import java.io.File;


@CucumberOptions(
        strict = true,
        features = {"src/test/resources/featuresfiles/GetAllLocalHostData.feature",
                    "src/test/resources/featuresfiles/PostRequest.feature"},
        glue = {"glue"},
//        tags = {"@smoke, @regression, @functional"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/parallel-reports/executeAllfeatures.html"},
        monochrome = false,
        format = {"pretty",
                "html:target/site/cucumber-pretty",
                "rerun:target/rerun.txt",
                "json:target/cucumber1.json"}
     )
public class executeAllfeatures extends AbstractTestNGCucumberTests {

public static Scenario scenario;

    @org.testng.annotations.BeforeClass
    public static void beforeClass(){
      //Do things
    }

    @org.testng.annotations.AfterClass
    public static void afterClass(){
      Reporter.loadXMLConfig(new File("reports/extent-xml/extent-config.xml"));
        Reporter.setSystemInfo("OS", System.getProperty("os.name"));
        Reporter.setSystemInfo("Project Name", "Sopra Steria Project");
        Reporter.setSystemInfo("Environment", "QA - demo");
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("User Time zone", System.getProperty("user.timezone"));
        Reporter.setTestRunnerOutput("This is rest services report");
    }
}