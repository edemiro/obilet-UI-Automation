package pageObject;

import org.openqa.selenium.By;

import static pageObject.BasePage.driver;

public class PaymentPage {
    By paymentInfo = By.xpath("/html/body/main/form/div[2]/fieldset/div");
    By departFlightInfo = By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[1]/tr[2]/td/table/tbody/tr/td[2]");
    By returnFlightInfo = By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[2]/tr[3]/td/table/tbody/tr/td[2]");

    public boolean checkPaymentPage() {

        return driver.findElement(paymentInfo).isDisplayed();
    }
    public boolean checkDepartFlightInfo() {

        return driver.findElement(departFlightInfo).isDisplayed();
    }
    public boolean checkReturnFlightInfo() {

        return driver.findElement(returnFlightInfo).isDisplayed();
    }
}
