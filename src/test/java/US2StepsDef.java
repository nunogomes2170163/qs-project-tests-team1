import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class US2StepsDef {


    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("phantomjs.binary.path",
                "drivers\\phantomjs.exe");
        driver = new PhantomJSDriver();
        driver.get("http://35.190.213.163/qs-project-team1/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("^the search field is filled out with \"([^\"]*)\"$")
    public void theSearchFieldIsFilledOutWith(String searchText) throws Throwable {
        WebElement searchbox = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='contacts_filter']/label/input")));
        searchbox.clear();
        searchbox.sendKeys(searchText);
    }

    @Then("^the list should display the \"([^\"]*)\" message$")
    public void theListShouldDisplayTheMessage(String results) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td")).getText(),results);
    }


    @And("^the number of results message should be \"([^\"]*)\"$")
    public void theNumberOfResultsMessageShouldBe(String resultsInfo) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//div[@id='contacts_info']")).getText(),resultsInfo);
    }
}
