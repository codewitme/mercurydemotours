package pageobjects;

import org.openqa.selenium.WebDriver;

import uitests.RegressiontTest;

public class WelcomePage {

	private WebDriver driver=null;
	public WelcomePage(WebDriver driver) {
		String url = driver.getCurrentUrl();
		if(!url.contains("mercuryreservation.php"))
		{
			System.out.println("Failed:This is not the Welcome page");
		}
		this.driver=driver;
	}


	
}
