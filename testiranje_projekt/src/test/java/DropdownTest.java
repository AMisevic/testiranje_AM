import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownTest {
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
    public void TestCase6() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement DropdownPage = driver.findElement(By.linkText("Dropdown"));
        DropdownPage.click();
        Thread.sleep(2000);
        WebElement Dropdown = driver.findElement(By.id("dropdown"));
        Dropdown.click();
        Thread.sleep(2000);
        Select select = new Select(Dropdown);
        select.selectByValue("1");
        Thread.sleep(2000);
        select.selectByValue("2");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void teardownTest(){
        driver.quit();
    }
}