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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Given("^I access the landing page of COS - US(\\d+)$")
    public void iAccessTheLandingPageOfCOSUS(int arg0) throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
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
        Select select = new Select(driver.findElement(By.xpath("//div[@id='contacts_length']/label/select")));
        select.selectByVisibleText(String.valueOf(100));
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
        WebElement clickFacebook = driver.findElement(By.xpath("//div[2]/label/span"));
        WebElement clickLinkedIn = driver.findElement(By.xpath("//span"));
        clickFacebook.click();
        clickLinkedIn.click();
        assertTrue(!checkboxFacebook.isSelected());
        assertTrue(!checkboxLinkedIn.isSelected());
    }

    @Then("^the \"([^\"]*)\" message should be displayed$")
    public void theMessageShouldBeDisplayed(String text) throws Throwable {
        WebElement noContactsElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='contacts']/tbody/tr/td")));
        assertEquals(noContactsElement.getText(), text);
    }

    @When("^I turn \"([^\"]*)\" switch off$")
    public void iTurnSwitchOff(String filter) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        if (filter.equals("Facebook")) {
            WebElement checkboxFacebook = driver.findElement(By.id("FACEBOOK"));
            WebElement clickFacebook = driver.findElement(By.xpath("//div[2]/label/span"));
            clickFacebook.click();
            assertTrue(!checkboxFacebook.isSelected());
        } else if (filter.equals("LinkedIn")) {
            WebElement checkboxLinkedIn = driver.findElement(By.id("LINKED_IN"));
            WebElement clickLinkedIn = driver.findElement(By.xpath("//span"));
            clickLinkedIn.click();
            assertTrue(!checkboxLinkedIn.isSelected());
        }
    }

    @Then("^The contacts list should not display results with the \"([^\"]*)\" source$")
    public void theContactsListShouldNotDisplayResultsWithTheSource(String filter) throws Throwable {
        Select select = new Select(driver.findElement(By.xpath("//div[@id='contacts_length']/label/select")));
        select.selectByVisibleText(String.valueOf(100));
        if (filter.equals("Facebook")) {
            List<WebElement> elementsList = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr/td[3]"));
            int count = 0;
            for (WebElement element : elementsList) {
                if (element.getText().equals(filter)) {
                    count++;
                }
            }
            assertTrue(count == 0);
        } else if (filter.equals("LinkedIn")) {
            List<WebElement> elementsList = driver.findElements(By.xpath("//table[@id='contacts']/tbody/tr/td[3]"));
            WebElement checkboxLinkedIn = driver.findElement(By.id("LINKED_IN"));
            assertTrue(!checkboxLinkedIn.isSelected());
            int count = 0;
            for (WebElement element : elementsList) {
                if (element.getText().equals(filter)) {
                    count++;
                }
            }
            assertTrue(count == 0);
        }
    }
}
