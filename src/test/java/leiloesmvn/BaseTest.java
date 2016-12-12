package leiloesmvn;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	protected ChromeDriver driver;

	@After
	public void encerra() {
		driver.close();
	}

	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "/home/victor/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
}
