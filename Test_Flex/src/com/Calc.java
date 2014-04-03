package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Calc {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:/Users/STEST1/Downloads/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		//	WebDriver driver = new ChromeDriver();
	//	 http://www.permadi.com/tutorial/flashjscommand/
		//	 driver.get("http://www.permadi.com/tutorial/flashjscommand/");
		 driver.get("http://www.qtpselenium.com/flashapp/flash2/Calculator.html");
		 
		 FlexWebDriver flashApp = new FlexWebDriver(driver, "Calculator");
	//	 FlexWebDriver flashApp = new FlexWebDriver(driver, "myFlashMovie");
	//	 flashApp.call("Play"); // first number
	//	 Thread.sleep(3000L);
	//	 flashApp.call("StopPlay"); // first number
		 while(true){
			 try {
				String str=flashApp.call("getFlexVisible", "text_1","");
				 if(Boolean.valueOf(str)){
					 break;
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Thread.sleep(1000);
			}
		 }
	
		 
		
		flashApp.call("doFlexType", "text_1", "100"); // first number
   	 	flashApp.call("doFlexClick", "plus",""); // operation
   	 	flashApp.call("doFlexType", "text_2", "15"); // second number
   	 	flashApp.call("doFlexClick", "calc", "");
   	 System.out.println(flashApp.call("getFlexText", "result", ""));
	// System.out.println(flashApp.call("getFlexText", "num1", ""));

	}

}
