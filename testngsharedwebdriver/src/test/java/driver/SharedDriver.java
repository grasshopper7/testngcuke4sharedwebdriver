package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SharedDriver {

	public SharedDriver() {
		if (DriverFactory.getDriver() == null) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			DriverFactory.addDriver(driver);
		} 
	}
}
