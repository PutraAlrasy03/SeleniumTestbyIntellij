package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.ITestResult;
import java.nio.file.Files; // Add this import
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static com.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String DEMOQA_URL = "https://demoqa.com";

    @BeforeClass
    public void setUp() {
        // Initialize the WebDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeMethod
    public void loadApplication() {
        // Load the application before each test
        driver.get(DEMOQA_URL);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }



    @AfterMethod
    public void takeFailedResultScreenShot(ITestResult testResult) {
        // Take a screenshot if the test fails
        if (ITestResult.FAILURE == testResult.getStatus()) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            Path destination = Paths.get(System.getProperty("user.dir"), "resources", "screenshots",
                    "(" + java.time.LocalDate.now() + ")" + testResult.getName() + ".png");

            try {
                Files.createDirectories(destination.getParent()); // Ensure directories exist
                Files.copy(source.toPath(), destination); // Copy the file
                System.out.println("ScreenShot Located at " + destination);
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Failed to save screenshot: " + e.getMessage());
            }
        }
    }


    @AfterClass
    public void tearDown() {
        // Quit the browser after all tests are executed
        delay(1000);
        if (driver != null) {
            driver.quit();
        }
    }
}
