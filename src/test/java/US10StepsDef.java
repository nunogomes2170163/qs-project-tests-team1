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
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US10StepsDef {
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

    @Given("^the user is on the resolve conflicts page of the COS website$")
    public void theUserIsOnTheResolveConflictsPageOfTheCOSWebsite() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/resolve_conflicts.php");
        assertEquals(driver.findElement(By.xpath("//h2")).getText(),"CONTACT CONFLICTS");
    }

    @When("^the user resolves all conflicts$")
    public void theUserResolvesAllConflicts() throws Throwable {
        int size = driver.findElements(By.xpath("//div[@id='Conflicts By Name']/div/div[2]/a[2]")).size();
        for (int i = 0; i < size; i++) {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            assertTrue(driver.findElements(By.className("button")).isEmpty());
            WebElement keepAll = driver.findElement(By.xpath("//div[@id='Conflicts By Name']/div/div[2]/a[2]"));
            keepAll.click();
        }
    }

    @Then("^all the 3 columns should have the text \"([^\"]*)\" on the title$")
    public void allTheColumnsShouldHaveTheTextOnTheTitle(String text) throws Throwable {
        List<WebElement> columns = driver.findElements(By.xpath("//div/h1"));
        for (WebElement column: columns) {
            assertTrue(column.getText().toLowerCase().contains(text.toLowerCase()));
        }
    }

    @And("^the \"([^\"]*)\" button should be displayed$")
    public void theButtonShouldBeDisplayed(String text) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href, 'export.php')]")));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//a[contains(@href, 'export.php')]")), text));
    }

    @And("^all conflicts are resolved$")
    public void allConflictsAreResolved() throws Throwable {
        int size = driver.findElements(By.xpath("//div[@id='Conflicts By Name']/div/div[2]/a[2]")).size();
        for (int i = 0; i < size; i++) {
            WebDriverWait wait = new WebDriverWait(driver, 3);
            WebElement keepAll = driver.findElement(By.xpath("//div[@id='Conflicts By Name']/div/div[2]/a[2]"));
            keepAll.click();
        }
    }

    @And("^the \"([^\"]*)\" button is displayed$")
    public void theButtonIsDisplayed(String text) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href, 'export.php')]")));
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//a[contains(@href, 'export.php')]")), text));
    }

    @When("^the user clicks on the Export contacts button$")
    public void theUserClicksOnTheExportContactsButton() throws Throwable {
        WebElement exportButton = driver.findElement(By.xpath("//a[contains(@href, 'export.php')]"));
        exportButton.click();
    }

    @Then("^the browser should download a csv file with the contacts list free of duplicates containing \"([^\"]*)\" on the filename$")
    public void theBrowserShouldDownloadACsvFileWithTheContactsListFreeOfDuplicatesContainingOnTheFilename(String filename) throws Throwable {
        // To be implemented - probably not possible because of the need to check the downloaded file and its data
    }
}
