package test;// Generated by Selenium IDE
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecTestApartments extends TestBase {

    private WebDriverWait wait;

    @Test
  public void rec() {

    GoToCreateApartment();
    app.TypeName("Имя", "Фамилия", "Отчество");
    app.TypePhones("9111111111", "9111111111");
    app.TypeMail("mail@mail.ru", "mail1@mail.ru");
    app.TypeSource();
    app.driver.findElement(By.xpath("//div[@class='title-wrap' and contains(., ' Условия сделки ')]")).click();

   /* WebElement waitmortage = (new WebDriverWait(app.driver, 100))
              .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mortgage\"]/div[2]/ng-select/div/span")));
    app.driver.findElement(By.xpath("//*[@id=\"mortgage\"]/div[2]/ng-select")).click();

    app.driver.findElement(By.xpath("//*[@id=\"mortgage\"]/div[2]/ng-select/div/span")).click();
    app.driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted' and contains (.,'да')]")).click();*/
    /*app.driver.findElement(By.xpath("//input[@id='isFirstSale']")).click();*/
    WebElement element = app.driver.findElement(By.xpath("//input[@id='isFirstSale']"));
    Actions act = new Actions(app.driver);
    act.moveToElement(element).click().build().perform();
    WebElement auction = app.driver.findElement(By.xpath("//*[@id='is_auction']/div[2]/ng-select/div/div"));
    Actions act1 = new Actions(app.driver);
    act1.moveToElement(auction).click();
    WebElement mortgage = app.driver.findElement(By.xpath("//*[@id=\"mortgage\"]/div[2]/ng-select/div/div/div[2]"));
    Actions act2 = new Actions(app.driver);
    act2.moveToElement(mortgage).click();
    WebElement comission = app.driver.findElement(By.xpath("//*[@id=\"commission_ready_to_share_with_agent\"]/div[2]/ng-select/div/div/div[2]"));
    Actions act3 = new Actions(app.driver);
    act3.moveToElement(comission).click();
    /*driver.findElement(By.cssSelector("xpath=//ng-dropdown-panel/div/div[2]/div/span")).click();
    driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted' and contains (.,'да')]")).click();
    driver.findElement(By.xpath("//input[@formcontrolname=\"commission_ready_to_share_with_agent_value\"]")).sendKeys("10");*/

    
    app.AboutRealty();
    app.Price("123");
    app.WaitForServiceFields();
    app.CommentCallCentre("12");
    app.CreateButton();
    app.SaveAs();


    app.Check();
  }

    private void GoToCreateApartment() {

    WebElement waitseller = (new WebDriverWait(app.driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(., 'Объекты')]")));
    app.driver.findElement(By.xpath("//li[contains(., 'Объекты')]")).click();
    WebElement waitobject = (new WebDriverWait(app.driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(., 'Продавцы')]")));
    app.driver.findElement(By.xpath("//li[contains(., 'Продавцы')]")).click();

    //createobject
    app.driver.findElement(By.xpath("//div[@id='education-header-menu-objects-sale']")).click();
    WebElement waitcreatebutton = (new WebDriverWait(app.driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("realty-create-button")));
    app.driver.findElement(By.id("realty-create-button")).click();
    WebElement waitcreatebuttondrop = (new WebDriverWait(app.driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#realty-create-button-dropdown > .item:nth-child(1)")));
    app.driver.findElement(By.cssSelector("#realty-create-button-dropdown > .item:nth-child(1)")).click();
    app.driver.findElement(By.cssSelector(".modal__row:nth-child(2) .modal__field")).click();
  }

}
