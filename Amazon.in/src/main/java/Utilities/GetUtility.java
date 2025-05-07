package Utilities;

import java.util.Set;

public class GetUtility extends Utility{

    public static String getWindowHandle(){
        return driver.getWindowHandle();
    }
    public static Set<String> getWindowHandles(){
        return driver.getWindowHandles();
    }
}
