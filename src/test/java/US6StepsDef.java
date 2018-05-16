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

import static junit.framework.TestCase.assertEquals;

public class US6StepsDef {
    private WebDriver driver;
    private String userGuidTable;
    private String userFullNameTable;

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

    @Given("^the user is on the COS landing page - US6$")
    public void theUserIsOnContactsList() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        TestCase.assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @When("^the user clicks on the \"([^\"]*)\" option of the first result$")
    public void theUserClicksOnTheOptionOfTheFirstResult(String openText) throws Throwable {
        WebElement openButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@id='contacts']/tbody/tr/td[3]/a")));
        assertEquals(openButton.getText(), openText);
        userGuidTable = driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td")).getText();
        userFullNameTable = driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")).getText();
        openButton.click();
    }

    @Then("^the GUID and Name fields should match the first list result on the contacts list screen$")
    public void theGUIDAndNameFieldsShouldMatchTheFirstListResultOnTheContactsListScreen() throws Throwable {
        WebElement guidElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p")));
        assertEquals(guidElement.getText(), "GUID: " + userGuidTable);
        String givenName = driver.findElement(By.xpath("//div/div/p")).getText();
        String surname = driver.findElement(By.xpath("//div[2]/p")).getText();
        assertEquals(givenName + " " + surname, userFullNameTable);
    }

    @Given("^the user is on the contact details page of the user with GUID \"([^\"]*)\" - US6$")
    public void theUserIsOnTheContactDetailsPageOfTheUserWithGUID(String guid) throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/get_contact.php?guid=" + guid);
        if (!guid.equals("000-invalid-000")) {
            WebElement guidElement = (new WebDriverWait(driver, 3))
                    .until(ExpectedConditions.presenceOfElementLocated(By.name("guid")));
            assertEquals(guidElement.getText(), "GUID: " + guid);
        }
    }

    @Then("^the page sub title should be \"([^\"]*)\"$")
    public void thePageSubTitleShouldBe(String subTittle) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//h2")).getText(),subTittle);
    }

    @Then("^the page should present a \"([^\"]*)\" message$")
    public void thePageShouldPresentAMessage(String message) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//body")).getText(),message);
    }

    @Then("^the \"([^\"]*)\" field should be filled with \"([^\"]*)\"$")
    public void theFieldShouldBeFilledWith(String field, String value) throws Throwable {
        WebElement fieldElement = driver.findElement(By.name(field));
        assertEquals(fieldElement.getText(), value);
    }

    @And("^the a profile photo should be displayed$")
    public void theAProfilePhotoShouldBeDisplayed() throws Throwable {
        WebElement photoElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("avatar")));
        driver.get(photoElement.getAttribute("src"));
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img")));
    }
}
