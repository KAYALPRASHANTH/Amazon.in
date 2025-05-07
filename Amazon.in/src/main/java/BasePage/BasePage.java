package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    public static WebDriver driver;

    public void setDriver(WebDriver driver){
        BasePage.driver = driver;
    }
    public WebElement find(By locator){
       return driver.findElement(locator);
    }
    public void set(By locator , String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    public void submit(By locator){
        find(locator).sendKeys(Keys.ENTER);
    }
    public void click(By locator){
        find(locator).click();
    }
}
