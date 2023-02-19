package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateRoom extends TestBase {
    @Test
    public void rec(){
        GoToCreateRoom();
        app.TypeName("Имя", "Фамилия", "Отчество");
        app.TypePhones("9111111111", "9111111111");
        app.TypeMail("mail@mail.ru", "mail1@mail.ru");
        app.TypeSource();

        app.AboutRealty();
        app.Price("123");
        app.WaitForServiceFields();
        app.CommentCallCentre("12");
        app.CreateButton();
        app.SaveAs();

        app.Check();
    }
    private void GoToCreateRoom() {
        WebElement waitseller = (new WebDriverWait(app.driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(., 'Объекты')]")));
        WebElement waitobject = app.driver.findElement(By.xpath("//li[contains(., 'Объекты')]"));
        Actions action = new Actions(app.driver);
        action.moveToElement(waitobject).click().perform();
        app.driver.findElement(By.xpath("//li[contains(., 'Продавцы')]")).click();
        //createobject
        app.driver.findElement(By.xpath("//div[@id='education-header-menu-objects-sale']")).click();
        WebElement waitcreatebutton = (new WebDriverWait(app.driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("realty-create-button")));
        app.driver.findElement(By.id("realty-create-button")).click();
        WebElement waitcreatebuttondrop = (new WebDriverWait(app.driver, 100))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='chat-item__source' and contains(., ' Комната ')]")));
        app.driver.findElement(By.xpath("//div[@class='chat-item__source' and contains(., ' Комната ')]")).click();
        app.driver.findElement(By.cssSelector(".modal__row:nth-child(2) .modal__field")).click();
    }

}

