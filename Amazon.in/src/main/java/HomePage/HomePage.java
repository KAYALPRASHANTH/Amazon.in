package HomePage;

import BasePage.BasePage;
import PageObject.ProductListPage;
import org.openqa.selenium.By;

import static Utilities.JSUtility.scrollIntoElement;

public class HomePage extends BasePage {

    private By searchField = By.xpath("//input[@id='twotabsearchtextbox']");


    public ProductListPage clickSearchBox(){
        scrollIntoElement(searchField);
        click(searchField);
        set(searchField, "MacBook air m4");
        submit(searchField);
        return new ProductListPage();
    }

}
