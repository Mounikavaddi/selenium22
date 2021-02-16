package launchers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasseTest {
	public static WebDriver driver;
	public static String path = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	
	public static void init() throws Exception {
		 fis = new FileInputStream(path +"//dataproperties");
		p=new Properties();
		p.load(fis);
	}
	public static void Openbrowser(String browser) {
		if(p.getProperty(browser).equals("chrome"))
		{
			System.setProperty("Webdriver.chrome.driver", "F:\\library\\chromedriver_win32\\chromedriver.exe");
			// driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("Webdriver.gecko.driver", "F:\\library\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new FirefoxDriver();
		}
	}
	public static void URL(String URL)
	{
		driver.get(p.getProperty(URL));
	}

}
