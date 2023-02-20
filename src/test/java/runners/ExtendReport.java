package runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;


@CucumberOptions(
        tags = "@aboutPageTest",
        features = {"src/test/java/featureFiles/AboutPage.feature"},
        glue = {"classpath:stepDefinitions"}
)

@Listeners({ExtentITestListenerClassAdapter.class})
public class ExtendReport extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Team Name", "Team-1");
        ExtentService.getInstance().setSystemInfo("Application Name", "KMF");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Tester", "Raziyanur Kanatbek");
        ExtentService.getInstance().setSystemInfo("note", "About page Test");
    }
}


