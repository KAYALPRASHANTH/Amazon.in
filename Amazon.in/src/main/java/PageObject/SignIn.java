package PageObject;

import org.openqa.selenium.By;

public class SignIn extends ProductPage{

    private By userIDField = By.xpath("//input[@id='ap_email_login']");
    private By continueButtonField = By.xpath("//input[@class='a-button-input']");

    private By passwordField = By.xpath("//input[@id='ap_password']");
    private By signupButtonField = By.xpath("//input[@id='signInSubmit']");

    public void username(String text) throws InterruptedException {
        click(userIDField);
        set(userIDField ,text);
        click(continueButtonField);
        Thread.sleep(3000);
    }
    public PaymentPage KeyPassword(String text){
        click(passwordField);
        set(passwordField, text);
        click(signupButtonField);
        return new PaymentPage();
    }
}
