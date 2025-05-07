package PageObject;

import HomePage.HomePage;
import org.openqa.selenium.By;

import java.util.Set;

import static Utilities.JSUtility.clickJS;
import static Utilities.JSUtility.scrollIntoElement;
import static Utilities.SwitchUtility.switchToWindow;

public class ProductListPage extends HomePage {

    private By productLinkFeild = By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']");

    public ProductPage clickProduct(){
        scrollIntoElement(productLinkFeild);
        clickJS(productLinkFeild);
        return new ProductPage();
    }

    public void windowHandle(){
        //1st window
        String currentWindow = driver.getWindowHandle();
        System.out.println("Main Window ID : " + currentWindow + "\n");
        //2nd window
        Set<String> allWindow = driver.getWindowHandles();
        System.out.println("All Window ID : " + allWindow + "\n");
        for(String handle : allWindow){
            if(currentWindow.equals(handle)){
                System.out.println("1st Main ID : " + handle);
            }
            else{
                switchToWindow(handle);
                System.out.println("2nd Main ID : " + handle);
            }
        }
    }
}
