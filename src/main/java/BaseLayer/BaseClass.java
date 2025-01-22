package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	protected static WebDriver driver;
	
	private static ThreadLocal<WebDriver> td = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		driver = td.get();
		return driver;
	}
	
	public static void initialization()
	{
		WebDriver localDriver = new ChromeDriver();
		
		td.set(localDriver);
		
		driver = BaseClass.getDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://ui.cogmento.com/");
	}
}
