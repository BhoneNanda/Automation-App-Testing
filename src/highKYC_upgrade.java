import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class highKYC_upgrade {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "PEVBB20317200039x");
        dc.setCapability("platformName", "Android");
        dc.setCapability("appPackage", "mm.com.citizens.consumer.staging");
        dc.setCapability("appActivity", "com.youtap.flutterconsumerapp.MainActivity");
        dc.setCapability("noReset", "TRUE");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        //Input Password Stage//
        ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement el1 = ad.findElementByAccessibilityId("1");
        MobileElement el2 = ad.findElementByAccessibilityId("2");
        for(int i=0; i<3; i++){
            el1.click();
        }
        for(int i=0; i<3; i++){
            el2.click();
        }

        MobileElement el3 = ad.findElementByAccessibilityId("Upgrade your limits! Complete the Sign Up process to access more of the Citizens Pay Staging app.");
        el3.click();
        MobileElement el4 = ad.findElementByAccessibilityId("Let's go");
        el4.click();

        MobileElement el6 = ad.findElementByXPath("//android.view.View[@content-desc=\"Personal Information\"]/android.widget.ScrollView/android.view.View[1]");
        el6.click();
        MobileElement el7 = ad.findElementByAccessibilityId("Switch to input");
        el7.click();
        MobileElement el8 = ad.findElementByXPath("//android.view.View[@content-desc=\"SELECT DATE\nMon, Apr 5\"]/android.widget.EditText");
        el8.click();
        el8.sendKeys("6/5/1999");
        MobileElement el9 = ad.findElementByAccessibilityId("OK");
        el9.click();
        MobileElement el10 = ad.findElementByXPath("//android.view.View[@content-desc=\"Personal Information\"]/android.widget.ScrollView/android.widget.EditText");
        el10.click();
        el10.sendKeys("abcd@gmail.com");
        ad.navigate().back();
        MobileElement el11 = ad.findElementByXPath("//android.view.View[@content-desc=\"Personal Information\"]/android.widget.ScrollView/android.widget.EditText[2]");
        el11.click();
        el11.sendKeys("abcd/efg");
        MobileElement el12 = ad.findElementByAccessibilityId("Next");
        el12.click();
        MobileElement el13 = ad.findElementByAccessibilityId("1");
        el13.click();
        MobileElement el14 = ad.findElementByAccessibilityId("12");
        el14.click();
        MobileElement el15 = ad.findElementByXPath("//android.view.View[@content-desc=\"Identification\"]/android.widget.ScrollView/android.widget.EditText");
        el15.click();
        el15.sendKeys("123456");
        MobileElement el16 = ad.findElementByAccessibilityId("Next");
        el16.click();
        MobileElement el17 = ad.findElementByAccessibilityId("Submit");
        el17.click();

    }


}

