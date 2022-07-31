package pageObject;

import org.openqa.selenium.By;

import static pageObject.BasePage.*;

public class HomePage {
    By homepageLogoDisplayed = By.xpath("//*[@class='logo']");
    By memberLoginButton = By.className("login");
    By myAccountButton = By.xpath("//*[text()='My Account']");
    By flightTab = By.xpath("//*[text()=' Flight\n" + "                                ']");


    public boolean checkHomePageisDisplayed() {

        return isDisplayed(homepageLogoDisplayed);

    }

    public void clickMemberLoginButton() {

        click(memberLoginButton);

    }

    public boolean checkMyAccountButton() {

        return isDisplayed(myAccountButton);

    }

    public void clickFlightTab() {
        click(flightTab);
    }
}
