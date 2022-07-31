package stepDefinition;

import pageObject.BasePage;
import pageObject.HomePage;
import pageObject.MemberLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.RegisterPage;

public class UserCreate extends BasePage {
    HomePage homePage;
    MemberLoginPage memberLogin;
    RegisterPage register;

    @Given("The user Goes to obilet Home Page")
    public void the_user_goes_to_obilet_Home_Page() {
        BasePage.setup();
        driver.get("https://www.obilet.com/en");
    }

    @Then("Home page is opened correctly")
    public void home_page_is_opened_correctly() {
        homePage = new HomePage();
        Assert.assertTrue(homePage.checkHomePageisDisplayed());
        System.out.println("Successfully Home Page Displayed");
    }

    @When("The user clicks on member login button")
    public void the_user_clicks_on_member_login_button() {
        homePage.clickMemberLoginButton();
        System.out.println("The user clicked Login Button successfully");
    }

    @Then("membership pop up is displayed")
    public void membership_pop_up_is_displayed() {
        memberLogin = new MemberLoginPage();
        Assert.assertTrue(memberLogin.membershipPopupDisplayed());
        System.out.println("Membership Pop-up is displayed successfully");
    }

    @When("The user clicks register button")
    public void the_user_clicks_register_button() {
        memberLogin.clickRegisterButton();
        System.out.println("Register linked successfully");
    }

    @When("The user type email {string} and password")
    public void the_user_type_email_and_password(String email) {
        register = new RegisterPage();
        register.typeEmailInput(email);
        register.typePasswordInput("obilet.com");
    }

    @When("The user click register button")
    public void the_user_click_register_button() {
        register.clickRegisterButton();
        System.out.println("Registered Successfully");
    }

    @Then("New user is created successfully is displayed")
    public void new_user_is_created_successfully_is_displayed() {
        homePage.checkMyAccountButton();
        driver.quit();
        System.out.println("New user account is created successfully");
    }
}
