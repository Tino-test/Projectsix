package org.testjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LibGlobal {

	public static WebDriver driver;
	
	public static WebDriver launchchromebrowser() {
	     System.setProperty("Webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\Testw\\Chromedriver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         return driver;
	}
	
	public static WebDriver launchfirefoxbrowser() {
            System.setProperty("Webdriver.gecko.driver", "C:\\Users\\DELL\\eclipse-workspace\\Testw\\Firefoxdriver\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            return driver;
	}
	public static WebDriver launchEdgebrowser() {
		
           System.setProperty("Webdriver.edge.driver", "C:\\Users\\DELL\\eclipse-workspace\\Testw\\Edgedriver\\msedgedriver.exe");
           WebDriver driver = new EdgeDriver();
           return driver;
	}
	public void loadUrl(String url) {
	
           driver.get(url);
	}
	public  void maxbrowser() {
		
		driver.manage().window().maximize();
		
	}
	
	public   void fill(WebElement element,String text) {
		
		element.sendKeys(text);
	}
	
	public void buttonclick(WebElement element) {
	
         element.click();
	}
	
	public  void pagetitle() {
	
        String title= driver.getTitle();
        System.out.println(title);
	}
	public void pageurl() {
		
        String pgurl=driver.getCurrentUrl();
        System.out.println(pgurl);
	}
	public  void clear(WebElement element) {
		element.clear();
	}
	public  void performdraganddrop(WebElement from,WebElement to) {
		
		Actions a = new Actions(driver);
        a.dragAndDrop(from, to).perform();
	}

	public  void closebrowser() {
		
          driver.quit();
	}
	


	}

