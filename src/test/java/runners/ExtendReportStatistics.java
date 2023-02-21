package runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;


@CucumberOptions(
        tags = "@statisticsPageTest",
        features = {"src/test/java/featureFiles/StatisticsPage.feature"},
        glue = {"classpath:stepDefinitions"}
)

@Listeners({ExtentITestListenerClassAdapter.class})
public class ExtendReportStatistics extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void writeExtentReport() {
        ExtentService.getInstance().setSystemInfo("Team Name", "Team-1");
        ExtentService.getInstance().setSystemInfo("Application Name", "KMF");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("QA", "Raziyanur Kanatbek");
        ExtentService.getInstance().setSystemInfo("note", "Statistics page Test");
    }
}


