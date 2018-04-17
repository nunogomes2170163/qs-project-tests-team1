import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class US3StepsDef {
    private WebDriver driver;

    @When("^the user changes the number of results to 25$")
    public void changeNumberOfResultsPerPage() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        //wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.tagName("select"))));
        Select dropdown = new Select(driver.findElement(By.tagName("select")));
        dropdown.selectByVisibleText("25");
    }

    @Then("^the contacts list should display 25 results in the current page$")
    public void listShouldDisplay25Results() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        Dimension numberOfRows = driver.findElement(By.xpath("//table[@class='hover dataTable no-footer']/tbody/tr")).getSize();
        Assert.assertEquals(25, numberOfRows.width);
    }

    @Before
    public void setUp() {
        driver = new HtmlUnitDriver();
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
