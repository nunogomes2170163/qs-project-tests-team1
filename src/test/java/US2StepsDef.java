import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class US2StepsDef {


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

    @Given("^the user is on the COS landing page - US2$")
    public void theUserIsOnContactsList() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        TestCase.assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @When("^the search field is filled out with \"([^\"]*)\"$")
    public void theSearchFieldIsFilledOutWith(String searchText) throws Throwable {
        WebElement searchbox = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='contacts_filter']/label/input")));
        searchbox.clear();
        searchbox.sendKeys(searchText);
    }

    @Then("^the list should display (\\d+) contacts$")
    public void theListShouldDisplayContacts(int number) throws Throwable {
        int rowsCount = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr")).size();
        assertEquals(number, rowsCount);
    }

    @And("^the column Name of the results must contain \"([^\"]*)\"$")
    public void theColumnNameOfTheResultsMustContain(String searchText) throws Throwable {
        ArrayList<String> nameList = new ArrayList<String>();
        int rowsCount = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr")).size();
        for(int i = 1; i <= rowsCount; i++) {
            nameList.add(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr[" + i + "]/td[2]")).getText());
        }

        for (String name: nameList) {
            assertTrue(name.contains(searchText));
        }
    }

    @Then("^the list should display the \"([^\"]*)\" message$")
    public void theListShouldDisplayTheMessage(String results) throws Throwable {
        assertEquals(results, driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td")).getText());
    }

    @And("^the number of results message should be \"([^\"]*)\" - US2$")
    public void theNumberOfResultsMessageShouldBe(String resultsInfo) throws Throwable {
        WebElement contactsInfoElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("contacts_info")));
        assertEquals(resultsInfo, contactsInfoElement.getText());
    }
}
