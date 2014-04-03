package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class MyAppInFlexTest
{
	public static void main(String args[]) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:/Users/STEST1/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 FlexWebDriver flexDriver = new FlexWebDriver(driver,"randomWalk");
	//	 driver.get("http://localhost:8080/RandomWalk_Monkium/randomWalk.html");

		 driver.get("http://localhost:8080/randomWalk/randomWalk.html");
		 driver.manage().window().maximize();
		 Thread.sleep(10000);
		 try {
			 
			flexDriver.call("doFlexClick","RandomWalkRenderer10","");
			Thread.sleep(5000);
			System.out.println("object 1 clicked");
			String str=	flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
			flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
				flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
				flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
			flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
				flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
				flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
				flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
			System.out.println("saif  "+str);
			/*for(int i=0 ; i<4 ;i++)
			{
				System.out.println(i+"into the loop");
				flexDriver.call("doFlexClick","_randomWalk_RandomWalk1","");
			}*/
			
		/*	flexDriver.call("doFlexClick","RandomWalkRenderer12","");
			Thread.sleep(5000);
			System.out.println("object 2 clicked");
			
			flexDriver.call("doFlexClick","RandomWalkRenderer14","");
			Thread.sleep(5000);
			System.out.println("object 3 clicked");
			*/
			
			System.out.println("..........Passed.......");
			
		//	driver.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	      // flashApp.Call("doFlexClick", "secureCheckBox", "");
	}
	
 
}