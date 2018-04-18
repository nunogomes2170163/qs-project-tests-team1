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
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class US4StepsDef {

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

    @Given("^the user is on the COS landing page - US4$")
    public void theUserIsOnContactsList() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        TestCase.assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @When("^the user clicks twice on the name sort parameter$")
    public void theUserClicksTwiceOnTheNameSortParameter() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//table[@id='contacts']/thead/tr/th[2]"));
        webElement.click();
        webElement.click();
    }

    @Then("^the contacts list should be sorted by name in ascending order$")
    public void theContactsListShouldBeSortedByNameInAscendingOrder() throws Throwable {
        ArrayList<String> nameList = new ArrayList<String>();
        for(int i = 1; i < 11; i++) {
            nameList.add(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr[" + i + "]/td[2]")).getText());
        }
        List tmp = new ArrayList<String>(nameList);
        Collections.sort(tmp);
        assertEquals(nameList, tmp);
    }

    @When("^the user clicks on the name sort parameter$")
    public void theUserClicksOnTheNameSortParameter() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//table[@id='contacts']/thead/tr/th[2]"));
        webElement.click();
    }

    @Then("^the contacts list should be sorted by name in descending order$")
    public void theContactsListShouldBeSortedByNameInDescendingOrder() throws Throwable {
        ArrayList<String> nameList = new ArrayList<String>();
        for(int i = 1; i < 11; i++) {
            nameList.add(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr[" + i + "]/td[2]")).getText());
        }
        List tmp = new ArrayList<String>(nameList);
        Collections.sort(tmp);
        Collections.reverse(tmp);
        assertEquals(nameList, tmp);
    }

    @And("^the first result on the list should be \"([^\"]*)\"$")
    public void theFirstResultOnTheListShouldBe(String name) throws Throwable {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")), name));
    }
}
