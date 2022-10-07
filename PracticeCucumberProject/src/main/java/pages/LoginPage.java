package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	WebDriver driver;
	
	
	public void openLoginpage() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
	public String verifytitle() {
		 String actualTitle = driver.getTitle();
		 System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("fhjsdhfhfnbfFHEW");
		driver.findElement(By.id("pass")).sendKeys("adfgdsgfdbjfbsjfg");
	}
	
	public void signin() {
		driver.findElement(By.name("login")).click();
	}
	
	public String readError() {
		
		 String actualError=driver.findElement(By.className("_9ay7")).getText();
		System.out.println(actualError);
		return actualError;
	}
	
	public void closebrowser() {
		driver.quit();
	}

}
