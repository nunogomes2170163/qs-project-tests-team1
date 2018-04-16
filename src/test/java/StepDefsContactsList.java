import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class StepDefsContactsList {
    private WebDriver driver;

    @Given("^the user is on localhost:8080$")
    public void iAmOnTheContactsListPage() throws Throwable {
        driver.get("http://localhost:8080");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @Then("^the page title should start with \"([^\"]*)\"$")
    public void thePageSubTitleShouldStartWith(String pageTitleStart) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleContains(pageTitleStart));
    }

    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
