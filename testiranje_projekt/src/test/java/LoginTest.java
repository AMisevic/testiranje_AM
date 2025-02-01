import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
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
    public void TestCase5() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement LoginPage = driver.findElement(By.linkText("Form Authentication"));
        LoginPage.click();
        Thread.sleep(2000);
        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("WrongUsername");
        Thread.sleep(2000);
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("WrongPassword");
        WebElement Login = driver.findElement(By.className("radius"));
        Login.click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void teardownTest(){
        driver.quit();
    }
}
