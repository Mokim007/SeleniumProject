import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGettingStart{ 

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startup();
		nextUrl();
		backward();
		forward();
		close();
	}
	static void startup() {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	static void nextUrl() {
		
		driver.get("https://www.google.com");
	}
	static void forward() {
		driver.navigate().forward();
	}
	static void backward() {
		driver.navigate().back();
	}
	static void close() {
		//driver.quit();
	}
}
