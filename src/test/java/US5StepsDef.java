import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class US5StepsDef {

    private WebDriver driver;

    @Given("^the user is on the first page of the contact list$")
    public void contactsListFirstPage() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
    }

    @And("^the first result is \"([^\"]*)\"$")
    public void firstResultIs(String name) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath("/table/tr[1]/td[1]"), name));
    }

    @Before
    public void setUp() {
        System.setProperty("phantomjs.binary.path",
                "drivers/phantomjs");
        driver = new PhantomJSDriver();
        driver.get("http://35.190.213.163/qs-project-team1/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("^the user is on the first page of the contact list available$")
    public void theUserIsOnTheFirstPageOfTheContactListAvailable() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//button[2]"));
        assertEquals(webElement.getAttribute("class"), "mdl-button  mdl-button--raised mdl-button--colored");
    }

    @Then("^the \"([^\"]*)\" button should be disabled$")
    public void theButtonShouldBeDisabled(String arg0) throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//div[@id='contacts_paginate']/div/button"));
        assertEquals(webElement.getAttribute("disabled"),"true");
    }
}
