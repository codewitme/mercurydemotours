package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uitests.RegressiontTest;

public class LoginPage  {

	private WebDriver driver;
	private By username = By.name("userName");
	private By password = By.name("password");
	private By signin = By.name("login");
	
	
	public LoginPage(WebDriver driver){
		String url = driver.getCurrentUrl();
		if(!url.contains("newtours.demoaut.com"))
		{
			System.out.println("Failed:This is not the Login page");
		}
		this.driver=driver;
	}

	public LoginPage setUsername(){
		WebElement usernameElement = driver.findElement(username);
		usernameElement.sendKeys("satya");
		return this;
	}
	
	public LoginPage setPassword(){
		WebElement passwordElement = driver.findElement(password);
		passwordElement.sendKeys("satya");	
		return this;
	}

	public WelcomePage clickSignIn(){
		WebElement signinElement = driver.findElement(signin);
		signinElement.click();
		return new WelcomePage(driver);
	}
}
