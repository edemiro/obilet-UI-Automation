package pageObject;

import org.openqa.selenium.By;

import static pageObject.BasePage.*;

public class RegisterPage {

    By emailInput = By.name("email");
    By passwordInput = By.name("password");
    By registerButton = By.cssSelector("#register-form > div.options.register > button");

    public void typeEmailInput(String text) {

        sendKeys(emailInput, text);

    }

    public void typePasswordInput(String text) {

        sendKeys(passwordInput, text);

    }

    public void clickRegisterButton() {

        click(registerButton);

    }
}
