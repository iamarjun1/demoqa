package QAtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqalogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		
				
//Thread.sleep(5000);

		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("Arjun001@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Dwarka");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Dwarka");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
	}

}
