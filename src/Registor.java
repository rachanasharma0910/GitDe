import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class Registor 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver","C:\\udemy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://testing-assessment-foh15kew9-edvora.vercel.app/r");
		
	driver.findElement(By.cssSelector("input[autocomplete='username']")).sendKeys("Sandy123");
	driver.findElement(By.cssSelector("input[autocomplete='current-password']")).sendKeys("SAndy123");
	driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
	
    //System.out.println(driver.switchTo().alert().getText());
     
	//driver.switchTo().alert().accept();
	
	
	
	} 

}
 