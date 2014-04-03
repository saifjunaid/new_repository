package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.FlashSelenium;
import com.thoughtworks.selenium.FlexUISelenium;
import com.thoughtworks.selenium.Selenium;

public class Test_Main1 {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	static Selenium selenium;
	private static FlexUISelenium flexUITester;
	private static FlashSelenium flashApp;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://www.qtpselenium.com");
		selenium.start();
		selenium.open("/flashapp/flash2/Calculator.html");
		flexUITester = new FlexUISelenium(selenium, "Calculator");
		flashApp = new FlashSelenium(selenium, "Calculator");	
	///	flexUITester.waitUntilLoaded();
		
		//	WebDriver driver = new ChromeDriver();
	//	 http://www.permadi.com/tutorial/flashjscommand/
		//	 driver.get("http://www.permadi.com/tutorial/flashjscommand/");
		/*while(selenium.isElementPresent("text_1"))
			Thread.sleep(1000);*/
		 
		String str="false";
		while (!Boolean.valueOf(str)){
			try {

				str= flashApp.call("getFlexVisible", "text_1","");
				System.out.println(str);
			} catch (Exception e) {
				// TODO Auto-generated catch block

			}
		}
		/*while(!(flashApp.PercentLoaded()==100) ){
			continue;
		}*/
		/* while(true){
			 try {
				boolean str=selenium.isElementPresent("text_1");
				 if(Boolean.valueOf(str)){
					 break;
				 }
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Thread.sleep(1000);
			}
		 }*/
	
//		 FlexWebDriver flashApp = new FlexWebDriver(driver, "Calculator");
	//	 FlexWebDriver flashApp = new FlexWebDriver(driver, "myFlashMovie");
	//	 flashApp.call("Play"); // first number
	//	 Thread.sleep(3000L);
	//	 flashApp.call("StopPlay"); // first number
		//	flashApp.call("doFlexClick", "plus",""); // operation
	   	// 	flashApp.call("doFlexType", "text_2", "15"); // second number
	  // 	 	flashApp.call("doFlexClick", "calc", "");

		
		flashApp.call("doFlexType", "text_1", "100"); // first number
 		flashApp.call("doFlexClick", "plus",""); // operation
 	 	flashApp.call("doFlexType", "text_2", "15"); // second number
 		flashApp.call("doFlexClick", "calc", "");
 //	 System.out.println(flashApp.call("getFlexText", "result", ""));
	// System.out.println(flashApp.call("getFlexText", "num1", ""));

	
	}

}
