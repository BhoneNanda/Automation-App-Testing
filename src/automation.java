import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class automation {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "8p8huwp7tkkndu5x");
        dc.setCapability("platformName","Android");
        dc.setCapability("appPackage", "com.ulsumobile.calculator");
        dc.setCapability("appActivity","com.ulsumobile.calculator.activity.LoadingActivity");


        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement el1 = (MobileElement) ad.findElementById("com.ulsumobile.calculator:id/iv_7");
        el1.click();
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementById("com.ulsumobile.calculator:id/iv_chu");
        el2.click();
        MobileElement el3 = (MobileElement) ad.findElementById("com.ulsumobile.calculator:id/iv_1");
        el3.click();
        el3.click();
        MobileElement el4 = (MobileElement) ad.findElementById("com.ulsumobile.calculator:id/iv_deng");
        el4.click();


        Assert.assertEquals(ad.findElementById("com.ulsumobile.calculator:id/edit_input").getText(), 7);
    }
}
