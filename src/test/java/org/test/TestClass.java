package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	public static void main(String[]args) {
		//to configure the browser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("iphone 13 pro",Keys.ENTER);
		
		List<WebElement> iphone13pro = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal'][1]"));
		System.out.println("iphone 13 pro");
		
		for(WebElement iphonespaceblack : iphone13pro ) {
			String name = iphonespaceblack.getText();
			System.out.println(name);
		}
		
	}

	
}



