import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import junit.framework.TestCase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotSame;
import static org.junit.Assert.assertNotEquals;

public class US5StepsDef {

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

    @Given("^the user is on the COS landing page - US5$")
    public void theUserIsOnContactsList() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        TestCase.assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @And("^the first result on the list is \"([^\"]*)\"$")
    public void theFirstResultOnTheListShouldBe(String name) throws Throwable {
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")),name));
    }

    @And("^the page 1 button is active$")
    public void page1ButtonIsActive() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[2]"));
        assertEquals("mdl-button  mdl-button--raised mdl-button--colored", webElement.getAttribute("class"));
    }

    @When("^the user clicks on page number 2$")
    public void clickPage2() throws Throwable {
        driver.findElement(By.xpath("//button[3]")).click();
    }

    @Then("^the first result should be different than \"([^\"]*)\"$")
    public void firstResultDifferent(String name) throws Throwable {
        assertNotSame(name, driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")).getText());
    }

    @And("^the page 2 button should be active$")
    public void page2ButtonIsActive() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[3]"));
        assertEquals("mdl-button  mdl-button--raised mdl-button--colored", webElement.getAttribute("class"));
    }

    @When("^the user is on page (\\d+) of the contact list available$")
    public void theUserIsOnPageOfTheContactListAvailable(int page) throws Throwable {
        WebElement pageButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='contacts_paginate']/div/button["+ (page + 1) +"]")));
        pageButton.click();
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.attributeContains(By.xpath("//div[@id='contacts_paginate']/div/button["+ page +"]"), "class", "mdl-button--colored"));
    }

    @Then("^the \"([^\"]*)\" page button should be enabled$")
    public void theButtonShouldBeEnabled(String button) throws Throwable {
        WebElement pageButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("contacts_" + button)));
        assertNotSame("true", pageButton.getAttribute("disabled"));
    }

    @When("^the user clicks on the next button$")
    public void theUserClicksOnTheNextButton() throws Throwable {
        WebElement nextButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='contacts_next']")));
        nextButton.click();
    }

    @When("^the user clicks on the previous button$")
    public void theUserClicksOnThePreviousButton() throws Throwable {
        WebElement pageButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='contacts_previous']")));
        pageButton.click();
    }

    @And("^the user is on the first page of the contact list available$")
    public void theUserIsOnTheFirstPageOfTheContactListAvailable() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[2]"));
        assertEquals("mdl-button  mdl-button--raised mdl-button--colored", webElement.getAttribute("class"));
    }

    @Then("^the \"([^\"]*)\" page button should be disabled$")
    public void theButtonShouldBeDisabled(String buttonName) throws Throwable {
        WebElement webElement = driver.findElement(By.id("contacts_" + buttonName));
        assertEquals("true", webElement.getAttribute("disabled"));
    }

    @And("^the user is on the last page of the contact list available$")
    public void theUserIsOnTheLastPageOfTheContactListAvailable() throws Throwable {
        driver.findElement(By.xpath("//button[@data-dt-idx='7']")).click();
    }

    @And("^the number of results message should be \"([^\"]*)\" - US5$")
    public void theNumberOfResultsMessageShouldBe(String resultsInfo) throws Throwable {
        WebElement contactsInfoElement = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("contacts_info")));
        Assert.assertEquals(resultsInfo, contactsInfoElement.getText());
    }
}
