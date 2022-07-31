package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.*;

public class SearchForFlights extends BasePage {

    HomePage homePage;
    FlightPage flightPage;
    FlightsListPage flightsListPage;
    PaymentPage paymentPage;

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
    }

    @When("The user chooses Depart flight")
    public void the_user_chooses_depart_flight() {
        flightsListPage.chooseDepartListedFlights();
    }

    @When("The user chooses Return flight")
    public void the_user_chooses_return_flight() {
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
    }

    @Then("Check the Return flight info is correct")
    public void check_the_return_flight_info_is_correct() {
        paymentPage.checkReturnFlightInfo();
    }

    @After
    public void after() {
        driver.quit();
    }
}
