package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SearchSteps {
    WebDriver driver;
    @Given("the user is in the index page")
    public void theUserIsInIndexPage() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.navigate().to("http://automationpractice.com/index.php");

    }
  //    No olvidar agregar un ^ cuando se usa (.*)
  @When("^the user enters (.*) in the search bar")
  public void userEntersDressesInSearchBar(String article) {
        driver.findElement(By.id("search_query_top")).sendKeys(article);
    }

    @When("the user clicks the search button")
    public void userClicksSearchButton() {
        driver.findElement(By.name("submit_search")).click();
    }

    @Then("^the (.*) page appears")
    public void dressesPage(String article) {
        String title = driver.findElement(By.className("lighter")).getText();
        Assert.assertEquals(title, "\"" + article.toUpperCase() + "\"");
    }
}
