package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_After_suit {
	WebDriver driver;
	long Starttime;
	long Endtime;

	@BeforeSuite
	public void launchbrowser() {
		Starttime = System.currentTimeMillis();
		System.setProperty("Wedriver.chrome.driver", "/Users/priyan/eclipse-workspace/testNg/chromedriver");
		driver = new ChromeDriver();

	}

	@Test
	public void googleopen() {
		/*
		 * long Starttime = System.currentTimeMillis();
		 * System.setProperty("Wedriver.chrome.driver",
		 * "/Users/priyan/eclipse-workspace/testNg/chromedriver"); WebDriver driver =
		 * new ChromeDriver();
		 */
		driver.get("https://www.google.co.in");
		/*
		 * driver.quit(); long Endtime = System.currentTimeMillis(); long totaltime =
		 * Endtime-Starttime; System.out.println("Total Time Taken"+totaltime);
		 */

	}

	@Test
	public void yahooopen() {
		/*
		 * long Starttime = System.currentTimeMillis();
		 * System.setProperty("Wedriver.chrome.driver", "chromedriver"); WebDriver
		 * driver = new ChromeDriver();
		 */
		driver.get("https://www.yahoo.com");
		/*
		 * driver.quit(); long Endtime = System.currentTimeMillis(); long totaltime =
		 * Endtime-Starttime; System.out.println("Total Time Taken"+totaltime);
		 */

	}

	@Test
	public void bingopen() {
		/*
		 * long Starttime = System.currentTimeMillis();
		 * System.setProperty("Wedriver.chrome.driver", "chromedriver"); WebDriver
		 * driver = new ChromeDriver();
		 */
		driver.get("https://www.bing.com");
		/*
		 * driver.quit(); long Endtime = System.currentTimeMillis(); long totaltime =
		 * Endtime-Starttime; System.out.println("Total Time Taken"+totaltime);
		 */

	}

	@AfterSuite
	public void closebrowser() {
		driver.quit();
		Endtime = System.currentTimeMillis();
		long totaltime = Endtime - Starttime;
		System.out.println("Total Time Taken" + totaltime);

	}

}
