package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Suitetestcase {
	@Test
	public void opengoogle() {

		System.setProperty("Wedriver.chrome.driver", "/Users/priyan/eclipse-workspace/testNg/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
		driver.quit();

	}

	@Test
	public void openbing() {

		System.setProperty("Wedriver.chrome.driver", "/Users/priyan/eclipse-workspace/testNg/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
