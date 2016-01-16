package uitests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
		System.out.println("AfterTest");
		driver.close();
		driver.quit();
	}
	@Test
	public void TestCase1(){
		driver.findElement(By.name("userName")).sendKeys("satya");
		driver.findElement(By.name("password")).sendKeys("satya");
		driver.findElement(By.name("login")).click();
	}
	@Test
	public void TestCase2(){
		System.out.println("TestCase2");
		}
	@Test
	public void TestCase3(){
		System.out.println("TestCase3");
	}
	@Test
	public void TestCase4(){
		System.out.println("TestCase4");
	}

}
