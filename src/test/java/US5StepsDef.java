import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotEquals;

public class US5StepsDef {

    private WebDriver driver;

    @Given("^the user is on the first page of the contacts list$")
    public void contactsListFirstPage() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @And("^the first result on the list is \"([^\"]*)\"$")
    public void theFirstResultOnTheListShouldBe(String name) throws Throwable {
        ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")),name);
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
        assertNotEquals(name, driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")).getText());
    }

    @And("^the page 2 button should be active$")
    public void page2ButtonIsActive() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[3]"));
        assertEquals("mdl-button  mdl-button--raised mdl-button--colored", webElement.getAttribute("class"));
    }

    @Given("^the user is on the first page of the contact list available$")
    public void theUserIsOnTheFirstPageOfTheContactListAvailable() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[2]"));
        assertEquals("mdl-button  mdl-button--raised mdl-button--colored", webElement.getAttribute("class"));
    }

    @Then("^the \"([^\"]*)\" button should be disabled$")
    public void theButtonShouldBeDisabled(String buttonName) throws Throwable {
        //WebElement webElement = driver.findElement(By.xpath("//div[@id='contacts_paginate']/div/button"));
        //assertEquals(webElement.getAttribute("disabled"),"true");
        WebElement webElement = driver.findElement(By.xpath("//button[@id='" + buttonName + "']"));
        assertEquals(webElement.getAttribute("disabled"),"true");
    }

    @Given("^the user is on the last page of the contact list available$")
    public void theUserIsOnTheLastPageOfTheContactListAvailable() throws Throwable {
        driver.findElement(By.xpath("//button[@data-dt-idx='7']")).click();
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
}
