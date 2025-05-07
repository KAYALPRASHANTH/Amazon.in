package Utilities;

import org.openqa.selenium.WebDriver;

public class SwitchUtility extends Utility{

    public static WebDriver.TargetLocator switchTo(){
        return driver.switchTo();
    }

    //Window Handle
    public static void switchToWindow(String handle){
        switchTo().window(handle);
    }
}
