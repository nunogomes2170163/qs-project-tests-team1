import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;

public class US7StepsDef {

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

    @Given("^the user is on the contact details page of the user with GUID \"([^\"]*)\" - US7$")
    public void theUserIsOnTheContactDetailsPageOfTheUserWithGUID(String guid) throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/get_contact.php?guid=" + guid);
        if (!guid.equals("000-invalid-000")) {
            WebElement guidElement = (new WebDriverWait(driver, 3))
                    .until(ExpectedConditions.presenceOfElementLocated(By.name("guid")));
            assertEquals(guidElement.getText(), "GUID: " + guid);
        }
    }

    @When("^the user clicks on the \"([^\"]*)\" button$")
    public void theUserClicksOnTheButton(String arg0) throws Throwable {
        driver.findElement(By.xpath("//a[contains(@href, 'index.php')]")).click();
    }

    @Then("^the \"([^\"]*)\" screen should be displayed$")
    public void theScreenShouldBeDisplayed(String subTittle) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")),subTittle));
    }
}
