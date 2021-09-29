package com.practice.com.practice.maven.eclipse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	public static void main(String[] args) {
		//chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("Https://www.google.com");
	}
}
