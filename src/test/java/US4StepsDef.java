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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class US4StepsDef {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("phantomjs.binary.path",
                "drivers\\phantomjs.exe");
        driver = new PhantomJSDriver();

        driver.get("http://35.190.213.163/qs-project-team1/");
    }

    @After
    public void tearDown() {
        driver.close();
    }


    @Given("^the user clicks on the name sort parameter$")
    public void theUserClicksOnTheNameSortParameter() throws Throwable {
        WebElement webElement = driver.findElement(By.xpath("//table[@id='contacts']/thead/tr/th[2]"));
        webElement.click();
    }

    @Then("^the contacts list should be sorted by name in descending order$")
    public void theContactsListShouldBeSortedByNameInDescendingOrder() throws Throwable {
        ArrayList<String> nameList = new ArrayList<String>();
        for(int i = 1; i < 11; i++) {
            nameList.add(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr[" + i + "]/td[2]")).getText());
        }
        List tmp = new ArrayList(nameList);
        Collections.sort(tmp);
        Collections.reverse(tmp);
        if (!tmp.equals(nameList)) {
            assert false;
        }
    }

    @And("^the first result on the list should be \"([^\"]*)\"$")
    public void theFirstResultOnTheListShouldBe(String name) throws Throwable {
        ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//table[@id='contacts']/tbody/tr/td[2]")),name);
    }
}
