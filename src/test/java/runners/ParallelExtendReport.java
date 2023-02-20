package runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import utilities.BaseDriver;


@CucumberOptions(
        tags = "@aboutPageTest",
        features = {"src/test/java/featureFiles/AboutPage.feature"},
        glue = {"classpath:stepDefinitions"}
)

@Listeners({ExtentITestListenerClassAdapter.class})
public class ParallelExtendReport extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true) // bazı java versiyon hataları için
    @Parameters("browser")
    public void beforeClass(String browser)
    {
        BaseDriver.threadBrowserName.set(browser);
        //  burada browser set edilecek >> [ilgili threade 'e browser'ı ata.]

    }

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


