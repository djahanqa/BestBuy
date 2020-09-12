package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainBase {

   public WebDriver driver;

    public void mainPage(){
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#widgets-view-email-modal-mount > div > div > div:nth-child(2) > div > div > div > div > button > svg")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

}
