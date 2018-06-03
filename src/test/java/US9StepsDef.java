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

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class US9StepsDef {
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

    @Given("^the user is on the resolve conflicts page$")
    public void theUserIsOnTheConflictsResolvePage() {
        driver.get("http://localhost:8080/resolve_conflicts.php");
        assertEquals(driver.findElement(By.xpath("//h2")).getText(), "CONTACT CONFLICTS");
    }

    @When("^the user clicks on the resolve button of \"([^\"]*)\" with GUIDs \"([^\"]*)\"$")
    public void theUserClicksOnResolveButton(String name, String guids) {
        WebElement resolveButton = driver.findElement(By.xpath("//div[@class='conflict-actions'][1]/a"));
        assertEquals(guids, resolveButton.getAttribute("href").split("guids=")[1]);
        resolveButton.click();
    }

    @Then("^the \"([^\"]*)\" screen should be displayed of the users with GUIDs \"([^\"]*)\" and \"([^\"]*)\"$")
    public void theUserShouldBeInTheResolveSingleConflictPage(String subTitle, String guid1, String guid2) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")), subTitle));
        assertEquals(guid1.concat("|").concat(guid2), driver.getCurrentUrl().split("guids=")[1]);
    }

    @And("^there should be two columns with the corresponding contact information of the conflict: ([^\"]*) - \"([^\"]*)\" and \"([^\"]*)\"$")
    public void thereShouldBeTwoColumnsWithTheInfo(int fieldNumber, String firstColumnData, String secondColumnData) {
        int columnsCount = driver.findElements(By.xpath("//div[@class='single-conflict']")).size();
        assertEquals(2, columnsCount);
        int numberOfFieldsFirstConflict = driver.findElements(By.xpath("//div[@class='single-conflict'][1]/p")).size();
        assertEquals(10, numberOfFieldsFirstConflict);
        int numberOfFieldsSecondConflict = driver.findElements(By.xpath("//div[@class='single-conflict'][2]/p")).size();
        assertEquals(10, numberOfFieldsSecondConflict);
        WebElement firstContactField = driver.findElement(By.xpath("//div[@class='single-conflict'][1]/p[" + fieldNumber + "]/label/span"));
        assertEquals(firstColumnData, firstContactField.getText());
        WebElement secondContactField = driver.findElement(By.xpath("//div[@class='single-conflict'][2]/p[" + fieldNumber + "]/label/span"));
        assertEquals(secondColumnData, secondContactField.getText());
    }

    @And("^the remove button on each one of the columns should not be displayed$")
    public void theRemoveButtonShouldNotBeDisplayed() {
        int numberOfCloseButtons = driver.findElements(By.xpath("//a[@class='js-remove-contact']")).size();
        assertEquals(0, numberOfCloseButtons);
    }

    @Given("^the user is on the \"([^\"]*)\" of the users with GUIDs \"([^\"]*)\" US9$")
    public void theUserIsOnResolveSingleConflictPage(String subTitle, String guids) {
        driver.get("http://localhost:8080/resolve_single_conflict.php?guids=d4f8d88d-afe1-4c63-821a-27as83d6bb49|d4f8d88d-afe1-4c63-821a-278883d6bb49");
        assertEquals(driver.findElement(By.xpath("//h2")).getText(), subTitle);
        assertEquals(guids, driver.getCurrentUrl().split("guids=")[1]);
    }

    @When("^the user clicks on the Back button US9$")
    public void theUserClicksBack() {
        WebElement backBtn = driver.findElement(By.xpath("//div[@class='options']/a[1]"));
        assertEquals("< back", backBtn.getText());
        backBtn.click();
    }

    @Then("^the \"([^\"]*)\" screen should be displayed US9$")
    public void theShowConflictsScreenShouldAppear(String subTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")), subTitle));
    }

    @Given("^the user is on the single conflict page of the users with GUIDs \"([^\"]*)\" US9$")
    public void theUserIsOnResolveSingleConflictPage(String guids) {
        driver.get("http://localhost:8080/resolve_conflicts.php");
        WebElement resolveButton = driver.findElement(By.xpath("//div[@class='conflict-actions'][1]/a"));
        assertEquals(guids, resolveButton.getAttribute("href").split("guids=")[1]);
        resolveButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")), "RESOLVE SINGLE CONFLICT"));
    }

    @Then("^the last column should have the \"([^\"]*)\" checked with number \"([^\"]*)\" US9$")
    public void checkLastColumnRadios(String radioName, int fieldNumber) {
        WebElement radio = driver.findElement(By.xpath("//div[@class='single-conflict'][2]/p[" + fieldNumber + "]/label/input"));
        assertNotNull(radio.getAttribute("checked"));
    }

    @Given("^the user is on the \"([^\"]*)\" of the users with GUIDs \"([^\"]*)\" US91$")
    public void theUserIsOnResolveSingleConflictPageWithThreeConflicts(String subTitle, String guids) {
        driver.get("http://localhost:8080/resolve_conflicts.php");
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")), "CONTACT CONFLICTS"));
        WebElement resolveButton = driver.findElements(By.xpath("//div[@class='conflict-actions']")).get(9).findElement(By.xpath("a[1]"));
        assertEquals(guids, resolveButton.getAttribute("href").split("guids=")[1]);
        resolveButton.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 3);
        wait1.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")), "RESOLVE SINGLE CONFLICT"));
    }

    @Then("^there should be presented three columns US9$")
    public void thereShouldBeThreeColumns() {
        int numberOfColumns = driver.findElements(By.xpath("//body/main/div[@class='single-conflict-container']/div[@class='single-conflict']")).size();
        assertEquals(3, numberOfColumns);
    }

    @And("^the remove button should be displayed on each one of the columns US9$")
    public void removeButtonShouldBeDisplayed() {
        int numberOfButtons = driver.findElements(By.xpath("//a[@class='js-remove-contact']")).size();
        assertEquals(3, numberOfButtons);
    }

    @When("^the user clicks on the remove button$")
    public void userClicksRemove() {
        WebElement removeButton = driver.findElements(By.className("js-remove-contact")).get(1);
        assertEquals("X", removeButton.getText());
        removeButton.click();
    }

    @Then("^there should be presented only two columns$")
    public void thereShouldOnlyBeTwoColumns() {
        int numberOfColumns = driver.findElements(By.className("single-conflict")).size();
        assertEquals(2, numberOfColumns);
    }

    @When("^the user clicks on the save button$")
    public void theUserSaves() {
        WebElement saveButton = driver.findElement(By.className("js-save-conflict"));
        assertEquals("Save", saveButton.getText());
        saveButton.click();
    }

    @Then("^the \"([^\"]*)\" page should be displayed$")
    public void thePreviousPageShouldBeDisplayed(String subTitle) {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")), subTitle));
    }

    @And("^all the conflicts related to the previous contacts should not appear on any of the columns$")
    public void allConflictsShouldBeResolved() {
        ArrayList<String> nameList = new ArrayList<String>();
        int rowsCount = driver.findElements(By.xpath("//body/descendant::div[@class='conflict-row']")).size();
        for(int i = 1; i <= rowsCount - 1; i++) {
            nameList.add(driver.findElement(By.xpath("//body/descendant::div[@class='conflict-row'][" + i + "]/div[1]/div[1]/p[1]")).getText());
        }
        for (String name: nameList) {
            assertFalse("Contact is present", name.contains("Estevan Rodrigues"));
        }
    }

}
