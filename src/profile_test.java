import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class profile_test {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"8p8huwp7tkkndu5x");
        dc.setCapability("platformName","Android");
        dc.setCapability("appPackage","mm.com.citizens.consumer.staging");
        dc.setCapability("appActivity","com.youtap.flutterconsumerapp.MainActivity");
        dc.setCapability("noReset","TRUE");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

        //Input Password Stage//
        MobileElement el1 = (MobileElement) ad.findElementByAccessibilityId("2");
        el1.click();
        el1.click();
        MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("7");
        el2.click();
        el1.click();
        MobileElement el3 = (MobileElement) ad.findElementByAccessibilityId("9");
        el3.click();
        el2.click();


        MobileElement el5 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el5.click();
        MobileElement el6 = (MobileElement) ad.findElementByAccessibilityId("Profile");
        el6.click();


        new TouchAction(ad)
                .tap(PointOption.point(913,1505)).perform();
        new TouchAction(ad)
                .press(PointOption.point(533,1603))
                .moveTo(PointOption.point(512,805))
                .release()
                .perform();


        MobileElement el7 = (MobileElement) ad.findElementByAccessibilityId("Change");
        el7.click();

    }
}
