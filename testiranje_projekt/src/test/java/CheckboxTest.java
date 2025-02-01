import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest {
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
    public void TestCase2() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement CheckboxPage = driver.findElement(By.linkText("Checkboxes"));
        CheckboxPage.click();
        Thread.sleep(3000);
        WebElement Box1 = driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(1)"));
        Box1.click();
        Thread.sleep(1000);
        WebElement Box2 = driver.findElement(By.cssSelector("input[type='checkbox']:nth-of-type(2)"));
        Box2.click();
        Thread.sleep(1000);
        Box2.click();
        Thread.sleep(1000);
    }
    @AfterMethod
    public void teardownTest(){
        driver.quit();
    }
}