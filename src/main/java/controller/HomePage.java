package controller;

import base.MainBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends MainBase {



    @FindBy(xpath = "//nav[1]//li[1]/button[@class='btn-unstyled menuHeader  flyBtn']")
    WebElement prodcuts;


    @FindBy(xpath = "//button[@class='menu-item-button-13 ']")
   WebElement appliances;

    @FindBy(xpath = "//button[@class='menu-item-button-2 ']")
    WebElement mka;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    public void signInn() throws InterruptedException {
       Thread.sleep(3000);
        prodcuts.click();
        appliances.click();
        Thread.sleep(3000);
        mka.click();
       //driver.findElement(By.xpath("//button[@class='"+ mka + "']")).click();






    }


}