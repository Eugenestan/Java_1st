import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateRoom extends TestBase{
    @Test
    public void rec(){
        GoToCreateRoom();
        TypeName("Имя", "Фамилия", "Отчество");
        TypePhones("9111111111", "9111111111");
        TypeMail("mail@mail.ru", "mail1@mail.ru");
        TypeSource();

        AboutRealty();
        Price("123");
        WaitForServiceFields();
        CommentCallCentre("12");
        CreateButton();
        SaveAs();

        Check();
    }
    private void GoToCreateRoom() {
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
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='chat-item__source' and contains(., ' Комната ')]")));
        driver.findElement(By.xpath("//div[@class='chat-item__source' and contains(., ' Комната ')]")).click();
        driver.findElement(By.cssSelector(".modal__row:nth-child(2) .modal__field")).click();
    }

}

