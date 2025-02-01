import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BarTest {
    //-------------------Global Variables-----------------------------------
    //Declare a Webdriver variable
    public WebDriver driver;
    //Declare a test URL variable
    public String testURL = "https://the-internet.herokuapp.com/";
    //----------------------Test Setup-----------------------------------
    @BeforeMethod
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(testURL);
    }
    @Test
    public void TestCase4() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement BarPage = driver.findElement(By.linkText("Disappearing Elements"));
        BarPage.click();
        Thread.sleep(3000);
        WebElement Homepage = driver.findElement(By.linkText("Home"));
        Homepage.click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void teardownTest(){
        driver.quit();
    }
}