import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US7StepsDef {

        private WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("phantomjs.binary.path",
                    "drivers\\phantomjs.exe");
            driver = new PhantomJSDriver();
            driver.get("http://35.190.213.163/qs-project-team1/get_contact.php?guid=021a1dc3-5b75-4868-bb03-333170ce9acb");
        }

        @After
        public void tearDown() {
            driver.close();
        }

    @When("^the user clicks on the \"([^\"]*)\" button$")
    public void theUserClicksOnTheButton(String arg0) throws Throwable {
        driver.findElement(By.xpath("//a[contains(@href, 'index.php')]")).click();
    }

    @Then("^the \"([^\"]*)\" screen should be displayed$")
    public void theScreenShouldBeDisplayed(String subTittle) throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//h2")),subTittle));
    }
}
