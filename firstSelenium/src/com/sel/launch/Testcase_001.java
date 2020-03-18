package com.sel.launch;

import org.openqa.selenium.By;

//import org.openqa.selenium.By;

public class Testcase_001 extends Baselaunch  {

	public static void main(String[] args) throws Exception  {
		init();
		launch("chromebrowser");
		navigate("amazonurl");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//driver.manage().deleteAllCookies();
		
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		//driver.findElement(By.linkText("Spring shoes")).click();
		System.out.println("Just started");
		
		
		driver.findElement(By.linkText("Shop customer-loved fashion")).click();
	}

}
