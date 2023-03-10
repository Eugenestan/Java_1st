package manager;

import org.example.LoginFields;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.Map;

public class ApplicationManager {
    public WebDriver driver;
    public Map<String, Object> vars;
    JavascriptExecutor js;

    public void exit() {
        driver.quit();
    }

    public void Check() {
      WebElement waitcreatebuttondrop2 = (new WebDriverWait(driver, 25))
              .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(., 'Фамилия')]")));
    }

    public void SaveAs() {
      WebElement waitcreatebuttondrop1 = (new WebDriverWait(driver, 5))
              .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Сохранить как есть')]")));
      WebElement waitcreateobject = driver.findElement(By.xpath("//button[contains(.,'Сохранить как есть')]"));
      Actions action2 = new Actions(driver);
      action2.moveToElement(waitcreateobject).click().perform();
      driver.findElement(By.xpath("//button[@class = 're-button _red']"));
    }

    public void CreateButton() {
      driver.findElement(By.xpath("//button[contains(., 'Создать')]")).click();
    }

    public void CommentCallCentre(String TextForCallCentre) {
      driver.findElement(By.xpath("//textarea[@formcontrolname='comment_callcenter']")).sendKeys(TextForCallCentre);
    }

    public void WaitForServiceFields() {
      driver.findElement(By.xpath("//div/div[8][contains(., 'Служебные поля')]")).click();
      WebElement waitel = driver.findElement(By.xpath("//textarea[@formcontrolname='comment_callcenter']"));
      Actions action1 = new Actions(driver);
      action1.moveToElement(waitel).click().perform();
    }

    public void Price(String PriceNumber) {
      driver.findElement(By.xpath("//input[@placeholder='Введите стоимость']")).sendKeys(PriceNumber);
    }

    public void AboutRealty() {
      driver.findElement(By.cssSelector("#aboutRealtyPart_Realty_acc .title-wrap")).click();
    }

    public void TypeSource() {
      driver.findElement(By.xpath("//*[@id=\"source_id\"]/div[2]/ng-select/div/div/div[2]/input")).click();
      driver.findElement(By.xpath("//span[contains(.,'Тестовый источник')]")).click();
    }

    public void TypeMail(String FirstMail, String SecondMail) {
      driver.findElement(By.xpath("//input[@placeholder='Введите email']")).sendKeys(FirstMail);
      driver.findElement(By.xpath("//div[7]/div[2]/div/button/i[@class='plus icon']")).click();
      driver.findElement(By.xpath("//div[8]/div[2]/div/input[@placeholder='Введите email']")).sendKeys(SecondMail);
    }

    public void TypePhones(String FirstPhone, String SecondPhone) {
      driver.findElement(By.xpath("//input[@formcontrolname='phone']")).sendKeys(FirstPhone);
      driver.findElement(By.xpath("//button[@class='ui icon button secondary ng-star-inserted']")).click();
      driver.findElement(By.xpath("//div[6]/div[2]/div/input[@formcontrolname='phone']")).sendKeys(SecondPhone);
    }

    public void TypeName(String Name, String Surname, String SecondName) {
      driver.findElement(By.xpath("//input[@formcontrolname='owner_name']")).sendKeys(Name);
      driver.findElement(By.xpath("//input[@formcontrolname='owner_lastname']")).sendKeys(Surname);
      driver.findElement(By.xpath("//input[@formcontrolname='owner_middlename']")).sendKeys(SecondName);
    }

    public void login(LoginFields loginFields) {
      driver.get("https://crm.topnlab.ru/authorize/login");
      driver.manage().window().setSize(new Dimension(1288, 816));

      driver.findElement(By.name("email")).sendKeys(loginFields.usermail());
      driver.findElement(By.name("password")).sendKeys(loginFields.userpassword());
      driver.findElement(By.xpath("//button[contains(., 'Войти' )]")).click();
    }

    public void init() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        WebDriverWait wait = new WebDriverWait(driver,10);
        login(new LoginFields("s.evgeniy@topnlab.ru", "54255425"));
    }
}
