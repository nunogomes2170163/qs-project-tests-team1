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
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

public class US8StepsDef {

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



    @When("^the user clicks on the \"([^\"]*)\" button located bottom of the page title$")
    public void theUserClicksOnTheButtonLocatedBottomOfThePageTitle(String string) throws Throwable {
        WebElement openButton = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(@href, 'resolve_conflicts.php')]")));
        TestCase.assertEquals(openButton.getText(), string);
        openButton.click();
    }


    @Then("^the page sub title should be \"([^\"]*)\" - USSeven$")
    public void thePageSubTitleShouldBeUSSeven(String arg0) throws Throwable {
        TestCase.assertEquals(driver.findElement(By.xpath("//h2")).getText(),arg0);
    }

    @Given("^the user is on the COS - resolve conflicts page$")
    public void theUserIsOnTheCOSResolveConflictsPage() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/resolve_conflicts.php");
        assertEquals(driver.findElement(By.xpath("//h2")).getText(),"CONTACT CONFLICTS");
    }

    @Given("^the user is on the COS landing page US8")
    public void theUserIsOnTheCOSLandingPageUS() throws Throwable {
        driver.get("http://35.190.213.163/qs-project-team1/");
        assertEquals("Contacts Orchestrator Solution", driver.getTitle());
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
        driver.findElement(By.xpath("//a[contains(text(),'< back')]")).click();
    }



    @When("^the user clicks on the \"([^\"]*)\" button of the first entry on the \"([^\"]*)\"$")
    public void theUserClicksOnTheButtonOfTheFirstEntryOnThe(String arg0, String arg1) throws Throwable {
        driver.findElement(By.xpath("//a[contains(@href, 'dismiss_single_conflict.php?guids=d4f8d88d-afe1-4c63-821a-27as83d6bb49|d4f8d88d-afe1-4c63-821a-278883d6bb49')]")).click();

        assertEquals(driver.findElement(By.xpath("//h2")).getText(),"CONTACT CONFLICTS");
    }


    @Then("^the conflicts with those contacts should disappear from all columns$")
    public void theConflictsWithThoseContactsShouldDisappearFromAllColumns() throws Throwable {
        assertNotEquals(driver.findElement(By.xpath("//div[@id='Conflicts By Name']/div/div/div/p")).getText() , "Estevan Rodrigues,");
        assertNotEquals(driver.findElement(By.xpath("//div[@id='Conflicts By Email']/div/div/div/p")).getText() , "Estevan Rodrigues,");
        assertNotEquals(driver.findElement(By.xpath("//div[@id='Conflicts By Phone']/div/div/div/p")).getText() , "Estevan Rodrigues,");
    }

    @When("^there are contact conflicts to resolve$")
    public void thereAreContactConflictsToResolve() throws Throwable {
        assertEquals(driver.findElement(By.xpath("//div[@id='Conflicts By Name']/div/div/div/p")).getText() , "Estevan Rodrigues, ");
    }

    @Then("^the button \"([^\"]*)\" should not be visible$")
    public void theButtonShouldNotBeVisible(String arg0) throws Throwable {
        assert(driver.findElements(By.className("button")).isEmpty());
    }


    @Then("^all the contact conflicts on the column with the title \"([^\"]*)\" should be detected by \"([^\"]*)\"$")
    public void allTheContactConflictsOnTheColumnWithTheTitleShouldBeDetectedBy(String arg0, String arg1) throws Throwable {
        String str = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/h1/span")).getText();
        String[] splited = str.split(" ");
        int rows = Integer.parseInt(splited[0].substring(1));

        String a, b, c;
        for (int i = 1; i < rows; i++) {
            Integer countContacs = 2;
            if(!driver.findElements(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[3]")).isEmpty()) {
                countContacs = 3;
                if (!driver.findElements(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[4]")).isEmpty()) {
                    countContacs = 4;
                }
            }
            if (arg1.equals("name")) {
                a = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p")).getText();
                if (countContacs == 3) {
                    b = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[2]")).getText();
                    assertEquals(a , b);
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[3]")).getText(), a.substring(0 , a.length() - 2));
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[3]")).getText(), b.substring(0 , b.length() - 2));
                } else if (countContacs == 4) {
                    b = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[2]")).getText();
                    c = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[3]")).getText();
                    assertEquals(a, b);
                    assertEquals(a, c);
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[4]")).getText(), a.substring(0 , a.length() - 2));
                    assertEquals(b, c);
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[4]")).getText(), b.substring(0 , b.length() - 2));
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[4]")).getText(), c.substring(0 , c.length() - 2));
                } else {
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div/p[2]")).getText(), a.substring(0 , a.length() - 2));
                }
            } else {
                System.out.println("TESTFE " + String.valueOf(countContacs));
                a = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p")).getText();
                System.out.println("TESTFA " + a);
                if (countContacs == 3) {
                    b = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[2]")).getText();
                    assertEquals(a , b);
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[3]")).getText(), a.substring(0 , a.length() - 2));
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[3]")).getText(), b.substring(0 , b.length() - 2));
                } else if (countContacs == 4) {
                    b = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[2]")).getText();
                    c = driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[3]")).getText();
                    assertEquals(a, b);
                    assertEquals(a, c);
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[4]")).getText(), a.substring(0 , a.length() - 2));
                    assertEquals(b, c);
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[4]")).getText(), b.substring(0 , b.length() - 2));
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[4]")).getText(), c.substring(0 , c.length() - 2));
                } else {
                    assertEquals(driver.findElement(By.xpath("//div[@id='" + arg0 + "']/div[" + i + "]/div/div[2]/p[2]")).getText(), a.substring(0 , a.length() - 2));
                }
            }
        }
    }
}
