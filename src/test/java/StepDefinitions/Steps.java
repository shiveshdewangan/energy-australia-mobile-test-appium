package StepDefinitions;

import PageObjects.HomePage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Steps {

    public HomePage homePage;

    public static URL url;
    public static DesiredCapabilities capabilities;
    public AndroidDriver<MobileElement> driver;
    File app = new File("src/test/java/APKFile/app-debug.apk");

    @Before
    public void setup() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.energyaustralia.codingtestsample");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("app", app.getAbsolutePath());

        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void cleanup(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        driver.quit();
    }

    @Given("^I have launched the Festivals App$")
    public void i_have_launched_the_festivals_app() throws MalformedURLException {
        homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getFestivalsListText(), "");
    }

    @Then("^I can see the list of festivals$")
    public void i_can_see_the_list_of_festivals() throws Throwable {
        Assert.assertEquals(homePage.getFestivalsText().isEmpty(), false);
        Assert.assertEquals(homePage.getTitlesText().isEmpty(), false);
    }
}
