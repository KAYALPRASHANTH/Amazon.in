package PageObject;

import org.openqa.selenium.By;

public class PaymentPage extends SignIn{
    private By CheckField = By.xpath("//h1");

    public String Checkout(){
        return find(CheckField).getText();
    }
}
