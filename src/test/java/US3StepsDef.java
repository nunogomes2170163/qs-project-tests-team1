import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class US3StepsDef {
    private WebDriver driver;

    @When("^the user changes the number of results to (\\d+)$")
    public void changeNumberOfResultsPerPage(int results) throws Throwable {
        Select select = new Select(driver.findElement(By.xpath("//div[@id='contacts_length']/label/select")));
        select.selectByVisibleText(String.valueOf(results));
    }

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


    @Then("^the contact list should show (\\d+) results in the current page$")
    public void theContactListShouldShowResultsInTheCurrentPage(int results) throws Throwable {
        int rowsCount = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr")).size();
        assertEquals(rowsCount, results);
    }

    @And("^\"([^\"]*)\" should be the message of results$")
    public void shouldBeTheMessageOfResults(String resultsInfo) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//div[@id='contacts_info']")).getText(),resultsInfo);
    }
}
