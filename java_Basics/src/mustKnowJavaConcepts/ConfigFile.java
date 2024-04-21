package mustKnowJavaConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConfigFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = null;
		System.out.println("Kindly type the Browser to start. 'chrome' 'firefox' 'edge' ");
		Scanner scan=new Scanner(System.in);
		String browser = scan.next();
		scan.close();
		FileInputStream stream=new FileInputStream("src/config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		String chromepath = properties.getProperty("chromeDriverPath");
		String firefoxpath = properties.getProperty("geckoDriverPath");
		String edgepath = properties.getProperty("edgeDriverPath");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxpath);
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", edgepath);
			driver = new EdgeDriver();
		}	
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.quit();

	}

}
