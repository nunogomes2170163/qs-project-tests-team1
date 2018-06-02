import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class US8StepsDef {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("phantomjs.binary.path",
                "drivers/phantomjs");
        driver = new PhantomJSDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("^the user is on the resolve conflicts page$")
    public void theUserIsOnTheResolveConflictsPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^the user clicks on the resolve button of \"([^\"]*)\"$")
    public void theUserClicksOnTheResolveButtonOf(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the \"([^\"]*)\" screen should be displayed of the users with GUIDs \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theScreenShouldBeDisplayedOfTheUsersWithGUIDsAnd(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^it should be presented two columns with the corresponding contact information of the conflict$")
    public void itShouldBePresentedTwoColumnsWithTheCorrespondingContactInformationOfTheConflict() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^should not be presented the remove button on each one of the columns$")
    public void shouldNotBePresentedTheRemoveButtonOnEachOneOfTheColumns() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
