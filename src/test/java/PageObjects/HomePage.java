package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "festival_list")
    public MobileElement festivalsList;

    @FindBy(id = "festivalTextView")
    public MobileElement festivalText;

    @FindBy(id = "titleTextView")
    public MobileElement titleText;

    public HomePage(AndroidDriver<MobileElement> driver) {
        super(driver);
    }

    public String getFestivalsListText() {
        return festivalsList.getText();
    }

    public String getTitlesText() {
        System.out.println("titles - " + titleText.getText());
        return titleText.getText();
    }

    public String getFestivalsText() {
        System.out.println("festivalsList - " + festivalText.getText());
        return festivalText.getText();
    }
}
