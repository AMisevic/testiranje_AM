import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class ContextTest {
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
    public void TestCase3() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement ContextPage = driver.findElement(By.linkText("Context Menu"));
        ContextPage.click();
        Thread.sleep(3000);
        WebElement Context = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(Context);
        Thread.sleep(1000);
    }
    @AfterMethod
    public void teardownTest(){
        driver.quit();
    }
}
