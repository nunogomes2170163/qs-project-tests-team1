import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static junit.framework.TestCase.assertEquals;

public class US6StepsDef {

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

    @Given("^the user is on the contact details page of the user with GUID \"([^\"]*)\"$")
    public void theUserIsOnTheContactDetailsPageOfTheUserWithGUID(String guid) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//p")), guid);
    }

    @Then("^the page sub title should be \"([^\"]*)\"$")
    public void thePageSubTitleShouldBe(String subTittle) throws Throwable {
        assertEquals(driver.findElement(By.xpath("//h2")),subTittle);
    }
}
