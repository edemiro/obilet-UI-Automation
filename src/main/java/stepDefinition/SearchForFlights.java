package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.*;

public class SearchForFlights extends BasePage {

    HomePage homePage;
    FlightPage flightPage;
    FlightsListPage flightsListPage;
    PaymentPage paymentPage;
    String departureFirmName;
    String flightDepartureOriginTime;
    String flightDepartureArrivalTime;
    String flightDepartureOriginAirport;
    String flightDepartureArrivalAirport;
    String returnFirmName;
    String flightReturnOriginTime;
    String flightReturnArrivalTime;
    String flightReturnOriginAirport;
    String flightReturnArrivalAirport;

    @Before
    public static void setup() {
        BasePage.setup();
    }

    @Given("The user Goes to Home Page")
    public void the_user_goes_to_home_page() {
        driver.get("https://www.obilet.com/en");
    }

    @Given("The user clicks the Flight tab")
    public void the_user_clicks_the_flight_tab() {
        homePage = new HomePage();
        homePage.clickFlightTab();
    }

    @Then("The Search for a flight ticket page is opened")
    public void the_search_for_a_flight_ticket_page_is_opened() {
        flightPage = new FlightPage();
        flightPage.checkFlightPage();

    }

    @When("The user chooses from city to city")
    public void the_user_chooses_from_city_to_city() {
        flightPage.chooseFromCity();
        flightPage.chooseToCity();

    }

    @When("The user chooses Depart and Return date")
    public void the_user_chooses_depart_and_return_date() throws InterruptedException {
        flightPage.chooseDepartureDate();
        flightPage.chooseReturnDate();
    }

    @When("The user clicks Find a Flight Ticket button")
    public void the_user_clicks_find_a_flight_ticket_button() {
        flightPage.clickFindFlightTicketButton();
    }

    @Then("Check The Flights are listed")
    public void check_the_flights_are_listed() {
        flightsListPage = new FlightsListPage();
        flightsListPage.checkFlightTitle();
        departureFirmName = flightsListPage.getDepartureFirmName();
        flightDepartureOriginTime = flightsListPage.flightDepartureOriginTime();
        flightDepartureArrivalTime = flightsListPage.flightDepartureArrivalTime();
        flightDepartureOriginAirport = flightsListPage.flightDepartureOriginAirport();
        flightDepartureArrivalAirport = flightsListPage.flightDepartureArrivalAirport();
    }

    @When("The user chooses Depart flight")
    public void the_user_chooses_depart_flight() {
        flightsListPage.chooseDepartListedFlights();
    }

    @When("The user chooses Return flight")
    public void the_user_chooses_return_flight() {
        returnFirmName = flightsListPage.getReturnFirmName();
        flightReturnOriginTime = flightsListPage.flightReturnOriginTime();
        flightReturnArrivalTime = flightsListPage.flightReturnArrivalTime();
        flightReturnOriginAirport = flightsListPage.flightReturnOriginAirport();
        flightReturnArrivalAirport = flightsListPage.flightReturnArrivalAirport();
        flightsListPage.chooseReturnListedFlights();
    }

    @Then("Check payment page is opened")
    public void check_payment_page_is_opened() {
        paymentPage = new PaymentPage();
        paymentPage.checkPaymentPage();

    }

    @Then("Check the Depart flight info is correct")
    public void check_the_depart_flight_info_is_correct() {
        paymentPage.checkDepartFlightInfo();
        Assert.assertTrue(paymentPage.getDepartureFirmName().contains(departureFirmName));
        Assert.assertTrue(paymentPage.flightDepartureAirportAndTime().contains(flightDepartureOriginTime));
        Assert.assertTrue(paymentPage.flightArrivalAirportAndTime().contains(flightDepartureArrivalTime));
        Assert.assertTrue(paymentPage.flightDepartureAirportAndTime().contains(flightDepartureOriginAirport));
        Assert.assertTrue(paymentPage.flightArrivalAirportAndTime().contains(flightDepartureArrivalAirport));
    }

    @Then("Check the Return flight info is correct")
    public void check_the_return_flight_info_is_correct() {
        paymentPage.checkReturnFlightInfo();
        Assert.assertTrue(paymentPage.getReturnFirmName().contains(returnFirmName));
        Assert.assertTrue(paymentPage.flightReturnOriginAirportAndTime().contains(flightReturnOriginTime));
        Assert.assertTrue(paymentPage.flightReturnArrivalAirportAndTime().contains(flightReturnArrivalTime));
        Assert.assertTrue(paymentPage.flightReturnOriginAirportAndTime().contains(flightReturnOriginAirport));
        Assert.assertTrue(paymentPage.flightReturnArrivalAirportAndTime().contains(flightReturnArrivalAirport));
    }

    @After
    public void after() {
        driver.quit();
    }
}
