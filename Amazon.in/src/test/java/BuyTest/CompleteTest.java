package BuyTest;

import BaseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompleteTest extends BaseTest {

    @Test
    public void Test() throws InterruptedException {
        String UserName = "Enter your Username Email/Phone";
        String Password = "Enter your Password";
        var Path = homePage.clickSearchBox().clickProduct();
        Path.windowHandle();
        Path.viewBuyPage();
        signIn.username(UserName);
        signIn.KeyPassword(Password);
        String Actual = paymentPage.Checkout();
        String Expected = "Checkout";
        Assert.assertEquals(Actual, Expected ,"Not Matched");
    }
}
