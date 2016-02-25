package uitests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pageobjects.LoginPage;
import pageobjects.WelcomePage;

//import objectrepository.LoginPage;

public class RegressiontTest {
	protected WebDriver driver;
	String browser = "CHROME";
	@Before
	public void prequi(){
		if(browser.equals("FIREFOX"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "K://downloads//chromedriver_win32//chromedriver.exe");
		    driver= new ChromeDriver();
		}
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@After
	public void teardown() throws IOException{
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    //String currentDir = System.getProperty("user.dir");
		    FileUtils.copyFile(scrFile, new File("K:\\workspace\\git-myprojects\\sel-two\\target\\screenshot" + System.currentTimeMillis() + ".png"));
		driver.close();
		driver.quit();
	}
	@Test
	public void verifyUserSuccessfullLogin(){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUsername()
				 .setPassword()
				 .clickSignIn();
		WebElement element =driver.findElement(By.partialLinkText("SIGN"));
		Assert.assertEquals("Failed:Because the actual is not same as the expected.","SIGN-ON", element.getText());
		
	}
	
	
	

}
