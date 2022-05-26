package Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Config.PropertiesFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleCode {
	
	static WebDriver driver;
    
	public static String browser;
    
	public static void main(String args[]) throws InterruptedException
	{
		//BrowserName();
		PropertiesFile.readPropertiesFile();
		
		BrowserSetup();
	    Run();
	}


public static void BrowserName()
{
  browser = "Chrome";
	//browser is chrome
  
}

public static void BrowserSetup()
{
	if(browser.contains("Chrome"))
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
}

public static void Run() throws InterruptedException
{
	driver.get("https://google.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
}

}
