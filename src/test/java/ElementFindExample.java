import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementFindExample {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startup();
	}

	static void startup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Jdeo/Desktop/Index.html");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//String text=driver.findElement(By.xpath("/html/body/p")).getText();
		String text=driver.findElement(By.tagName("p")).getText();
		System.out.println(text);
	}
	//html/body/p
}
