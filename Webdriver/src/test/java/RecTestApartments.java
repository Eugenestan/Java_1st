// Generated by Selenium IDE
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecTestApartments extends TestBase {

    private WebDriverWait wait;

    @Test
  public void rec() {

    GoToCreateApartment();
    TypeName("Имя", "Фамилия", "Отчество");
    TypePhones("9111111111", "9111111111");
    TypeMail("mail@mail.ru", "mail1@mail.ru");
    TypeSource();
    driver.findElement(By.xpath("//div[@class='title-wrap' and contains(., ' Условия сделки ')]")).click();
    /*driver.findElement(By.xpath("//*[@id=\"mortgage\"]/div[2]/ng-select/div/div/div[1]")).click();
    driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted' and contains (.,'да')]")).click();*/
    /*driver.findElement(By.xpath("//*[@id=\"is_first_sale\"]/div[2]/div/label/svg/use")).click();*/
    driver.findElement(By.cssSelector("xpath=//ng-dropdown-panel/div/div[2]/div/span")).click();
    driver.findElement(By.xpath("//span[@class='ng-option-label ng-star-inserted' and contains (.,'да')]")).click();
    driver.findElement(By.xpath("//input[@formcontrolname=\"commission_ready_to_share_with_agent_value\"]")).sendKeys("10");

    
    AboutRealty();
    Price("123");
    WaitForServiceFields();
    CommentCallCentre("12");
    CreateButton();
    SaveAs();


    Check();
  }

    private void GoToCreateApartment() {
    WebElement waitseller = (new WebDriverWait(driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(., 'Объекты')]")));
    WebElement waitobject = driver.findElement(By.xpath("//li[contains(., 'Объекты')]"));
    Actions action = new Actions(driver);
    action.moveToElement(waitobject).click().perform();
    driver.findElement(By.xpath("//li[contains(., 'Продавцы')]")).click();
    //createobject
    driver.findElement(By.xpath("//div[@id='education-header-menu-objects-sale']")).click();
    WebElement waitcreatebutton = (new WebDriverWait(driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("realty-create-button")));
    driver.findElement(By.id("realty-create-button")).click();
    WebElement waitcreatebuttondrop = (new WebDriverWait(driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#realty-create-button-dropdown > .item:nth-child(1)")));
    driver.findElement(By.cssSelector("#realty-create-button-dropdown > .item:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".modal__row:nth-child(2) .modal__field")).click();
  }

}
