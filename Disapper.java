package assignmentweek4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disapper {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/disapper.html");


		WebElement disapperText = driver.findElement(By.xpath("//button[@id='btn']//b"));
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(disapperText));
		
		boolean displayed = driver.findElement(By.xpath("//strong[contains(text(),'I know')]")).isDisplayed();
		
		if (displayed) {
			System.out.println("The text displayed");
		}

	}

}
