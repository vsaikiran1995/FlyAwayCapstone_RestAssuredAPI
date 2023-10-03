package stepDef;

import java.util.List;

import org.openqa.selenium.WebDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.LoginPage;

public class registerUserStepDef {
	
	LoginPage lp;
    WebDriver driver=Hooks.driver;
	RequestSpecification request;
	Response response;
	

	@Given("As a user I navigate to new user register webpage")
	public void as_a_user_I_navigate_to_new_user_register_webpage() {
		request = RestAssured.given().baseUri("http://localhost:9090/FlyAway");
	}

	@When("As a user I will register using following details")
	public void as_a_user_I_will_register_using_following_details(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList(String.class);
		response = request.when().contentType(ContentType.TEXT).post("/signupaction?email_id=" + list.get(0) + "&pwd=" + list.get(1)
				+ "&pwd2=" + list.get(2) + "&name=" + list.get(3) + "&address=" + list.get(4) + "&city=" + list.get(5));

		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asString());
	}

	@Given("As a user I navigate to flyaway login page")
	public void as_a_user_I_navigate_to_flyaway_login_page() {
		 lp = new LoginPage(driver);
		 driver.get("http://localhost:9090/FlyAway/login");
	}

	
	@When("As a user I will login username as {string} and password as {string}")
	public void as_a_user_I_will_login_username_as_and_password_as(String Email_Id, String Pwd) {
		lp = new LoginPage(driver);
		lp.getUsername(Email_Id);
		lp.getPwd(Pwd);
		lp.getLoginBtn();
	}

	@Then("Validate logged in successfully")
	public void validate_logged_in_successfully() {
		lp = new LoginPage(driver);
		lp.getLogoutBtnVal();
	}

}
