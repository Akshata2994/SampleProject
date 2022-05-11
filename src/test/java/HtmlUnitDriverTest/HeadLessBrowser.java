package HtmlUnitDriverTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadLessBrowser  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.setHeadless(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		// get the title of the page
		System.out.println("Page title is - " + driver.getTitle());

	}

}
