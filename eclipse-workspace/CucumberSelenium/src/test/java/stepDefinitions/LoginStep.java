package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends Base {
	

	
	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		driver.get("https://www.google.com/");
	
		
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
	System.out.println("user_opens_URL(String url)");
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String password) {
		System.out.println("user_enters_Email_as_and_Password_as(String email, String password)");
	}

	@When("Click on Login")
	public void click_on_Login() {
		
	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String exptitle) throws InterruptedException {
	    
		
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		
	}

	@Then("close browser")
	public void close_browser() {
		
	}
	
}