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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

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
        driver.get("http://localhost:8080/");
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

    @When("^Facebook and Linkedin switches are enabled$")
    public void facebookAndLinkedinSwitchesAreEnabled() throws Throwable {
        WebElement checkboxFacebook = driver.findElement(By.id("FACEBOOK"));
        WebElement checkboxLinkedIn = driver.findElement(By.id("LINKED_IN"));
        assertTrue(checkboxFacebook.isSelected());
        assertTrue(checkboxLinkedIn.isSelected());
    }

    @Then("^the contact list must display contacts from both sources$")
    public void theContactListMustDisplayContactsFromBothSources() throws Throwable {
        List<WebElement> elementsList = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr/td[3]"));
        int countFacebook = 0;
        int countLinkedIn = 0;
        for (WebElement element : elementsList) {
            if (element.getText().equals("Facebook")) {
                countFacebook++;
            } else if (element.getText().equals("LinkedIn")) {
                countLinkedIn++;
            }
        }
        assertTrue(countFacebook > 0);
        assertTrue(countLinkedIn > 0);
    }

    @When("^Facebook and Linkedin switches are not enabled$")
    public void facebookAndLinkedinSwitchesAreNotEnabled() throws Throwable {
        WebElement checkboxFacebook = driver.findElement(By.id("FACEBOOK"));
        WebElement checkboxLinkedIn = driver.findElement(By.id("LINKED_IN"));
        assertTrue(!checkboxFacebook.isSelected());
        assertTrue(!checkboxLinkedIn.isSelected());
    }

    @Then("^the \"([^\"]*)\" message should be displayed$")
    public void theMessageShouldBeDisplayed(String text) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.className("no-contacts")),text));
    }


    @When("^I turn <\"([^\"]*)\"> switch off$")
    public void iTurnSwitchOff(String filter) throws Throwable {
        if (filter.equals("Facebook")) {
            WebElement webElement = driver.findElement(By.xpath("//div[2]/label/span"));
            webElement.click();
        } else if (filter.equals("LinkedIn")) {
            WebElement webElement = driver.findElement(By.xpath("//span"));
            webElement.click();
        }
    }
}
