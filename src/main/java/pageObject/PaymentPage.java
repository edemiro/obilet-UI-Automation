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

    public String getDepartureFirmName() {
        return driver.findElement(By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[1]/tr[2]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/div/strong")).getText();
    }

    public String flightDepartureAirportAndTime() {
        return driver.findElement(By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[1]/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]")).getText();
    }

    public String flightArrivalAirportAndTime() {
        return driver.findElement(By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[1]/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[3]")).getText();
    }

    public String getReturnFirmName() {
        return driver.findElement(By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[2]/tr[3]/td/table/tbody/tr/td[1]/table/tbody/tr[1]/td/div/strong")).getText();
    }

    public String flightReturnOriginAirportAndTime() {
        return driver.findElement(By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[2]/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[1]")).getText();
    }

    public String flightReturnArrivalAirportAndTime() {
        return driver.findElement(By.xpath("/html/body/main/form/div[1]/fieldset[1]/div/div/table/tbody[2]/tr[3]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td[3]")).getText();
    }

}
