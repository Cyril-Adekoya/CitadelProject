package StepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdef {

    WebDriver driver;
    @Given("I have lunched the Giftrete Website url")
    public void iHaveLunchedTheGiftreteWebsiteUrl() {
        String browserPath="C:\\Users\\cyril\\Selenium-java\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",browserPath);
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        String baseurl="http://www.giftrete.com/";
        driver.get(baseurl);
    }
    @When("I entered a valid user details")
    public void iEnteredAValidUserDetails() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("olowo@gmail.com");
        System.out.println("Not implemented");
    }

    @Then("I should received a succesfully registration message")
    public void iShouldReceivedASuccesfullyRegistrationMessage() {
        System.out.println("Not implemented");
    }
}


