package baseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EnrollNowApplicationPage;
import pages.LogIn;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {

	public static WebDriver driver;
	Configuration configuration;
	public static LogIn logIn;
	public static EnrollNowApplicationPage enrollNowApplicationPage;

	public void setUp() {
		configuration = new Configuration();
		initDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configuration.getProperties(URL));
		long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(configuration.getProperties(IMPLICITY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClass(driver);
	}

	public void initDriver() {
		String browserName = configuration.getProperties(BROWSER);
		switch (browserName) {
		case EDGE:
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case CHROME:
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\skelt\\eclipse-workspace\\BDD_EnthrallIt_frameWork\\driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

			break;
		}

	}

	public void initClass(WebDriver driver) {
		logIn = new LogIn(driver);
		enrollNowApplicationPage = new EnrollNowApplicationPage(driver);
	}

	public void tearUp() {
		driver.quit();
	}

}
