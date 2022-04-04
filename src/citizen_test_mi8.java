import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class citizen_test_mi8 {
    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "8p8huwp7tkkndu5x");
        dc.setCapability("automationName","uiautomator2");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appPackage", "mm.com.citizens.consumer");
        dc.setCapability("appActivity", "com.youtap.flutterconsumerapp.MainActivity");
        dc.setCapability("noReset", "TRUE");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        //Input Password Stage//
        MobileElement el1 = ad.findElementByAccessibilityId("6");
        MobileElement el2 = ad.findElementByAccessibilityId("2");
        MobileElement el3 = ad.findElementByAccessibilityId("5");
        MobileElement el4 = ad.findElementByAccessibilityId("9");
        el1.click();
        el2.click();
        el3.click();
        el3.click();
        el4.click();
        el4.click();

        //Swipe Test//
        new TouchAction(ad)
                .press(PointOption.point(345, 1198))
                .moveTo(PointOption.point(348, 585))
                .release()
                .perform();

        //TopUp_Test//
        MobileElement el5 = ad.findElementByAccessibilityId("Top Up");
        el5.click();
        MobileElement el6 = ad.findElementByAccessibilityId("TelenorEload");
        el6.click();
        MobileElement el7 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el7.click();
        MobileElement el8 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el8.click();
        MobileElement el9 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el9.click();
        MobileElement el10 = ad.findElementByAccessibilityId("Log out");
        el10.click();

    }
}
