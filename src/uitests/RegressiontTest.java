package uitests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegressiontTest {
	FirefoxDriver driver;
	@Before
	public void prequi(){
	    driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@After
	public void teardown(){
		driver.close();
		driver.quit();
	}
	@Test
	public void TestCase1(){
		driver.findElement(By.name("userName")).sendKeys("satya");
		driver.findElement(By.name("password")).sendKeys("satya1");
		driver.findElement(By.name("login")).click();
		WebElement element =driver.findElement(By.linkText("SIGN-ON"));
		Assert.assertEquals("Failed:Because the actual is not same as the expected.","SIGN-OFF", element.getText());
		
	}
	

}
