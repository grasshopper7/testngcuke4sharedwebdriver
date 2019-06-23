package driver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SharedDriver {

	public SharedDriver() {
		if (DriverFactory.getDriver() == null) {
			WebDriverManager.chromedriver().setup();
			DriverFactory.addDriver(new ChromeDriver());
		} 
	}
}
