package pageObject;

import org.openqa.selenium.By;

import static pageObject.BasePage.click;
import static pageObject.BasePage.isDisplayed;

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
}
