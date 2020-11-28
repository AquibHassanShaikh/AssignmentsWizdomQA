package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


///Write syntax to launch https://www.wizdomqa.com/  in chrome Browser
public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\driver1\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.wizdomqa.com/");

		driver.findElement(By.cssSelector("#comp-kayhqoh2link")).click();

		Thread.sleep(5000);

		driver.findElement(By.cssSelector("#comp-kasf86zcinput")).sendKeys("shaikh.aquib51@gmail.com");

		driver.findElement(By.xpath("//input[@id='comp-kasf86zd2input']")).sendKeys("Passw0rd11");

		driver.findElement(By.cssSelector("#comp-kasf86ztlabel")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
