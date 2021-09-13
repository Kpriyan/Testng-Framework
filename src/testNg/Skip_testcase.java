package testNg;

import org.testng.annotations.Test;

public class Skip_testcase {
	
	@Test(priority = 0)
	public void StartTheCar() {
		System.out.println("Start The Car");
	}

	@Test(priority = 1)
	public void FirstGear() {
		System.out.println("first gear");
	}
	
	@Test(priority = 6,enabled = false)
	public void TurnMusicON() {
		System.out.println("Music Turn ON");
	}
	
	@Test(priority = 2)
	public void secondgear() {
		System.out.println("second gear");
	}
	@Test(priority = 3)
	public void ThirdGear() {
		System.out.println("third gear");
	}
	@Test(priority = 4)
	public void FourthGear() {
		System.out.println("fourth gear");
	}
	@Test(priority = 5)
	public void StopTheCar() {
		System.out.println("stop the car");
	}

}
