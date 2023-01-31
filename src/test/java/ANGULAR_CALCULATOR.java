import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ANGULAR_CALCULATOR {
    private static WebDriver driver;
    @BeforeClass
    public static void Before_class(){
        System.out.println("Before_class");
        System.setProperty("webdriver.chrome.driver", "E:\\ruchama\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://juliemr.github.io/protractor-demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
    }
    @Test
    public void Test1(){
        driver.findElement(By.xpath("/html/body/div[1]/div/form/input[1]")).sendKeys("4");

    }

    @AfterClass
    public static void After_Class() throws InterruptedException {
        System.out.println("afterClass");
        driver.quit();
        Thread.sleep(5000);

    }
}
