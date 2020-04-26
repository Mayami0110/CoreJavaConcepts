import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
	public static String strAbsolutepath = new File("").getAbsolutePath() +"\\";

	private static DriverInit instanceDriver = null;
	
	private WebDriver driver;
	
	private DriverInit() {
		
		
	}
	
	public WebDriver openBrowser() {
		
		System.setProperty("webdriver.chrome.silentOutput","true");
		/*	DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(capabilityName, value);*/
			
			
			System.setProperty("webdriver.chrome.driver",
					strAbsolutepath + "Resources\\chromedriver2.exe");
			 driver = new ChromeDriver();
			 return driver;
	}
	
	public static DriverInit getInstance() {
		
		if(instanceDriver==null)
		{
			instanceDriver = new DriverInit();
		}
		return instanceDriver;
		
		
		
	}

}
