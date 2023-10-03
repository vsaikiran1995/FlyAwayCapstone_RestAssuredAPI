package stepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	public static WebDriver driver;
	
	@Before
	public void setup() {
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("116");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
	}
    
	
	@After
	public void teardown() {
		driver.quit();
	}

}
