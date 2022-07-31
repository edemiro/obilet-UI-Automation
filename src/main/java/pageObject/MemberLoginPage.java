package pageObject;

import org.openqa.selenium.By;

import static pageObject.BasePage.click;
import static pageObject.BasePage.driver;

public class MemberLoginPage {
    By membershipPopUp = By.className("body");
    By registerLink = By.xpath("//*[text()='Register']");

    public boolean membershipPopupDisplayed() {

        return driver.findElement(membershipPopUp).isDisplayed();
    }

    public void clickRegisterButton() {

        click(registerLink);

    }
}
