// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RecTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;

  private WebDriverWait wait;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    WebDriverWait wait = new WebDriverWait(driver,10);
  }
  /*@After
  public void tearDown() {
    driver.quit();
  }*/
  @Test
  public void rec() {
    driver.get("https://crm.topnlab.ru/authorize/login");
    driver.manage().window().setSize(new Dimension(1288, 816));
    driver.findElement(By.name("email")).sendKeys("s.evgeniy@topnlab.ru");
    driver.findElement(By.name("password")).sendKeys("54255425");
    driver.findElement(By.xpath("//button[contains(., 'Войти' )]")).click();
    WebElement waitseller = (new WebDriverWait(driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(., 'Объекты')]")));
    driver.findElement(By.xpath("//li[contains(., 'Объекты')]")).click();
    WebElement waitobject = driver.findElement(By.xpath("//li[contains(., 'Объекты')]"));
    Actions action = new Actions(driver);
    action.moveToElement(waitobject).click().perform();
    driver.findElement(By.xpath("//div[@id='education-header-menu-objects-sale']")).click();
    WebElement waitcreatebutton = (new WebDriverWait(driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("realty-create-button")));
    driver.findElement(By.id("realty-create-button")).click();
    WebElement waitcreatebuttondrop = (new WebDriverWait(driver, 100))
            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#realty-create-button-dropdown > .item:nth-child(1)")));
    driver.findElement(By.cssSelector("#realty-create-button-dropdown > .item:nth-child(1)")).click();
    driver.findElement(By.cssSelector(".modal__row:nth-child(2) .modal__field")).click();
    driver.findElement(By.xpath("//input[@formcontrolname='owner_name']")).sendKeys("проверка1");
    driver.findElement(By.cssSelector("#aboutRealtyPart_Realty_acc .title-wrap")).click();
    driver.findElement(By.cssSelector("#price .modal__field")).click();
    driver.findElement(By.xpath("//input[@formcontrolname='price']")).sendKeys("123");
    driver.findElement(By.xpath("//div/div[8][contains(., 'Служебные поля')]")).click();
    WebElement waitel = driver.findElement(By.xpath("//textarea[@formcontrolname='comment_callcenter']"));
    Actions action1 = new Actions(driver);
    action1.moveToElement(waitel).click().perform();
    driver.findElement(By.xpath("//textarea[@formcontrolname='comment_callcenter']")).sendKeys("12");
    driver.findElement(By.xpath("//button[contains(., 'Создать')]")).click();


    WebElement waitcreatebuttondrop1 = (new WebDriverWait(driver, 5))
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Сохранить как есть')]")));
    WebElement waitcreateobject = driver.findElement(By.xpath("//button[contains(.,'Сохранить как есть')]"));
    Actions action2 = new Actions(driver);
    action2.moveToElement(waitcreateobject).click().perform();
    driver.findElement(By.xpath("//button[@class = 're-button _red']"));


    WebElement waitcreatebuttondrop2 = (new WebDriverWait(driver, 25))
            .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(., 'проверка1')]")));
  }
}
