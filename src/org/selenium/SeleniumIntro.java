package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
	public static void main(String[] args) {
		// configure the browser

		System.setProperty("webdriver.chrome.driver",
				"E:\\Sarath\\Selenium Class\\OCTOBER\\03\\Selenium Intro Class\\Projects\\SeleniumIntro\\Driver\\chromedriver.exe");

		// create object for this

		WebDriver driver = new ChromeDriver();

		// to launch the browser
		driver.get("https://www.amazon.in/");

		// browser maximize panna intha key epovum follow pannanum

		driver.manage().window().maximize();
	}

}
