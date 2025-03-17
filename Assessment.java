package unitAssessment;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("ramanandks886@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("Admin@1234");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"sidebar\"]/form/div[1]/input")).sendKeys("ZARA COAT 3" + Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"products\"]/div[1]/div[2]/div[1]/div/div/button[2]")).click();
		
	}

}
