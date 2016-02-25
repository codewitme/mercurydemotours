package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
	private WebDriver driver;
	public AbstractPage(WebDriver driver ) {
		this.driver=driver;
	}
	protected UnderConstructionPage clickSupport(){
		driver.findElement(By.linkText("SUPPORT")).click();
		return new UnderConstructionPage(driver);
	}
	
	protected UnderConstructionPage clickContact(){
		driver.findElement(By.linkText("CONTACT")).click();
		return new UnderConstructionPage(driver);
	}
	
	protected UnderConstructionPage clickVacations(){
		driver.findElement(By.linkText("Vacations")).click();
		return new UnderConstructionPage(driver);
	}
	
	protected UnderConstructionPage clickDestinations(){
		driver.findElement(By.linkText("Destinations")).click();
		return new UnderConstructionPage(driver);
	}
}
