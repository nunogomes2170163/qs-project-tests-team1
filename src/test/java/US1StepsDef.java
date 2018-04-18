import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class US1StepsDef {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("phantomjs.binary.path",
                "drivers\\phantomjs.exe");
        driver = new PhantomJSDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("^I access the landing page of COS$")
    public void iAccessTheLandingPageOfCOS() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @Then("^the title of the page should be \"([^\"]*)\"$")
    public void theTitleOfThePageShouldBe(String title) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.titleContains(title));
    }

    @And("^I can see the text \"([^\"]*)\"$")
    public void iCanSeeTheText(String text) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("body")),text));
    }

    @Then("^the sub title of the page should be \"([^\"]*)\"$")
    public void theSubTitleOfThePageShouldBe(String subTitle) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("sub-title")),subTitle));
    }

    @And("^the \"([^\"]*)\" message should be displayed$")
    public void noContactsShouldBeDisplayed(String text) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("no-contacts")),text));
    }

    @And("^the contact list should show (\\d+) results$")
    public void theContactListShouldShowResults(int results) throws Throwable {
        int rowsCount = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr")).size();
        assertEquals(results, rowsCount);
    }

    @And("^the number of results message should be \"([^\"]*)\" - US1$")
    public void theNumberOfResultsMessageShouldBe(String resultsInfo) throws Throwable {
        WebElement contactsInfoElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("contacts_info")));
        assertEquals(resultsInfo, contactsInfoElement.getText());
    }
}
