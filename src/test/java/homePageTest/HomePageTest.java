package homePageTest;

import base.MainBase;
import controller.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends MainBase {
    HomePage homePage;

    @BeforeTest
    public void beforetest() {
        mainPage();

    }

    @Test
    public void verifyproducts() throws InterruptedException {
        //System.out.println("verifyInvalidSigninPage");
        homePage = new HomePage(driver);
        //homePage.signInn("ubr_app_mka",driver);
        homePage.signInn();


    }


    @AfterTest
    public void closebrowser(){
        //driver.close();
        //driver.quit();

}
}