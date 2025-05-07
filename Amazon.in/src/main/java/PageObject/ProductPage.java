package PageObject;

import org.openqa.selenium.By;

import static Utilities.JSUtility.scrollIntoElement;

public class ProductPage extends  ProductListPage{

    private By buyField = By.xpath("//input[@id='buy-now-button']");

    public SignIn viewBuyPage() {
        scrollIntoElement(buyField);
        click(buyField);
        return new SignIn();
    }
}
