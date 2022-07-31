package pageObject;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static pageObject.BasePage.click;
import static pageObject.BasePage.driver;

public class FlightPage {
    By findFlightTicketButton = By.xpath("//*[text()='\n" + "        FIND A FLIGHT TICKET\n" + "        ']");
    By fromCity = By.id("origin-input");
    By fromCityAirport = By.xpath("//*[text()='İstanbul Anadolu - Sabiha Gökçen Havalimanı']");
    By toCity = By.id("destination-input");
    By toCityAirport = By.xpath("//*[@id=\"destination\"]/div/ul/li[7]");
    By departureField = By.id("departure");
    By departureDate = By.xpath("/html/body/main/div[1]/div/form/div[2]/div[1]/div/ob-datepicker/div/div/div[1]/div/table/tbody/tr[3]/td[2]/button");
    By returnField = By.xpath("//*[contains(@id,'return-input')]");
    By returnDate = By.xpath("/html/body/main/div[1]/div/form/div[2]/div[2]/div/ob-datepicker/div/div[1]/div[1]/div/table/tbody/tr[4]/td[3]/button/span");

    public boolean checkFlightPage() {

        return driver.findElement(findFlightTicketButton).isDisplayed();
    }

    public void chooseFromCity() {
        click(fromCity);
        click(fromCityAirport);
    }

    public void chooseToCity() {
        click(toCity);
        click(toCityAirport);
    }

    public void chooseDepartureDate() {
        click(departureField);
        click(departureDate);

    }

    public void chooseReturnDate() throws InterruptedException {
        Thread.sleep(1000);
        click(returnField);
        click(returnDate);
    }

    public void clickFindFlightTicketButton() {
        click(findFlightTicketButton);
    }


}
