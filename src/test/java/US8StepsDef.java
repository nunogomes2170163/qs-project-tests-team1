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

import static org.junit.Assert.assertEquals;

public class US8StepsDef {

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



    @When("^the user clicks on the \"([^\"]*)\" button located bottom of the page title$")
    public void theUserClicksOnTheButtonLocatedBottomOfThePageTitle(String string) throws Throwable {
        WebElement openButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href, 'resolve_conflicts.php')]")));
        TestCase.assertEquals(openButton.getText(), string);
        userGuidTable = driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td")).getText();
        userFullNameTable = driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")).getText();
        openButton.click();
    }


    @Then("^the page sub title should be \"([^\"]*)\" - USSeven$")
    public void thePageSubTitleShouldBeUSSeven(String arg0) throws Throwable {
        TestCase.assertEquals(driver.findElement(By.xpath("//h2")).getText(),arg0);
    }

    @Given("^the user is on the COS - resolve conflicts page$")
    public void theUserIsOnTheCOSResolveConflictsPage() throws Throwable {
        driver.get("http://localhost:8080/resolve_conflicts.php");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
        assertEquals(driver.findElement(By.xpath("//h2")).getText(),"CONTACT CONFLICTS");
    }





    @Then("^the \"([^\"]*)\" screen should be displayed - USseve$")
    public void theScreenShouldBeDisplayedUSseve(String arg0) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")),arg0));
    }

    @Then("^it should appear a column with the title \"([^\"]*)\"$")
    public void itShouldAppearAColumnWithTheTitle(String arg0) throws Throwable {
        String str = driver.findElement(By.id(arg0)).getText();
        String[] splited = str.split(" ");
        assertEquals(splited[0] + " " + splited[1] + " " +splited[2], arg0);
    }

    @And("^there should be a button to resolve conflict and a button to keep all contacts on each entry of the column \"([^\"]*)\"$")
    public void thereShouldBeAButtonToResolveConflictAndAButtonToKeepAllContactsOnEachEntryOfTheColumn(String arg0) throws Throwable {
        String str = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/h1/span")).getText();
        String[] splited = str.split(" ");
        int rows = Integer.parseInt(splited[0].substring(1));
        for (int i = 1; i < rows; i++) {
            assertEquals(driver.findElement(By.xpath("//div[" + i + "]/div[2]/a")).getText(), "resolve");
            assertEquals(driver.findElement(By.xpath("//div[" + i + "]/div[2]/a[2]")).getText(), "keep all");
        }
    }

    @And("^the column \"([^\"]*)\" should have \"([^\"]*)\" conflicts to resolve$")
    public void theColumnShouldHaveConflictsToResolve(String arg0, String arg1) throws Throwable {
        String str = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/h1/span")).getText();
        String[] splited = str.split(" ");
        assertEquals(splited[0].substring(1), arg1);
    }


    @When("^the user clicks on the \"([^\"]*)\" button US8")
    public void theUserClicksOnTheButtonUS(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the user is on the COS landing page US8")
    public void theUserIsOnTheCOSLandingPageUS() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
