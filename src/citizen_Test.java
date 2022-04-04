import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class citizen_Test {

    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME,"T8PB6DUWF6YTSWLZ");
        dc.setCapability("platformName","Android");
        dc.setCapability("appPackage","mm.com.citizens.consumer.staging");
        dc.setCapability("appActivity","com.youtap.flutterconsumerapp.MainActivity");
        dc.setCapability("noReset","TRUE");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);

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


        //TopUp_Test//
        MobileElement el9 = ad.findElementByAccessibilityId("Top Up");
        el9.click();
        MobileElement el10 = ad.findElementByAccessibilityId("TelenorEload");
        el10.click();
        MobileElement el11 = ad.findElementByAccessibilityId("E-Load\nMMK 3,000");
        el11.click();
        MobileElement el12 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");
        el12.click();
        el12.sendKeys("09791953587");
        MobileElement el13 = ad.findElementByAccessibilityId("Next");
        el13.click();

        MobileElement el14 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");
        el14.sendKeys("09791953587");
        MobileElement el15 = ad.findElementByAccessibilityId("Next");
        el15.click();
        MobileElement el16 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el16.click();
        MobileElement el17 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el17.click();
        MobileElement el18 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el18.click();

        new TouchAction(ad)
                .press(PointOption.point(294,1198))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(PointOption.point(301,654))
                .release()
                .perform();

        MobileElement el19 = ad.findElementByAccessibilityId("Transactions");
        el19.click();
        MobileElement el20 = ad.findElementByAccessibilityId("Search");
        el20.click();
        MobileElement el21 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[2]/android.widget.ImageView");
        el21.click();
        el21.sendKeys("09791953587");
        MobileElement el22 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView");
        el22.click();
        MobileElement el23 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.ImageView");
        el23.click();
        MobileElement el24 = ad.findElementByAccessibilityId("Send money");
        el24.click();
        MobileElement el25 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
        el25.click();
        el25.sendKeys("09791953587");
        MobileElement el26 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");
        el26.click();
        el26.sendKeys("99999999");
        MobileElement el27 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");
        el27.click();
        el27.sendKeys("Nay Kaung Lrrr...Hee Hee");


        ad.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        MobileElement el28 = ad.findElementByAccessibilityId("Next");
        el28.click();
        MobileElement el29 = ad.findElementByAccessibilityId("Requests\nTab 2 of 2");
        el29.click();
        MobileElement el30 = ad.findElementByAccessibilityId("Filter by\nShow All");
        el30.click();
        MobileElement el31 = ad.findElementByAccessibilityId("Outstanding");
        el31.click();
        MobileElement el32 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]");
        el32.click();
        MobileElement el33 = ad.findElementByAccessibilityId("Bill Pay");
        el33.click();
        MobileElement el34 = ad.findElementByAccessibilityId("Top Up");
        el34.click();
        MobileElement el35 = ad.findElementByAccessibilityId("MPTEload");
        el35.click();
        MobileElement el36 = ad.findElementByAccessibilityId("E-Load\nMMK 3,000");
        el36.click();
        MobileElement el37 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");
        el37.click();
        el37.sendKeys("09791953587");
        MobileElement el38 = ad.findElementByAccessibilityId("Next");
        el38.click();
        MobileElement el39 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el39.click();
        MobileElement el40 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el40.click();
        MobileElement el41 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el41.click();
        MobileElement el42 = ad.findElementByAccessibilityId("Data");
        el42.click();
        MobileElement el43 = ad.findElementByAccessibilityId("MPTEload");
        el43.click();
        MobileElement el44 = ad.findElementByAccessibilityId("15 Days Kyite Yar Khaw Pack\nMMK 997");
        el44.click();
        MobileElement el45 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");
        el45.click();
        el45.sendKeys("09791953587");
        MobileElement el46 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el46.click();
        MobileElement el47 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el47.click();
        MobileElement el48 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el48.click();
        MobileElement el49 = ad.findElementByAccessibilityId("Gaming");
        el49.click();
        MobileElement el50 = ad.findElementByAccessibilityId("Mobile Legends");
        el50.click();
        MobileElement el51 = ad.findElementByAccessibilityId("Diamond2157\nMMK 50,000");
        el51.click();
        MobileElement el52 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[1]");
        el52.click();
        el52.sendKeys("Hee Hee Harr Harr");
        MobileElement el53 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[1]");
        el53.click();
        el53.sendKeys("09791953587");
        MobileElement el54 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[2]");
        el54.click();
        el54.sendKeys("1122334455");
        MobileElement el55 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText[3]");
        el55.click();
        el55.sendKeys("1234");
        MobileElement el56 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el56.click();
        MobileElement el57 = ad.findElementByAccessibilityId("Diamond202\nMMK 5,000");
        el57.click();
        MobileElement el58 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el58.click();
        MobileElement el59 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el59.click();
        MobileElement el60 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el60.click();
        MobileElement el61 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]");
        el61.click();
        MobileElement el62 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]");
        el62.click();
        MobileElement el63 = ad.findElementByAccessibilityId("Profile");
        el63.click();
        MobileElement el64 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el64.click();
        MobileElement el65 = ad.findElementByAccessibilityId("Settings");
        el65.click();
        MobileElement el66 = ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView");
        el66.click();
        MobileElement el67 = ad.findElementByAccessibilityId("Log out");
        el67.click();



    }
}
