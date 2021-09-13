package testNg;

import org.testng.annotations.Test;

public class Group_Suite_testcase {
	@Test(groups = "IphoneSeries")
	public void IphoneSeries() {
		System.out.println("Apple Iphone Series");
	}
	@Test(groups = "IphoneSeries")
	public void IphoneProSeries() {
		System.out.println("Apple Iphone Pro Series");
	}
	@Test(groups = "RedMiSeries")
	public void RedMiSeries() {
		System.out.println("RedMi Series");
	}
	@Test(groups = "RedMiSeries")
	public void RedMiProSeries() {
		System.out.println("RedMi Pro Series");
	}
	@Test(groups = "SamsungSeries")
	public void SamsungSeries() {
		System.out.println("Samsung Series");
	}
	@Test(groups = "SamsungSeries")
	public void SamsungProSeries() {
		System.out.println("Samsung Pro Series");
	}

}
