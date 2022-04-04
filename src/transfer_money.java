import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class transfer_money {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "T8PB6DUWF6YTSWLZ");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appPackage", "mm.com.citizens.consumer.staging");
        dc.setCapability("appActivity", "com.youtap.flutterconsumerapp.MainActivity");
        dc.setCapability("noReset", "TRUE");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        //Input Password Stage//
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        MobileElement el1 = ad.findElementByAccessibilityId("1");
        MobileElement el2 = ad.findElementByAccessibilityId("2");
        MobileElement el3 = ad.findElementByAccessibilityId("5");
        MobileElement el4 = ad.findElementByAccessibilityId("9");

        el1.click();
        el1.click();
        el1.click();
        el2.click();
        el2.click();
        el2.click();

        MobileElement el5 = ad.findElementByAccessibilityId("Transfer");
        el5.click();
        MobileElement el6 = ad.findElementByXPath("//android.view.View[@content-desc=\"Transfer\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el6.click();
        MobileElement el7 = ad.findElementByXPath("//android.view.View[@content-desc=\"Transfer\"]/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el7.click();
        el7.sendKeys("9407326738");
        MobileElement el8 = ad.findElementByXPath("//android.view.View[@content-desc=\"Transfer\"]/android.view.View[3]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
        el8.click();
        el8.sendKeys("100000");
        MobileElement el9 = ad.findElementByXPath("//android.view.View[@content-desc=\"Transfer\"]/android.view.View[3]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
        el9.click();
        el9.sendKeys("Testing....Hee Hee Hee!");
        MobileElement el10 = ad.findElementByAccessibilityId("Next");
        el10.click();
        MobileElement el11 = ad.findElementByAccessibilityId("Next");
        el11.click();

        MobileElement el12 = ad.findElementByAccessibilityId("1");
        MobileElement el13 = ad.findElementByAccessibilityId("2");
        el12.click();
        el12.click();
        el12.click();
        el13.click();
        el13.click();
        el13.click();
    }
}
