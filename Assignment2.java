package DevopsAssignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Assignment2 {
	WebDriver driver;
	@Parameters({"bname"})
  @Test
  
  public void testGrid(String bname) throws MalformedURLException, InterruptedException {
		if (bname. equalsIgnoreCase ("chrome")) {
			ChromeOptions options = new ChromeOptions();
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/"),options);
			System.out.println("connection with chrome is done");
		}
		else if (bname.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/"),options);
			System.out.println("connection with firefox is done");
		}
		else if (bname.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			
			driver = new RemoteWebDriver(new URL("http://localhost:4444/"),options);
			System.out.println("connection with edge is done");
		
		 }
		System.out.println("Remote connection is done");
		Thread.sleep(4000);
		driver.get("https://www.amazon.in");
		
		Thread.sleep(10000);
		System.out.println("Parallel execution of application is done");
		driver.quit();
	
}
