package pageObject;

import org.openqa.selenium.By;

import static pageObject.BasePage.*;

public class FlightsListPage {

    By flightTitle = By.xpath("/html/body/main/div[7]/ul/li[1]/div[1]/ul/li");
    By departListedFlights = By.xpath("/html/body/main/div[7]/ul/li[2]/div[1]/ul/li");
    By departListedFlightsEco = By.xpath("/html/body/main/div[7]/ul/li[2]/div[3]/ul/li/ul/li[1]/div/div[2]/div[2]/div");
    By returnListedFlightsEco = By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li");
    By returnListedFlights = By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li");

    public boolean checkFlightTitle() {

        return isDisplayed(flightTitle);

    }

    public void chooseDepartListedFlights() {
        click(departListedFlights);

        if (isDisplayed(departListedFlightsEco) == true) {
            click(departListedFlightsEco);
        }

    }

    public void chooseReturnListedFlights() {
        click(returnListedFlights);
        if (isDisplayed(returnListedFlightsEco) == true) {
            click(returnListedFlightsEco);
        }
    }

    public String getDepartureFirmName() {
        return driver.findElements(By.cssSelector(".name.notranslate")).get(1).getText();
    }

    public String flightDepartureOriginTime() {
        return driver.findElement(By.xpath("/html/body/main/div[7]/ul/li[2]/div[1]/ul/li/div[3]/div[1]/div[1]")).getText();
    }

    public String flightDepartureArrivalTime() {
        return driver.findElement(By.xpath("/html/body/main/div[7]/ul/li[2]/div[1]/ul/li/div[3]/div[3]/div[1]")).getText();
    }

    public String flightDepartureOriginAirport() {
        return driver.findElement(By.xpath("/html/body/main/div[7]/ul/li[2]/div[1]/ul/li/div[3]/div[1]/div[2]/span")).getText();
    }

    public String flightDepartureArrivalAirport() {
        return driver.findElement(By.xpath("/html/body/main/div[7]/ul/li[2]/div[1]/ul/li/div[3]/div[3]/div[2]/span")).getText();
    }

    public String getReturnFirmName() {
        return driver.findElement(By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li/div[1]/div/span")).getText();
    }

    public String flightReturnOriginTime() {
        return driver.findElement(By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li/div[3]/div[1]/div[1]")).getText();
    }

    public String flightReturnArrivalTime() {
        return driver.findElement(By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li/div[3]/div[3]/div[1]")).getText();
    }

    public String flightReturnOriginAirport() {
        return driver.findElement(By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li/div[3]/div[1]/div[2]/span")).getText();
    }

    public String flightReturnArrivalAirport() {
        return driver.findElement(By.xpath("/html/body/main/div[8]/ul/li[1]/div[1]/ul/li/div[3]/div[3]/div[2]/span")).getText();
    }
}
