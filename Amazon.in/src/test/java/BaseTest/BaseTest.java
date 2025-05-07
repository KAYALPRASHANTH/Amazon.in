package BaseTest;

import BasePage.BasePage;
import HomePage.HomePage;
import PageObject.PaymentPage;
import PageObject.SignIn;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import static Utilities.Utility.setUtilityDriver;

public class BaseTest {
    public WebDriver driver;
    public BasePage basePage;
    public HomePage homePage;
    public SignIn signIn;
    public PaymentPage paymentPage;

    @BeforeClass
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }
    @BeforeMethod
    public void logSetUp(){
        driver.get("http://www.amazon.in/");
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
        signIn = new SignIn();
        paymentPage = new PaymentPage();
    }
    @AfterMethod
    public void takeScreenShort(ITestResult TestResult){
        if(ITestResult.FAILURE == TestResult.getStatus()){
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            File destination = new File(System.getProperty("user.dir") +
                    "/resources/Screenshots(" +
                    java.time.LocalDate.now() +
                    TestResult.getName() + ".png");
            try {
                FileHandler.copy(source, destination);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("ScreenShort located in " + destination);
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
