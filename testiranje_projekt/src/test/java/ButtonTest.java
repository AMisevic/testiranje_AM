import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonTest {
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
    public void TestCase1() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement AddRemovePage = driver.findElement(By.linkText("Add/Remove Elements"));
        AddRemovePage.click();
        Thread.sleep(3000);
        WebElement Adder = driver.findElement(By.tagName("button"));
        Adder.click();
        Adder.click();
        Adder.click();
        Thread.sleep(3000);
        WebElement deleter = driver.findElement(By.className("added-manually"));
        deleter.click();
        Thread.sleep(3000);
    }
    @AfterMethod
    public void teardownTest(){
        driver.quit();
    }
}


