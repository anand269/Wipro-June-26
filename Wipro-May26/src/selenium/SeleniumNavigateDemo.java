package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumNavigateDemo {

	public static void main(String[] args) throws InterruptedException {
		// Automate the Google search
		//open the browser
		//WebDriver driver = new ChromeDriver();//invoking the chrome browser
		//use driver object to enter the url
		//WebDriver driver = new FirefoxDriver();//firefox browser
		//System.setProperty("webdriver.chrome.driver", "path driver");
		WebDriver driver = new FirefoxDriver();//open the MS Edge browser
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://google.com/");
		driver.manage().window().maximize();//to maximize the window
		String title = driver.getTitle();//capture the title
		System.out.println(title);
		//Identify the search and then enter the value in search box
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");
		Thread.sleep(2000);
		//Navigation from Google to selenium dev website
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);//not recommended -> forced sleep
		System.out.println(driver.getTitle());//print the title
		System.out.println(driver.getCurrentUrl());//url on the console
		
		driver.navigate().back();//google.com
		Thread.sleep(2000);//2 sec
		driver.navigate().forward();
		driver.navigate().refresh();
		//close the browser
		Thread.sleep(3000);
		driver.quit();//close the current browser session where as quit() will close the browser sessions 
	}
}
