import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/r");
		
	driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("kandy123");
	driver.findElement(By.cssSelector("input[autocomplete='current-password']")).sendKeys("KAndy123");
    driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
    System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept();
	 driver.findElement(By.className("css-1mh6pc0")).click();
	 driver.findElement(By.name("mobileNumber")).sendKeys("213456789");


	}

}
